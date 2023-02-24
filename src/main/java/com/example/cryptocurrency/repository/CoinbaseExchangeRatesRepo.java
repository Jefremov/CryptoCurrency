package com.example.cryptocurrency.repository;

import com.example.cryptocurrency.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinbaseExchangeRatesRepo extends JpaRepository<ExchangeRate, Long> {

    @Override
    void deleteAll();

    void removeByCurrency(String currency);


    boolean existsByCurrency(String currency);




    List<ExchangeRate> findAllByCurrency(String currency);
//
//    BigDecimal getByAmountOrderByPrice();


}
