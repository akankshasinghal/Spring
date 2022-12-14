package com.example.microservices.currencyconversionservice;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
   
    @Autowired
    private CurrencyExchangeProxy proxy ;
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion CalculateCurrencyConversionfeign(
        @PathVariable String from,
        @PathVariable String to,
        @PathVariable BigDecimal quantity
    )
    {
            CurrencyConversion currencyconversion = proxy.retrieveExchangeValue(from, to);
            return new CurrencyConversion(currencyconversion.getId(),from,to,quantity,currencyconversion.getConversionMultiple(),BigDecimal.ONE, currencyconversion.getEnvir());
    }
}
