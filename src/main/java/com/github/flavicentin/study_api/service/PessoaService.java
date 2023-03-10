package com.github.flavicentin.study_api.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.flavicentin.study_api.model.Pessoa;


@Service
public class PessoaService {
	private List<Pessoa> pessoas;
	
	public PessoaService() {
		load();
	}
	
	private void load() {
		pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa ();
		
		pessoa.setId(1L);
		pessoa.setNome("Flávio");
		pessoas.add(pessoa);
		
		pessoa = new Pessoa ();
		pessoa.setId(2L);
		pessoa.setNome("João");
		pessoas.add(pessoa);
		
		pessoa = new Pessoa ();
		pessoa.setId(3L);
		pessoa.setNome("Julio");
		pessoas.add(pessoa);
	}
	
	public List<Pessoa>list(){
		return pessoas;
	}
	
}
