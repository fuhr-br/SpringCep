package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

public class CepServiceImplements implements CepRepository{

	private CepRepository cepRepository;

	public CepServiceImplements(CepRepository cepRepository) {
		super();
		this.cepRepository = cepRepository;
	}
	
	@Override
	@Transactional
	public Cep findById(int id) {
		Cep cep = null;
	     cep = cepRepository.findById(id);
		
		return cep;
	}

	@Override
	public <S extends Cep> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cep> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cep> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Cep> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Cep> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cep entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cep> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cep> findByCidade(String cidade) {
		// TODO Auto-generated method stub
		return null;
	}
			
}
