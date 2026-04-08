package com.example.rewards.dto;

public class TranscationRewardDTO {
    private double amount;
    private int points;
    private String month;

    public TranscationRewardDTO(double amount, int points, String month) {
        this.amount = amount;
        this.points = points;
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public int getPoints() {
        return points;
    }

    public String getMonth() {
        return month;
    }
}
