package com.formulario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formulario.model.Formulario;
import com.formulario.repository.FormularioRepository;

@RestController
@RequestMapping("/formulario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FormularioController {

	@Autowired
	private FormularioRepository Repository;
	private Formulario formulario;
	
	@GetMapping
	public ResponseEntity<List<Formulario>>GetAll(){
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Formulario> GetById(@PathVariable long id ){
		return Repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeSubestacao/{nomeSubestacao}")
	public ResponseEntity<List<Formulario>> GetByNomeSubestacao(@PathVariable String nomeSubestacao ){
		return ResponseEntity.ok(Repository.findAllByNomeSubestacaoContainingIgnoreCase(nomeSubestacao));
	}
	
	@PostMapping
	public ResponseEntity<Formulario> post (@RequestBody Formulario formulario ){
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(formulario));
	}
	
	@PutMapping
	public ResponseEntity<Formulario> put (@RequestBody Formulario formulario ){
		return ResponseEntity.status(HttpStatus.OK).body(Repository.save(formulario));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		Repository.deleteById(id);
	}
	
}
