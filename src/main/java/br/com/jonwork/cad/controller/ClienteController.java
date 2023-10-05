package br.com.jonwork.cad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonwork.cad.entities.Cliente;
import br.com.jonwork.cad.repositories.ClienteRepository;

@RestController
@RequestMapping
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@PostMapping("/cadastrar")
	public Cliente cadastrar(@RequestBody Cliente c) {
		return repository.save(c);
	}
	
	@GetMapping("/listar")
	public Iterable<Cliente> listar() {
		return repository.findAll();
	}
	
	@PutMapping("/alterar")
	public Cliente alterar(@RequestBody Cliente c) {
		return repository.save(c);
	}

}
