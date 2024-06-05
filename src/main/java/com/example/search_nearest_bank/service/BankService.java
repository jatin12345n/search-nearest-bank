package com.example.search_nearest_bank.service;

import com.example.search_nearest_bank.model.Bank;
import com.example.search_nearest_bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    @Autowired
    BankRepository repository;

    public String add(Bank bank) {
        repository.save(bank);
        return "Successfully added to database";
    }

    public List<Bank> getAllBankDetails() {
        return repository.findAll();
    }

    public Optional<Bank> getBankById(Long id) {
        return repository.findById(id);

    }

    public List<Bank> getBankByName(String bankName) {
        return repository.findByBankName(bankName);
    }

    public List<Bank> getBankByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Bank> getBankByPinCode(String pinCode) {
        return repository.findByPinCode(pinCode);
    }

    public List<Bank> getBankByState(String state) {
        return repository.findByState(state);
    }
}
