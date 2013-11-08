package fr.alma.projet.generation.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
		public void setNumero(String newValue);
	

	public List<IOperation> getOperation();
	public void setOperation(List<IOperation> newValue);
}