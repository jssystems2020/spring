package com.senaisp.curso_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaisp.curso_spring.domain.Categoria;
import com.senaisp.curso_spring.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElse(null);
	}
	public List<Categoria> retornaTudo() {
		List<Categoria> obj = rep.findAll();
		return obj;
	}

}
