package fr.alma.projet.generation.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
		public void setNumero(String newValue);
	

	public List<IOperation> getOperations();
	public void setOperations(List<IOperation> newValue);
	
}