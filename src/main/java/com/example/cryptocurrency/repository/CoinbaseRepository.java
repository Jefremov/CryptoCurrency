package com.example.cryptocurrency.repository;

import com.example.cryptocurrency.entity.CoinbasePair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinbaseRepository extends JpaRepository<CoinbasePair, Long> {

  //  public String getAllBy();

    public List<CoinbasePair> findAll();



}