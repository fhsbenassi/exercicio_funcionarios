package entities;

public class Funcionario {
	
	String nome;
	int id;
	double salario;
	
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public void aumentaSalario(double porcentagem) {
		double aumento = getSalario()*(porcentagem/100);
		setSalario(getSalario()+aumento);
	}//comment to test
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
