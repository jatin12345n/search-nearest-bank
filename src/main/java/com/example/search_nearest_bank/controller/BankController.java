package com.example.search_nearest_bank.controller;

import com.example.search_nearest_bank.model.Bank;
import com.example.search_nearest_bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BankController {

    @Autowired
    BankService service;

    @PostMapping("/adding-bank-info")
    public String add(@RequestBody Bank bank) {
        return service.add(bank);
    }

    @GetMapping("/get-all-info")
    public List<Bank> getAllBankDetails() {
        return service.getAllBankDetails();
    }

    @GetMapping("/get-info/{id}")
    public Optional<Bank> getBankById(@PathVariable Long id) {
        return service.getBankById(id);
    }

    @GetMapping("/bankName/{bankName}")
    public List<Bank> getBankByName(@PathVariable String bankName) {
        return service.getBankByName(bankName);
    }

    @GetMapping("/get-by-city/{city}")
    public List<Bank> getBankByCity(@PathVariable String city) {
        return service.getBankByCity(city);
    }

    @GetMapping("/get-by-pinCode/{pinCode}")
    public List<Bank> getBankByPinCode(@PathVariable String pinCode) {
        return service.getBankByPinCode(pinCode);
    }

    @GetMapping("/get-by-state/{state}")
    public List<Bank> getBankByState(@PathVariable String state) {
        return service.getBankByState(state);
    }
}
