package com.senaisp.curso_spring.resources;// Aqui é a API

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senaisp.curso_spring.domain.Categoria;
import com.senaisp.curso_spring.services.CategoriaService;

@RestController// Notações utilizando @ são do framework para mudanças do comportamento dos mestodos, classes,parametros...
@RequestMapping(value = "/categorias") // Chamada do metodo pela Browser Localhost:8081/categorias. 
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value ="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listarTudo() {
		return service.retornaTudo();
	}

}
 