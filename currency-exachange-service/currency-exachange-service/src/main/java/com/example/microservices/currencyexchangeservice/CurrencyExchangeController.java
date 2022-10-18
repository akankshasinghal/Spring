package com.example.microservices.currencyexchangeservice;



import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepository curRepo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to){

       // CurrencyExchange currencyExchange=new CurrencyExchange(1000L,from,to,BigDecimal.valueOf(50));
       CurrencyExchange currencyEx=curRepo.findByFromAndTo(from,to);
       String port= environment.getRequiredProperty("local.server.port");
        currencyEx.setEnvir(port);
        return currencyEx;
    }

    
    
}
