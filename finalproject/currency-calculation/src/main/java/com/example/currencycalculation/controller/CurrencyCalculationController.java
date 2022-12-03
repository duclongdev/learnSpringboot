package com.example.currencycalculation.controller;


import com.example.currencycalculation.model.CalculatedAmount;
import com.example.currencycalculation.service.CalculatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/calculated/")
public class CurrencyCalculationController {
    @Autowired
    private CalculatedService calculatedService;
    @GetMapping("from/{from}/to/{to}/amount/{amount}")
    public CalculatedAmount result(@PathVariable String from, @PathVariable String to, @PathVariable Integer amount){
        return calculatedService.Calculated2(from, to, amount);
    }
}
