package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CepApplication {
	//private static final Logger log = LoggerFactory.getLogger(CepApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CepApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CepRepository repository) {
		return (args) -> {
			// Salva os Ceps 
			repository.save(new Cep("Porto Alegre", "90050230"));
			repository.save(new Cep("Canoas", "91150000"));
			repository.save(new Cep("Caibate", "33355222"));
			repository.save(new Cep("Santa Rosa", "99955222"));
			repository.save(new Cep("Canoas", "999111000"));

//			// busca todos os ceps
//			log.info("ceps encontrados com findAll():");
//			log.info("-------------------------------");
//			for (Cep customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// busca um Cep individual prlo ID
//			Cep cep = repository.findById(1L);
//			log.info("Cep encontrado com o findById(1L):");
//			log.info("--------------------------------");
//			log.info(cep.toString());
//			log.info("");
//			
//			 // fetch customers by last name
//		      log.info("buscar Cep pela Cidade com findByLastName('Canoas'):");
//		      log.info("--------------------------------------------");
//		      repository.findByCidade("Canoas").forEach(Canoas -> {
//		        log.info(Canoas.toString());
//		      });
//		      // for (Customer Canoas : repository.findByLastName("Canoas")) {
//		      //  log.info(Canoas.toString());
//		      // }
//		      log.info("");

			
		};
	}

}
