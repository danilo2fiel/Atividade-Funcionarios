package DAO;

import java.util.List;

import model.Pessoa;

public interface PessoaDAO {

	public void salvar (Pessoa pessoa);
	public void alterar (Pessoa pessoa);
	public void remover (Integer idPessoa);
	public Pessoa pesquisar (int idPessoa);
	public List<Pessoa> listarTodos ();
	public int getSequence();
}
