package terminal;

import java.util.ArrayList;


public class Sistema {
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	ArrayList<String> vendas = new ArrayList();
	Carrinho carrinho = new Carrinho();
	int cod=9999;
	
	
	
	public void adicionar(Veiculo novo) {
		veiculos.add(novo);
	}
	
	public void listar_veiculos() {
		for (Veiculo v:veiculos) {
			System.out.println("Marca: "+v.getMarca());
			System.out.println("Modelo: "+v.getModelo());
			System.out.println("Ano: "+v.getAno());
			System.out.println("Tipo: "+v.getTipo());
			System.out.println("Código: "+v.getCod());
			System.out.println("Cores: ");
			for (String cor:v.cores) {
			System.out.print(cor+", ");
			}
			System.out.println("\n");
			System.out.println("-------------------------");
		}
	}
	
	public void listar_carrinho() {
		
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
	

