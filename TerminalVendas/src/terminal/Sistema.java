package terminal;

import java.util.ArrayList;


public class Sistema {
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	ArrayList<Carrinho> vendas = new ArrayList<Carrinho>();
	Carrinho carrinho = new Carrinho();
	int cod=9999;
	
	
	public void adicionar_veiculo(Veiculo auto) {
		veiculos.add(auto);
		
	}

	public void adicionar_vendas(Carrinho novo) {
		vendas.add(novo);
	}
	
	public void listar_veiculos() {
		for (Veiculo v:veiculos) {
			System.out.println("Marca: "+v.getMarca());
			System.out.println("Modelo: "+v.getModelo());
			System.out.println("Ano: "+v.getAno());
			System.out.println("Tipo: "+v.getTipo());
			System.out.println("Pre�o: "+v.getPreco());
			System.out.println("C�digo: "+v.getCod());
			System.out.println("Cores: ");
			for (String cor:v.cores) {
			System.out.print(cor+", ");
			}
			System.out.println("\n");
			System.out.println("-------------------------");
		}
	}
	
	public int getQtd(int cod) {
		int count=0;
		for(Veiculo h:veiculos) {
			if(h.getCod()==cod) {
				count++;
			}
		}
		return count;
	}
	
	public void listar_compras() {
		for (Carrinho k:vendas) {
			k.listar_carrinho();

	}
	}
	
	
	public Veiculo procura_por_cod(int codigo) {
		Veiculo tmp=null;
		for(Veiculo v:veiculos) {
			if(v.getCod()==codigo) {
				tmp = v;
			}else {
				tmp=null;
			}
			}
		return tmp;
		}


	}
	

