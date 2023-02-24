package com.example.cryptocurrency;

import com.example.cryptocurrency.service.coinbase.CoinbaseRatesInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableZuulProxy
public class CryptoCurrencyApplication {

    @Autowired
    CoinbaseRatesInit coinbaseRatesInit;

    public static void main(String[] args) {
        SpringApplication.run(CryptoCurrencyApplication.class, args);
    }

}
