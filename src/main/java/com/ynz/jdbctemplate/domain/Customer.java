package com.ynz.jdbctemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private Long id;

    private String name;
    private Address address;

    public static Customer of(String name, Address address) {
        return new Customer(null, name, address);
    }

}
