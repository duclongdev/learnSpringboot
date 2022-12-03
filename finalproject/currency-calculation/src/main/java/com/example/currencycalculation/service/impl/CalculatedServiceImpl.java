package com.example.currencycalculation.service.impl;

import com.example.currencycalculation.facade.CurrencyExchangeProxy;
import com.example.currencycalculation.model.CalculatedAmount;
import com.example.currencycalculation.service.CalculatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculatedServiceImpl implements CalculatedService {
    @Autowired
    private RestTemplate restTemplate;
   @Autowired
   private Environment environment;
   @Autowired
   private CurrencyExchangeProxy proxy;
    @Override
    public CalculatedAmount Calculated(String from, String to, Integer amount) {
        String temp = restTemplate
                .getForObject("http://CURRENCY-EXCHANGE-SERVICE/api/currencyExchange/" + from, String.class);
        Integer price = Integer.valueOf(temp);
        Integer total = CalculateResult(price, amount);
        System.out.println("port: " + environment.getProperty("local.server.port"));
        CalculatedAmount calculatedAmount = new CalculatedAmount(price, amount, total, environment.getProperty("local.server.port"));
        return calculatedAmount;
    }
    public CalculatedAmount Calculated2(String from, String to, Integer amount){
        String price = proxy.retrieveExchangeValue(from);
        Integer TranferPrice = Integer.valueOf(price);
        CalculatedAmount calculatedAmount = new CalculatedAmount(Integer.valueOf(price), amount, CalculateResult(TranferPrice, amount),
                environment.getProperty("local.server.port"));
        return  calculatedAmount;
    }
    private Integer CalculateResult(Integer price, Integer amount) {
        return price * amount;
    }

}
