package exercicio6;

public class DescritorMusical {
	private String artista;
	private String album;
	private String nome;
	private String numero;

	public DescritorMusical(String artista, String album, String nome, String numero) {
		this.artista = artista;
		this.album = album;
		this.nome = nome;
		this.numero = numero;
	}
	
	public DescritorMusical clone(DescritorMusical descritorM) {
		DescritorMusical newDescritor = descritorM;
		return newDescritor;
	}
	
	public String toString() {
		return  "Artista: " + artista + "\n"
				+ "Álbum: " + album + "\n"
				+ "Nome: " + nome + "\n"
				+ "Número: " + numero ;
	}
}
