package terminal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;

import terminal.Veiculo;
import terminal.Sistema;

public class Principal {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Sistema novo = new Sistema();
		int cod = 9999;
		ArrayList<String> cores = new ArrayList<String>();
		int x;
        do {
			System.out.println("1 - Adicionar Veículo ao Carrinho");
	        System.out.println("2 - Remover Veículo do Carrinho");
	        System.out.println("3 - Mostrar Carrinho");
	        System.out.println("4 - Listar Veículos");
	        System.out.println("5 - Consultar Andamento do Seu Pedido");
	        System.out.println("6 - Sair");
	        System.out.println("7 - Acesso Administrador");
	        System.out.print("\n");
	        System.out.print("Digite a opção desejada: ");
	        x= in.nextInt();
        switch(x) {
        case 1:
        	System.out.println("Digite o codigo do veiculo: ");
        	int escolha = in.nextInt();
        	Veiculo t = novo.procura_por_cod(escolha);
        	novo.carrinho.adicionar_carrinho(t);
        	System.out.println("Veiculo "+t.getMarca()+", "+t.getModelo()+", "+t.getAno()+", "+" Adicionado ao carrinho!");
        	System.out.print("\n\n");
        
        	break;
        case 2:
        	
        	break;
        case 3:
        	
        	break;
        case 4:
        	
        	novo.listar_veiculos();
        	break;
        case 5:
        	
        	break;
        case 6:
        	
        	break;
        case 7:
        	System.out.println("\n");
        	System.out.println("Digite a senha:");
        	int senha = in.nextInt();
        	if(senha==123) {
        		System.out.println("1 - Cadastrar automóveis");
                System.out.println("2 - Remover veículo do estoque");
                System.out.println("3 - Mostrar estoque");
                System.out.print("\nDigite a opção desejada: ");
                int adm = in.nextInt();
                switch(adm) {
                case 1:
                  System.out.print("Digite o tipo do veiculo: ");
           		  String tipo = in.next();
           		  System.out.print("Digite a marca: ");
           		  String marca = in.next();
           		  System.out.print("Digite o modelo: ");
           		  String modelo = in.next();
           		  System.out.print("Digite o ano: ");
           		  int ano = in.nextInt();
           		  System.out.print("Digite o preço: ");
           		  float preco = in.nextFloat();
       			  System.out.print("Digite a quantidade: ");
     			  int qtd = in.nextInt();
     			  System.out.print("Digite a cor: ");
      			  cores.add(in.next());
           		  do {
           			  System.out.println("1 - Inserir outra cor");
           			  System.out.println("2 - Continuar cadastro");
           			  System.out.print("Digite a opção: ");
           			  x = in.nextInt();
           			  System.out.print("\n");
           			  switch(x) {

           			  case 1:
           				  System.out.print("Digite a cor: ");
           				  cores.add(in.next());
           				  break;
           			  }
           		  }while(x != 2);
           		  
           		  Veiculo auto = new Veiculo(marca, modelo, tipo, ano, cores, preco, cod);
           		  novo.adicionar(auto);
           		  System.out.println("Veículo de cod "+cod+" cadastrado!");
           		  cod--;
           		  
                	break;
                case 2:
                	
                	break;
                case 3:
                	novo.listar_veiculos();
                	break;
               } 
        	}else {
        		System.out.println("Senha inválida!");
        		break;
        	}
        	
        	
        	break;
        
        default:
        	System.out.println("Opção Inválida");
        	break;
        }
       
	}while(x!=9);		
}
}