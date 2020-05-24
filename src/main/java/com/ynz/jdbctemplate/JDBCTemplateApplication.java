package com.ynz.jdbctemplate;

import com.ynz.jdbctemplate.domain.Pet;
import com.ynz.jdbctemplate.repo.PetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import java.time.LocalDate;

@SpringBootApplication
@EnableJdbcRepositories
@Slf4j
public class JDBCTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JDBCTemplateApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PetRepository petRepository) {
        return args -> {
            Pet pet1 = Pet.of("pet1", LocalDate.of(2002, 4, 12));
            Pet pet2 = Pet.of("pet2", LocalDate.of(2012, 5, 17));
            log.info(petRepository.save(pet1).toString());
            log.info(petRepository.save(pet2).toString());

            log.info("find pet1 by name: " + petRepository.findByName("pet1"));
        };
    }

}
