package Projeto;

import java.util.Scanner;

public class PessoaTeste2 {

	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			String nome = "", sobrenome = "", genero = "", telefone = "", endereco = "", cpf = "";
			int idade = 18;
			Pessoa pessoa1 = new Pessoa(nome, sobrenome, genero, idade, cpf, telefone, endereco);

			
			System.out.println("\nQual � o seu nome?");
			nome = leia.next();
			pessoa1.setNome(nome);
			System.out.println("\nQual � o seu sobrenome?");
			sobrenome = leia.next();
			pessoa1.setSobrenome(sobrenome);
			System.out.println("\nInforme o seu g�nero:");
			genero = leia.next();
			pessoa1.setGenero(genero);
			System.out.println("\nQual � a sua idade?");
			idade = leia.nextInt();
			pessoa1.setIdade(idade);
			System.out.println("\nQual � o seu CPF? **Entre apenas com n�meros**");
			cpf = leia.next();
			pessoa1.setCpf(cpf);
			System.out.println("\nQual � o seu telefone? **Entre apenas com n�meros**");
			telefone = leia.next();
			pessoa1.setTelefone(telefone);
			leia.nextLine();
			System.out.println("\nInforme seu endere�o:");
			endereco = leia.nextLine();
			pessoa1.setEndereco(endereco);
			
			if (idade<18)
			{
				System.out.println("\nInfelizmente, "+nome+" "+sobrenome+ " voc� ainda n�o possui idade o suficiente para adotar um amic�o na PET4U. "
						+ "Estaremos lhe esperando quando voc� completar 18 anos.");
			}
			else
			{
			pessoa1.imprimirInfo();
	        leia.close();
			}
		}

	}