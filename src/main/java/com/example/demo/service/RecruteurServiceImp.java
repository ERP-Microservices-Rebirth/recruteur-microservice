package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Condidat;

public interface RecruteurServiceImp {
	public Condidat ajoutercondidat(Condidat c);
	public void deletecondidat(long id);
	public List<Condidat> affichercondidat();
}
