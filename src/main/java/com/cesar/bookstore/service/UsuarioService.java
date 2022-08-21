package com.cesar.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesar.bookstore.domain.Usuario;
import com.cesar.bookstore.dto.UsuarioDTO;
import com.cesar.bookstore.repositories.UsuarioRepository;
import com.cesar.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired UsuarioRepository repository;
	
	public Usuario findById(Integer id) {		
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não econtrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}	
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}	
	
	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Usuario update(Integer id, UsuarioDTO objDto) {
		Usuario obj = findById(id);
		obj.setNome(objDto.getNome());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}

}