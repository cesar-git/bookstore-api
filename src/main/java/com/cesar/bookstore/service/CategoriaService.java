package com.cesar.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesar.bookstore.domain.Categoria;
import com.cesar.bookstore.repositories.CategoriaRepository;
import com.cesar.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> 
		new ObjectNotFoundException("Objeto não econtrado! Id: " + id + 
				", Tipo: " + Categoria.class.getName()));
	}

}