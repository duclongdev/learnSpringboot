package com.example.currencycalculation.service;

import com.example.currencycalculation.model.CalculatedAmount;

public interface CalculatedService {
    CalculatedAmount Calculated(String from, String to, Integer amount);
    CalculatedAmount Calculated2(String from, String to, Integer amount);
}
