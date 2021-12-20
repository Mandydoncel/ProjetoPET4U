package Projeto;

	import java.util.ArrayList;
	import java.util.Scanner;


	public class Pessoa1Adocao extends Pessoa2 {

	    Scanner leia = new Scanner(System.in);

	    public Pessoa1Adocao(String nome, String sobrenome, String genero, int idade, String cpf, String telefone,
	                        String endereco) {
	        super(nome, sobrenome, genero, idade, cpf, telefone, endereco);

	        {
	            ArrayList<String> animais = new ArrayList();
	            animais.add("Cachorro"); 

	            boolean mainLoop = true;
	            int x; 
	            while (mainLoop) {
	                try {

	                    System.out.println("Selecione a opção desejada: ");
	                    System.out.println("\n 1. Doação.");
	                    System.out.println("\n 2. Adoção.");
	                    System.out.println("\n 0. Sair do sistema.");
	                    x = leia.nextInt(); 


	                    switch (x) {

	                        case 1:

	                            leia.nextLine();
	                            mainLoop=false;
	                            System.out.println("\n=== Doação === ");
	                            System.out.println("\nInforme em sequência os dados: nome do animal, idade e gênero do animal: ");
	                            String animal = leia.next();
	                            animais.add(animal);
	                            System.out.println("\nParabéns" +getNome()+ ", você acaba de nos passar os dados do seu animal para doar! Para confirmar sua doação entre em contato através do número (11) 4002-8922.");
	                            break;

	                        case 2:
	                            mainLoop=false;
	                            System.out.println("\n=== Adoção === ");
	                            System.out.println("\nConfira aqui os animais disponíveis para adoção: ");
	                            System.out.println("\n" + animais);
	                            System.out.println("\nEsse(s) são os animais disponíveis para adoção, para confirmar entre em contato através do número (11) 4002-8922.");
	                            break;

	                        case 0:
	                            mainLoop=false;
	                            System.out.println("\nVocê saiu do sistema!");
	                            break;
	                            
	                        default:
	                            System.out.println("Opção invalida.");

	                    }


	                } catch (Exception e) {

	                    System.err.println("\nERRO: Letras não são válidas. ");
	                    System.out.println("\nInforme uma opção válida:");
	                    leia.nextLine();
	                }


	            }
	        }
	    }
	}
	