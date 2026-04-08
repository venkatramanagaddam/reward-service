
package com.example.rewards.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public class TransactionRequest {

  @NotNull
  private Long customerId;

  @Positive
  private double amount;

  @NotNull
  private LocalDate transactionDate;

  public Long getCustomerId() { return customerId; }
  public void setCustomerId(Long customerId) { this.customerId = customerId; }

  public double getAmount() { return amount; }
  public void setAmount(double amount) { this.amount = amount; }

  public LocalDate getTransactionDate() { return transactionDate; }
  public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }
}
