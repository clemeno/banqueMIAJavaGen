package fr.alma.projet.generation.banque.model.impl;

import fr.alma.projet.generation.banque.model.ICompte;
import fr.alma.projet.generation.banque.model.IOperation;

import java.util.ArrayList;
import java.util.List;

public class Compte implements ICompte{
	private String Numero;


private List<IOperation> listOperation;

	public String getNumero(){
		return this.Numero;
	}
		public void setNumero(String newValue){
		this.Numero = newValue;
	}
	
	public List<IOperation> getOperations(){
		if(this.listOperation == null){
			this.listOperation = new ArrayList<>();
		}
		return this.listOperation;
	}
		public void setOperations(List<IOperation> newValue){
		this.listOperation = newValue;
	}

}