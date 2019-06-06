package terminal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;

import terminal.Veiculo;
import terminal.Sistema;

public class Principal {
	public static void main(String [] args) {
		
		Sistema novo = new Sistema();
		int cod = 9999;
		int venda = novo.carrinho.cod;
		int x;
        do {
        	Veiculo t=null;
        	ArrayList<String> cores = new ArrayList<String>();
        	Scanner in = new Scanner(System.in);
			System.out.println("1 - Adicionar Ve�culo ao Carrinho");
	        System.out.println("2 - Remover Ve�culo do Carrinho");
	        System.out.println("3 - Mostrar Carrinho");
	        System.out.println("4 - Listar Ve�culos");
	        System.out.println("5 - Consultar Andamento do Seu Pedido");
	        System.out.println("6 - Finalizar compra/Sair");
	        System.out.println("7 - Acesso Administrador");
	        System.out.print("\n");
	        System.out.print("Digite a op��o desejada: ");
	        x= in.nextInt();
        switch(x) {
        case 1:
        	
        	if(novo.carrinho.tamanho_carrinho()>=10 || novo.veiculos.size()==0) {
        		System.out.println("Quantidade limite de produtos atingida ou n�o h� produtos cadastrados o sistema\n");
        	}else {
        		System.out.println("Digite o codigo do veiculo a ser adicionado: ");
            	int escolha = in.nextInt();
            	System.out.println("Digite a cor do veiculo: ");
            	String color = in.next();
            	t = novo.procura_por_cod(escolha);
            	System.out.print("A cor � fosca?(1-sim/2-n�o): ");
            	int teste=in.nextInt();
            
            	if(t.verif_cor(color)) {
            		t.setCor(color);
            		if (teste==1) {
            			t.setPreco(t.getPreco()*1.03);
            		}
                	novo.carrinho.adicionar_carrinho(t);
                	System.out.println("Veiculo "+t.getMarca()+", "+t.getModelo()+", "+t.getAno()+", "+t.getCor_escolhida()+", R$"+t.getPreco()+ " Adicionado ao carrinho!\n");
                	System.out.print("\n\n");
            	}else {
            		System.out.println("Cor indispon�vel!\n");
            	}
            	System.out.println(teste);
            	
        	}
        	
        		
        
        	
        	break;
        case 2:
        	if(novo.carrinho.produtos.isEmpty()) {
        		System.out.println("N�o h� veiculos no carrinho");
        	}else {
        		System.out.println("Digite o codigo do veiculo a ser removido: ");
            	int num = in.nextInt();
            	Veiculo p = novo.procura_por_cod(num);
            	novo.carrinho.remover_carrinho(p);
            	System.out.println("Veiculo "+p.getMarca()+", "+p.getModelo()+", "+p.getAno()+", "+p.getCor_escolhida()+" Removido do carrinho!\n");
            	System.out.print("\n\n");
        	}
        	        	
        	break;
        case 3:
        	novo.carrinho.listar_carrinho();
        	break;
        case 4:
        	if(novo.veiculos.isEmpty()) {
        		System.out.println("\nLista de veiculos vazia\n");
        	}else {
        		novo.listar_veiculos();
        	}
        	
        	break;
        case 5:
        	System.out.println("Digite o codigo da venda: ");
        	int k = in.nextInt();
        	System.out.println(novo.carrinho.prazoEntrega());
        	
        	break;
        case 6:
        	System.out.println("Deseja finalizar sua compra?(s/n)");
        	String verif = in.next();
        	if(verif.equals("s")) {
        		novo.adicionar_vendas(novo.carrinho);
        		System.out.println("Venda finalizada, c�digo: "+venda);
        		venda--;
        		
        	}
        	break;
        case 7:
        	System.out.println("\n");
        	System.out.println("Acesso restrito");
        	System.out.println("Digite a senha:");
        	int senha = in.nextInt();
        	if(senha==123) {
        		System.out.println("1 - Cadastrar autom�veis no sistema");
                System.out.println("2 - Remover ve�culo do sistema");
                System.out.println("3 - Listar compras realizadas");
                System.out.print("\nDigite a op��o desejada: ");
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
           		  System.out.print("Digite o pre�o: ");
           		  double preco = in.nextDouble();
       			  System.out.print("Digite a quantidade: ");
     			  int qtd = in.nextInt();
     			  System.out.print("Digite a cor: ");
     			  String cor = in.next();
      			  cores.add(cor);
      			  
           		  do {
           			  
           			  System.out.println("1 - Inserir outra cor");
           			  System.out.println("2 - Continuar");
           			  System.out.print("Digite a op��o: ");
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
           		  novo.adicionar_veiculo(auto);
           		  System.out.println("Ve�culo de cod "+cod+" cadastrado!");
           		  cod--;
           		  
                	break;
                case 2:
                	if(novo.veiculos.isEmpty()) {
                		System.out.println("N�o h� ve�culos cadastrados no sistema\n");
                	}else {
                		System.out.println("Digite o codigo do veiculo a ser removido:");
                    	int l = in.nextInt();
                    	novo.veiculos.remove(novo.procura_por_cod(l));
                    	System.out.println("Veiculo removido!");
                	}
                	
                	break;
                case 3:
                	if(novo.vendas.isEmpty()) {
                		System.out.println("Lista de compras vazia");
                	}else {
                		novo.listar_compras();
                	}
                	
                	break;
               } 
        	}else {
        		System.out.println("Senha inv�lida!");
        		break;
        	}
        	
        	
        	break;
        
        default:
        	System.out.println("Op��o Inv�lida");
        	break;
        }
       
	}while(x!=9);		
}
	public static void teste(int x) throws Exceptions {
		if (x < 0) {
			Exceptions objExc = new Exceptions();
			throw objExc;
		}
	}
}