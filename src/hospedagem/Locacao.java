package hospedagem;

public class Locacao {

	private String nome;
	private String email;
	private int numeroQuarto;
	
	public Locacao(String nome, String email, int numeroQuarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}
	
	

	public Locacao(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	
	
}
