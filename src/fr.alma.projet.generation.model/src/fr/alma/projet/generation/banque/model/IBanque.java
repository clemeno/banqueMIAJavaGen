package fr.alma.projet.generation.banque.model;

import java.util.List;

public interface IBanque {


	public List<IClient> getClient();
	public void setClient(List<IClient> newValue);
}