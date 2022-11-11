package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Pessoa;
import model.util.JpaUtil;

public class PessoaDAOimpl implements PessoaDAO{

	private EntityManager em;
	private EntityTransaction et;
	
	@Override
	public void salvar(Pessoa pessoa) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.persist(pessoa);               
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
	public void alterar(Pessoa pessoa) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.merge(pessoa);               
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
	public void remover(Integer idPessoa) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();                         
			em.remove(em.find(Pessoa.class, idPessoa));               
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
	public Pessoa pesquisar(int idPessoa) {

		Pessoa pessoa = new Pessoa(); 
		try {
			this.em = JpaUtil.getEntityManager();
			pessoa = em.find(Pessoa.class, idPessoa);     
			
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
		return pessoa;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> listarTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Pessoa p");
		List<Pessoa> listaPessoa = query.getResultList();
		em.close();
		return listaPessoa;
	}
		
	
	
	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
