package com.senaisp.curso_spring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController// Notações utilizando @ são do framework para mudanças do comportamento dos mestodos, classes,parametros...
@RequestMapping(value = "/categorias") // Chamada do metodo pela Browser Localhost:8081/categorias. 
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "rest Está funcionando";
	}
}
 