package fr.alma.projet.generation.banque.model.impl;

import fr.alma.projet.generation.banque.model.IClient;
import fr.alma.projet.generation.banque.model.ICompte;

import java.util.ArrayList;
import java.util.List;

public class Client implements IClient{
	private String Nom;
	private String Prenom;
	private String Adresse;


private List<ICompte> listCompte;

	public String getNom(){
		return this.Nom;
	}
		public void setNom(String newValue){
		this.Nom = newValue;
	}
		public String getPrenom(){
		return this.Prenom;
	}
		public void setPrenom(String newValue){
		this.Prenom = newValue;
	}
		public String getAdresse(){
		return this.Adresse;
	}
		public void setAdresse(String newValue){
		this.Adresse = newValue;
	}
	
	public List<ICompte> getComptes(){
		if(this.listCompte == null){
			this.listCompte = new ArrayList<>();
		}
		return this.listCompte;
	}
		public void setComptes(List<ICompte> newValue){
		this.listCompte = newValue;
	}

}