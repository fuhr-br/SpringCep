package com.example.demo;

import java.util.Collection;


import org.springframework.data.repository.CrudRepository;

public interface CepRepository extends CrudRepository<Cep, Long> {

	Collection<Cep> findByCidade(String cidade);
	

	Cep findById(int id);

}
