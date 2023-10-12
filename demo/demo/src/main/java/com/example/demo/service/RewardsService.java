package com.example.demo.service;

import com.example.demo.entity.Transaction;
import com.example.demo.model.Rewards;

public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
