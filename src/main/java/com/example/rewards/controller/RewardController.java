
package com.example.rewards.controller;

import com.example.rewards.dto.*;
import com.example.rewards.entity.Transaction;
import com.example.rewards.repository.TransactionRepository;
import com.example.rewards.service.RewardService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {

  private final RewardService service;
  private final TransactionRepository repo;

  public RewardController(RewardService service, TransactionRepository repo) {
    this.service = service;
    this.repo = repo;
  }

  @GetMapping("/{customerId}")
  public RewardResponse get(@PathVariable Long customerId) {
    return service.calculate(customerId);
  }

  @PostMapping("/transaction")
  public String add(@Valid @RequestBody TransactionRequest req) {
    repo.save(new Transaction(null, req.getCustomerId(), req.getAmount(), req.getTransactionDate()));
    return "Transaction saved";
  }
}
