package application;

import java.util.ArrayList;


public class Estoque {
	private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

}
