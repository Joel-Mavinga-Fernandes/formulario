package com.formulario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formulario.model.Formulario;

@Repository
public interface FormularioRepository extends JpaRepository <Formulario, Long> {
	public List<Formulario> findAllByNomeSubestacaoContainingIgnoreCase (String nomeSubestacao); 
	}
