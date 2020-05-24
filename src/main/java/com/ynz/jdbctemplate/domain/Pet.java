package com.ynz.jdbctemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    private Long id;

    private String name;

    private LocalDate birthDate;//birth_date

    public Pet(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static Pet of(String name, LocalDate birthDate) {
        return new Pet(name, birthDate);
    }

}
