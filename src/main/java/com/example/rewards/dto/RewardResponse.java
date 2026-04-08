
package com.example.rewards.dto;

import java.util.List;


public class RewardResponse {
  private Long customerId;
  private List<TranscationRewardDTO> transcationRewardDTOList;
  private int totalPoints;

  public RewardResponse(Long customerId, List<TranscationRewardDTO> transcationRewardDTOList, int totalPoints) {
    this.customerId = customerId;
    this.transcationRewardDTOList = transcationRewardDTOList;
    this.totalPoints = totalPoints;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public List<TranscationRewardDTO> getTranscationRewardDTOList() {
    return transcationRewardDTOList;
  }

  public int getTotalPoints() {
    return totalPoints;
  }
}

