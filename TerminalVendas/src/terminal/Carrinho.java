package terminal;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Veiculo> produtos = new ArrayList<Veiculo>();
	
	
	public void adicionar_carrinho(Veiculo novo) {
		produtos.add(novo);
	}
	
	public void remover_carrinho(Veiculo novo) {
		produtos.remove(novo);
	}
	
	public void listar_carrinho() {
		if(produtos.isEmpty()) {
			System.out.println("\nCarrinho Vazio.\n");
		}else {
			for (Veiculo v:produtos) {
				System.out.println("Marca: "+v.getMarca());
				System.out.println("Modelo: "+v.getModelo());
				System.out.println("Ano: "+v.getAno());
				System.out.println("Tipo: "+v.getTipo());
				System.out.println("C�digo: "+v.getCod());
				System.out.println("Cor: "+v.getCores());
		}
		}
		
	
}
}

