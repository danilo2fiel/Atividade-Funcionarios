package controler;

import java.util.List;

import DAO.FuncionarioDAO;
import DAO.FuncionarioDAOimpl;
import DAO.PessoaDAO;
import DAO.PessoaDAOimpl;
import model.Funcionario;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {

		
		
		PessoaDAO pessoaDAO = new PessoaDAOimpl();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAOimpl();
		Funcionario funcionario = new Funcionario();
		Pessoa pessoa = new Pessoa();
		
//=================CADASTRAR FUNCIONÁRIO (INCLUINDO OS DADOS PESSOAIS)============================		
		
//		pessoa.setNome("FULANO");
//		pessoa.setIdPessoa(pessoaDAO.getSequence());
//		pessoa.setNascimento("13/02/1956");
//		pessoa.setIdade(88);
//		pessoa.setCargo("FISCAL DE CAMPO");
//		
//		funcionario.setCracha(funcionarioDAO.getSequence());
//		funcionario.setFerias(10);
//		funcionario.setSalario(5000);
//		funcionario.setPessoa(pessoa);
//		funcionarioDAO.salvar(funcionario);
		
//=================INFORMAÇÃO DO FUNCIONÁRIO PELO NÚMERO DO CRACHÁ===================			
		
//		System.out.println(funcionarioDAO.pesquisar(14));
		
		
		
//========================LISTAR TODOS OS FUNCIONÁRIOS============================		
		
//		List<Funcionario> listaFuncionario = funcionarioDAO.listarTodos();
//		for(Funcionario p: listaFuncionario) {
//			System.out.println(p.toString());
//		}
	}
}
