package br.com.jonwork.cad.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.jonwork.cad.entities.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
