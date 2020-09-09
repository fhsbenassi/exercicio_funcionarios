package entities;

public class Produto {

	// Class attributes
	private String nome;
	private double preco;
	private int quantidade;

	// Class constructors
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	
	// Class Methods
	public double valorTotal() {
		return quantidade * preco;
	}

	public void add(int quantidade) {
		this.quantidade += quantidade;

	}

	public void remove(int quantidade) {
		this.quantidade -= quantidade;

	}

	
	// ToString constructor method
	public String toString() {

		return "Nome: " + nome + ", Preço: $" + String.format("%.2f", preco) + ", Quantidade: " + quantidade
				+ " unidades, Valor Total: $" + String.format("%.2f", valorTotal());

	}

	
	// Getters and Setters
	public void setName(String nome) {
		this.nome = nome;
	}

	public String getName() {
		return this.nome;
	}

}

