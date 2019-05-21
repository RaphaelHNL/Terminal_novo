package terminal;

import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner opc = new Scanner(System.in);
        System.out.println("1 - Adicionar Veículo ao Carrinho");
        System.out.println("2 - Remover Veículo do Carrinho");
        System.out.println("3 - Mostrar Carrinho");
        System.out.println("4 - Listar Veículos");
        System.out.println("5 - Consultar Andamento do Seu Pedido");
        System.out.println("6 - Sair");
        System.out.println("7 - Acesso Administrador");
        System.out.print("\nDigite a opção desejada: ");
        int x = opc.nextInt();
	}
}
