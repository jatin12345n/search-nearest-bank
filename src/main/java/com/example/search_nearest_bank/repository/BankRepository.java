package com.example.search_nearest_bank.repository;

import com.example.search_nearest_bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {


    Optional<Bank> findById(Long id);

    @Query(value = "SELECT * FROM SEARCH_NEAREST_BANK WHERE BANK_NAME=:bankName", nativeQuery = true)
     List<Bank> findByBankName(@Param("bankName") String bankName);

    @Query(value = "SELECT * FROM SEARCH_NEAREST_BANK WHERE CITY=:city", nativeQuery = true)
    List<Bank> findByCity(@Param("city") String city);

    @Query(value = "SELECT * FROM SEARCH_NEAREST_BANK WHERE PIN_CODE=:pinCode", nativeQuery = true)
    List<Bank> findByPinCode(@Param("pinCode") String pinCode);

    @Query(value = "SELECT * FROM SEARCH_NEAREST_BANK WHERE STATE=:state", nativeQuery = true)
    List<Bank> findByState(@Param("state") String state);


}
