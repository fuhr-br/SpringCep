package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CepRepository extends CrudRepository<Cep, Long> {

	List<Cep> findByCidade(String cidade);

	Cep findById(int id);

}
