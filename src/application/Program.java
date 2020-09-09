package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Quantos funcionários são: ");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {

			System.out.print("----------------------------\n");
			System.out.println("Funcionário #" + (i + 1) + ":\n");
			System.out.print("ID do funcionario: ");
			Integer id = sc.nextInt();
			while (buscaId(funcionarios, id)) {
				System.out.println("Id ja usado, tente denovo: ");
				id = sc.nextInt();
			}

			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Salario: ");
			Double salario = sc.nextDouble();

			Funcionario func = new Funcionario(id, nome, salario);

			funcionarios.add(func);

		}

		System.out.println("Qual ID do funcionário que ganhará aumento: ");
		int aumentado = sc.nextInt();
		
		Funcionario func = funcionarios.stream().filter(x -> x.getId() == aumentado).findFirst().orElse(null);
		
		//int procura = procuraId(funcionarios, aumentado);
		
		if (func == null) {
			System.out.println("Esse funcionário Não existe.");
		}
		else {
			System.out.println("Qual a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			func.aumentaSalario(porcentagem);
			System.out.println("O funcionário " + func.getNome() + " passará a ter o salário de: " + func.getSalario());
		}
		
		
		

		sc.close();
	}

	public static int procuraId(List<Funcionario> empregados, int id) {

		for (int i = 0; i < empregados.size(); i++) {
			
			if (empregados.get(i).getId() == id)
				return i;		 
			
		}
		return -1;

	}
	
	
	public static boolean buscaId(List<Funcionario> empregados, int id) {		
		Funcionario func = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}



	
	
	
	
	
	
	
