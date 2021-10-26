package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")

@RequestMapping("/api/cep")
public class CepRestController {

	@Autowired
	private CepRepository cepRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Cep getCep(@PathVariable("id") Integer id) {

		Cep cep = this.cepRepository.findById(id);
		return cep;

	}

	@RequestMapping(value = "/cidade/{cidade}", method = RequestMethod.GET, produces = "application/json")
	public List<Cep> getCepByCidade(@PathVariable("cidade") String cidade) {

		return cepRepository.findByCidade(cidade);

	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Cep> getAll() {

		return cepRepository.findAll();
	}
}
