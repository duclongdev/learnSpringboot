package com.example.currencycalculation.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CalculatedAmount {
    private Integer conversionMultiple;
    private Integer quantity;
    private Integer totalCalculatedAmount;
    private String port;
}
