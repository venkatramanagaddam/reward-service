
package com.example.rewards.service;

import com.example.rewards.dto.RewardResponse;
import com.example.rewards.dto.TranscationRewardDTO;
import com.example.rewards.entity.Transaction;
import com.example.rewards.repository.TransactionRepository;
import com.example.rewards.util.RewardUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class RewardService {

  private final TransactionRepository repo;

  public RewardService(TransactionRepository repo) {
    this.repo = repo;
  }

  public RewardResponse calculate(Long customerId) {

    LocalDate end = LocalDate.now();
    LocalDate start = end.minusMonths(3);

    List<Transaction> txns = repo.findByCustomerIdAndTransactionDateBetween(customerId, start, end);

    if (txns.isEmpty()) throw new RuntimeException("No transactions found");

    //Map<String, Integer> monthly = new HashMap<>();
    List<TranscationRewardDTO> list = new ArrayList<>();
    int total = 0;

    for (Transaction t : txns) {
      int pts = RewardUtil.calculate(t.getAmount());
      String month = t.getTransactionDate().getMonth().toString();

      //monthly.put(month, monthly.getOrDefault(month, 0) + pts);
      list.add(new TranscationRewardDTO(t.getAmount(),pts,month));
      total += pts;
    }

    return new RewardResponse(customerId, list, total);
  }
}
