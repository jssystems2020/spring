package com.senaisp.curso_spring.resources;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senaisp.curso_spring.domain.Categoria;

@RestController// Notações utilizando @ são do framework para mudanças do comportamento dos mestodos, classes,parametros...
@RequestMapping(value = "/categorias") // Chamada do metodo pela Browser Localhost:8081/categorias. 
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "informatica");
		Categoria cat2 = new Categoria(2, "escritorio");
		ArrayList<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		return list;
	}
}
 