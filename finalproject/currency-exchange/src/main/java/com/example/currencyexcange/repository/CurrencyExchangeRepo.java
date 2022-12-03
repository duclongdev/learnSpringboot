package com.example.currencyexcange.repository;

import com.example.currencyexcange.model.CurrencyExchangeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CurrencyExchangeRepo {

    @Select("select conversion_multiple from exchange_value where currency_from = #{type}")
    String getByForeign(String type);
}
