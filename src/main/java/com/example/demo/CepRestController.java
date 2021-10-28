package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Cep> getCep(@PathVariable("id") Integer id) {

		Cep cep = this.cepRepository.findById(id);

		if (cep == null) {
			return new ResponseEntity<Cep>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Cep>(cep, HttpStatus.OK);

	}

	@RequestMapping(value = "/cidade/{cidade}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Cep>> getCepByCidade(@PathVariable("cidade") String cidade) {

		Collection<Cep> cepCidades = cepRepository.findByCidade(cidade);

		if (cepCidades.isEmpty()) {
			return new ResponseEntity<Collection<Cep>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Cep>>(cepCidades, HttpStatus.OK);

	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Cep>> getAll() {

		Iterable<Cep> allCeps = cepRepository.findAll();

		if (allCeps == null) {
			return new ResponseEntity<Iterable<Cep>>(HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<Iterable<Cep>>(allCeps, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Void> deleteCep(@PathVariable("id") Integer id) {

		Cep cep = this.cepRepository.findById(id);
		this.cepRepository.delete(cep);
		if (cep == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
