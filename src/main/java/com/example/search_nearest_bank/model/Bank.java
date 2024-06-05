package com.example.search_nearest_bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "SearchNearestBank")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue
    Long id;
    public String bankName;
    String address;
    String city;
    String pinCode;
    String state;

}
