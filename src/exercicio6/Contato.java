package exercicio6;

public class Contato {
	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {
		nome = "";
		email = "";
		telefone = "0";
	}
	
	public Contato(String nome) {
		this();
		this.nome = nome;
	}
	
	public Contato(String nome, String email) {
		this(nome);
		this.email = email;
	}
	
	public Contato(String nome, String email, String telefone) {
		this(nome, email);
		this.telefone = telefone;
	}
	
	public Contato clone(Contato contato) {
		Contato newContato = contato;
		return newContato;
	}
	
	public String toString() {
		return "Nome: " + this.nome +"\n"
				+"Email: " + this.email +"\n"
				+"Telefone: " + this.telefone;
	}
}
