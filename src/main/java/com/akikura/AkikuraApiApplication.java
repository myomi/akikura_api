package com.akikura;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.akikura.dao.OwnerDao;
import com.akikura.entity.Owner;

/**
 * メインクラス
 * @author myomi
 *
 */
@SpringBootApplication
public class AkikuraApiApplication {
	@Autowired
	private OwnerDao ownerDao;

	public static void main(String[] args) {
		SpringApplication.run(AkikuraApiApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner() {
		return args -> {
			Owner owner = new Owner();
			owner.setName("hello");
			owner.setUnitRate(BigDecimal.valueOf(2.55));
			owner.setContractDate(LocalDate.now());
			ownerDao.insert(owner);
		};
	}
}
