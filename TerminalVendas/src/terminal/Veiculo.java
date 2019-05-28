package terminal;

import java.util.LinkedList;
import java.util.List;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private float preco;
	private String tipo;
	private int cod;
	List<String> cores = new LinkedList<String>();
	
	public Veiculo(String marca, String modelo, String tipo, int ano, List<String> cores, float preco, int cod) {
		
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
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
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

}