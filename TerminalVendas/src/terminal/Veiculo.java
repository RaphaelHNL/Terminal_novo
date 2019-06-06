package terminal;

import java.util.LinkedList;
import java.util.List;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private String tipo;
	private int cod;
	private String cor_escolhida;
	List<String> cores;
	
	public Veiculo(String marca, String modelo, String tipo, int ano, List<String> cores, double preco, int cod) {
		this.cores = new LinkedList<String>();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.tipo = tipo;
		this.cod = cod;
		this.cores = cores;
	}
		
		
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	

	public void setCod() {
		this.cod = 99999;
	}
	
	public int getCod() {
		return this.cod;
	}
	
	public List<String> getCores(){
		return this.cores;
	}
	
	public void setCor(String cor){
		if(this.cores.contains(cor)){
			this.cor_escolhida=cor;
		}else {
			System.out.println("Cor indisponível\n");
		}
	}
	public boolean verif_cor(String cor) {
		if(this.cores.contains(cor)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getCor_escolhida(){
		return this.cor_escolhida;
	}
		

}