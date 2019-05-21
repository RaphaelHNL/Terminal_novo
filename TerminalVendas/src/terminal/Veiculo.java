package terminal;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private float preco;
	private int quantidade;
	private String tipo;
	private int cod;
	private String cores[] = new String[5];
	
	public Veiculo(String marca, String modelo, String tipo, int ano, String[] cores, float preco, int quantidade, int cod) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.cod = cod;
		this.cores = cores;
		
	}
	
	public void adicionar() {
		this.quantidade++;
	}
	
	public void remover() {
		this.quantidade--;
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
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setCod() {
		this.cod = 99999;
	}
	
	public int getCod() {
		return this.cod;
	}
	public void setCor(String[] cor) {
		this.cores=cor;
	}
	
	public String[] getCor(){
		return this.cores;
	
}
}