package com.example.currencyexcange.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CurrencyExchangeDTO {
    Integer id;
    String currency_from;
    String currency_to;
    BigDecimal conversion_multiple;
    Integer port;
}
