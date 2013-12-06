package fr.alma.projet.generation.banque.model.impl;

import fr.alma.projet.generation.banque.model.IOperation;


import java.util.ArrayList;
import java.util.List;

public class Operation implements IOperation{
	private String Numero;
	private String Montant;




	public String getNumero(){
		return this.Numero;
	}
		public void setNumero(String newValue){
		this.Numero = newValue;
	}
		public String getMontant(){
		return this.Montant;
	}
		public void setMontant(String newValue){
		this.Montant = newValue;
	}
	

}