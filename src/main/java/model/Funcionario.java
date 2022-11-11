package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario {

	//ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FUNCIONARIO")
	@SequenceGenerator(name = "FUNCIONARIO",sequenceName = "S_CRACHA",allocationSize = 1,initialValue=100)
	@Column(name= "CRACHA")
	private int cracha;
	
	private int salario;
	
	private int ferias;
	
	@OneToOne(cascade = CascadeType.ALL)       
	@JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID_PESSOA")
	private Pessoa pessoa;
	
	// MÉTODOS
	
	public Funcionario() {
		super();
	}
	public int getCracha() {
		return cracha;
	}
	public void setCracha(int cracha) {
		this.cracha = cracha;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getFerias() {
		return ferias;
	}
	public void setFerias(int ferias) {
		this.ferias = ferias;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public String toString() {
		return "Funcionario [cracha=" + cracha + ", salario=" + salario + ", ferias=" + ferias + ", pessoa=" + pessoa
				+ "]";
	}
	
	
	
}
