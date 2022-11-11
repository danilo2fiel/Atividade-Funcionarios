package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "PESSOA")
public class Pessoa {

	//ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PESSOA")
	@SequenceGenerator(name = "PESSOA",	sequenceName = "S_ID_PESSOA",allocationSize = 1,initialValue=20)
	@Column(name="ID_PESSOA")
	private int idPessoa;
	
	private String nome;
	
	private String nascimento;
	
	private int idade;
	
	private String cargo;
	
	//MÉTODOS
	
	public Pessoa() {
		super();
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", nascimento=" + nascimento + ", idade=" + idade
				+ ", cargo=" + cargo + "]";
	}
	
	
	
	
	
}
