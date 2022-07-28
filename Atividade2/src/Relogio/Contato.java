package Relogio;

public class Contato {
	private String nome = "";
	private String telefone = "";
	String mostrarContato = "";
	
	public String getNome() {
		return this.nome;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setNome(String Nome) {
		this.nome = Nome;
		
	}
	public void setTelefone(String Telefone) {
		this.telefone = Telefone;
	}
	 public String mostrarContato() {
		 return this.nome + "/"+ this.telefone; 
	 }
	
	
	
}
