package DAO;

import java.util.List;

import model.Funcionario;

public interface FuncionarioDAO {

	public void salvar (Funcionario funcionario);
	public void alterar (Funcionario funcionario);
	public void remover (Integer cracha);
	public Funcionario pesquisar (int cracha);
	public List<Funcionario> listarTodos ();
	public int getSequence();
}
