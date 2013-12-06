package fr.alma.projet.generation.banque.model.impl;

import fr.alma.projet.generation.banque.model.IBanque;
import fr.alma.projet.generation.banque.model.IClient;

import java.util.ArrayList;
import java.util.List;

public class Banque implements IBanque{


private List<IClient> listClient;


	public List<IClient> getClients(){
		if(this.listClient == null){
			this.listClient = new ArrayList<>();
		}
		return this.listClient;
	}
		public void setClients(List<IClient> newValue){
		this.listClient = newValue;
	}

}