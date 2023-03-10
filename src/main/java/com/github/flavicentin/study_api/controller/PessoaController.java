package com.github.flavicentin.study_api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.flavicentin.study_api.model.Pessoa;
import com.github.flavicentin.study_api.service.PessoaService;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<Pessoa> listAll(){
		return pessoaService.list();
	} 
	
}
