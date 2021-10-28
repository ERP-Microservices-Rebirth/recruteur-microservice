package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Condidat;
import com.example.demo.repository.CondidatRepositary;
@Service
public class RecruteurService implements RecruteurServiceImp {

	
	@Autowired
	CondidatRepositary condidatrepositary;
	public Condidat ajoutercondidat(Condidat c) {
		
		// TODO


		return condidatrepositary.save(c);
	}
	@Override
	public void deletecondidat(long id) {
		// TODO Auto-generated method stub
		condidatrepositary.deleteById(id);
		
	}
	@Override
	public List<Condidat> affichercondidat() {
		// TODO Auto-generated method stub
		return null;
	}

}
