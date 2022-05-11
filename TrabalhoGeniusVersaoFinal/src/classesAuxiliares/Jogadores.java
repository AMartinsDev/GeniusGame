package classesAuxiliares;

//Classe dos jogadores e seus respectivos atributos;

public class Jogadores {
	
	private int numJogador; //jogador 1 ou 2
	private int pontos; //pontuação
	private boolean vez; //turno do jogador
	private String nome;	//nome do jogador
	
	public Jogadores(int numJogador, int pontos, boolean vez, String nome) {
		this.numJogador = numJogador;
		this.pontos = pontos;
		this.vez = vez;
		this.nome = nome;
	}
	
	//getters e setters necessários 
	public boolean jaJogou() {
		return pontos == -1 ? false : true;
	}
	public int getNumJogador() {
		return numJogador;
	}
	public void setNumJogador(int numJogador) {
		this.numJogador = numJogador;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public boolean isVez() {
		return vez;
	}
	public void setVez(boolean vez) {
		this.vez = vez;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
