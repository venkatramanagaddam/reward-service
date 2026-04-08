
package com.example.rewards.config;

import com.example.rewards.entity.Transaction;
import com.example.rewards.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataLoader {

  @Bean
  CommandLineRunner load(TransactionRepository repo) {
    return args -> {
      repo.save(new Transaction(null,1L,120, LocalDate.now().minusDays(10)));
      repo.save(new Transaction(null,1L,80, LocalDate.now().minusDays(20)));
      repo.save(new Transaction(null,1L,200, LocalDate.now().minusDays(40)));
    };
  }
}
