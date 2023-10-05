package br.com.jonwork.cad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {
	
	@GetMapping("/")
	public String ola() {
		return"Ola Mundo";
	}
}
