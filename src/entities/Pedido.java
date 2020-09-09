package entities;

import java.util.Date;

public class Pedido {
	
	// Class Attributes
	private Date data;
	private Produto produto;
	
	// Class Constructors
	public Pedido(Date data, Produto produto) {
		super();
		this.data = data;
		this.produto = produto;
	}

	
	//Getters and Setters
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	

}
