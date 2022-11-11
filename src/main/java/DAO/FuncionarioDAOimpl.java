package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Funcionario;
import model.util.JpaUtil;

public class FuncionarioDAOimpl implements FuncionarioDAO {

	private EntityManager em;
	private EntityTransaction et;
	
	@Override
	public void salvar(Funcionario funcionario) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.persist(funcionario);               
			et.commit();                        
			
		}catch (Exception e){
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro na transação");
			
		}finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void alterar(Funcionario funcionario) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.merge(funcionario);               
			et.commit();                        
			
		}catch (Exception e){
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro na transação");
			
		}finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void remover(Integer cracha) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.remove(em.find(Funcionario.class, cracha));               
			et.commit();                        
			
		}catch (Exception e){
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro na transação");
			
		}finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Funcionario pesquisar(int cracha) {

		Funcionario funcionario = new Funcionario();
		try {
			this.em = JpaUtil.getEntityManager();
			funcionario = em.find(Funcionario.class, cracha);               //código de alteração
			
		}catch (Exception e){
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro na transação");
			
		}finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		return funcionario;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcionario> listarTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Funcionario f");
		List<Funcionario> listaFuncionario = query.getResultList();
		em.close();
		return listaFuncionario;
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
