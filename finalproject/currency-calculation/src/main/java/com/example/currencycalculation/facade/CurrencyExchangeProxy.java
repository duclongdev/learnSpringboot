package com.example.currencycalculation.facade;
import com.example.currencycalculation.model.CalculatedAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeProxy {
    @GetMapping("api/currencyExchange/{from}")
    String retrieveExchangeValue (@PathVariable("from") String from);
}
