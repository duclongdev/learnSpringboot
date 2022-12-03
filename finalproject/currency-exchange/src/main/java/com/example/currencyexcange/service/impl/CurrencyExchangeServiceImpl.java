package com.example.currencyexcange.service.impl;


import com.example.currencyexcange.repository.CurrencyExchangeRepo;
import com.example.currencyexcange.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    @Resource
    private CurrencyExchangeRepo currencyExchangeRepo;
    @Override
    public String getByForeign(String type) {
        return currencyExchangeRepo.getByForeign(type);
    }
}
