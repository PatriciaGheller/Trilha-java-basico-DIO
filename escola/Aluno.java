package escola;

//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	
	private String sexo;
	
	private void setsexo(String sexo) {
		this.sexo = sexo;

	}
	public String getSexo() {
		return sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
