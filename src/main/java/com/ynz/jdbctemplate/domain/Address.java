package com.ynz.jdbctemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    private Long id;
    private String addressLine;

    public static Address of(String addressLine) {
        return new Address(null, addressLine);
    }
}
