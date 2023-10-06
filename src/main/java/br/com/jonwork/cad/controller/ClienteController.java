package br.com.jonwork.cad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonwork.cad.entities.Cliente;
import br.com.jonwork.cad.repositories.ClienteRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@PostMapping("/")
	public Cliente cadastrar(@RequestBody Cliente c) {
		return repository.save(c);
	}

	@GetMapping("/")
	public Iterable<Cliente> listar() {
		return repository.findAll();
	}

	@PutMapping("/")
	public Cliente alterar(@RequestBody Cliente c) {
		return repository.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
}