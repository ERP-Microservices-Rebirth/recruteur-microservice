package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Condidat;
import com.example.demo.service.RecruteurServiceImp;

@Controller
@RestController
@RequestMapping("/test")

public class RecruteurRestController {
	@Autowired
	RecruteurServiceImp recruteur;
@PostMapping("/ajouter")
public 	Condidat ajouterEmploye(@RequestBody Condidat c)
{
	recruteur.ajoutercondidat(c);
	return c;
}
@DeleteMapping ("/delete/{id}")
public void deletecondidat(@PathVariable ("id") long id ) {
	recruteur.deletecondidat(id);
	
}
@GetMapping("/")
public List<Condidat> afficherCondidats(){
	return recruteur.affichercondidat();
}
	
}

