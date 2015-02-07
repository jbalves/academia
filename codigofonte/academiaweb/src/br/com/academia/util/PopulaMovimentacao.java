package br.com.academia.util;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.divus.model.Conta;
import br.com.divus.model.Movimentacao;
import br.com.divus.model.TipoMovimento;

public class PopulaMovimentacao {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setId(1);
		Conta conta2 = new Conta();
		conta2.setId(2);
		Conta conta3 = new Conta();
		conta3.setId(3);
		
		Movimentacao movimentacao1 = new Movimentacao();
		Movimentacao movimentacao2 = new Movimentacao();
		Movimentacao movimentacao3 = new Movimentacao();
		Movimentacao movimentacao4 = new Movimentacao();
		
		Movimentacao movimentacao5 = new Movimentacao();
		Movimentacao movimentacao6 = new Movimentacao();
		Movimentacao movimentacao7 = new Movimentacao();
		Movimentacao movimentacao8 = new Movimentacao();
		
		Movimentacao movimentacao9 = new Movimentacao();
		Movimentacao movimentacao10 = new Movimentacao();
		Movimentacao movimentacao11 = new Movimentacao();
		Movimentacao movimentacao12 = new Movimentacao();
		
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("Mensalidade Academia");
		movimentacao1.setTipo(TipoMovimento.ENTRADA);
		movimentacao1.setValor(new BigDecimal("350.60"));
		movimentacao1.setConta(conta1);
		
		movimentacao2.setData(Calendar.getInstance());
		movimentacao2.setDescricao("Mensalidade Academia");
		movimentacao2.setTipo(TipoMovimento.SAIDA);
		movimentacao2.setValor(new BigDecimal("350.60"));
		movimentacao2.setConta(conta1);
		
		movimentacao3.setData(Calendar.getInstance());
		movimentacao3.setDescricao("Mensalidade Academia");
		movimentacao3.setTipo(TipoMovimento.ENTRADA);
		movimentacao3.setValor(new BigDecimal("350.60"));
		movimentacao3.setConta(conta1);
		
		movimentacao4.setData(Calendar.getInstance());
		movimentacao4.setDescricao("Mensalidade Academia");
		movimentacao4.setTipo(TipoMovimento.SAIDA);
		movimentacao4.setValor(new BigDecimal("350.60"));
		movimentacao4.setConta(conta1);
		
		movimentacao5.setData(Calendar.getInstance());
		movimentacao5.setDescricao("Mensalidade Academia");
		movimentacao5.setTipo(TipoMovimento.ENTRADA);
		movimentacao5.setValor(new BigDecimal("350.60"));
		movimentacao5.setConta(conta2);
		
		movimentacao6.setData(Calendar.getInstance());
		movimentacao6.setDescricao("Mensalidade Academia");
		movimentacao6.setTipo(TipoMovimento.SAIDA);
		movimentacao6.setValor(new BigDecimal("350.60"));
		movimentacao6.setConta(conta2);
		
		movimentacao7.setData(Calendar.getInstance());
		movimentacao7.setDescricao("Mensalidade Academia");
		movimentacao7.setTipo(TipoMovimento.ENTRADA);
		movimentacao7.setValor(new BigDecimal("350.60"));
		movimentacao7.setConta(conta2);
		
		movimentacao8.setData(Calendar.getInstance());
		movimentacao8.setDescricao("Mensalidade Academia");
		movimentacao8.setTipo(TipoMovimento.SAIDA);
		movimentacao8.setValor(new BigDecimal("350.60"));
		movimentacao8.setConta(conta2);
		
		movimentacao9.setData(Calendar.getInstance());
		movimentacao9.setDescricao("Mensalidade Academia");
		movimentacao9.setTipo(TipoMovimento.ENTRADA);
		movimentacao9.setValor(new BigDecimal("350.60"));
		movimentacao9.setConta(conta3);
		
		movimentacao10.setData(Calendar.getInstance());
		movimentacao10.setDescricao("Mensalidade Academia");
		movimentacao10.setTipo(TipoMovimento.SAIDA);
		movimentacao10.setValor(new BigDecimal("350.60"));
		movimentacao10.setConta(conta3);
		
		movimentacao11.setData(Calendar.getInstance());
		movimentacao11.setDescricao("Mensalidade Academia");
		movimentacao11.setTipo(TipoMovimento.ENTRADA);
		movimentacao11.setValor(new BigDecimal("350.60"));
		movimentacao11.setConta(conta3);
		
		movimentacao12.setData(Calendar.getInstance());
		movimentacao12.setDescricao("Mensalidade Academia");
		movimentacao12.setTipo(TipoMovimento.SAIDA);
		movimentacao12.setValor(new BigDecimal("350.60"));
		movimentacao12.setConta(conta3);
		
		
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(movimentacao1);
		manager.persist(movimentacao2);
		manager.persist(movimentacao3);
		manager.persist(movimentacao4);
		manager.persist(movimentacao5);
		manager.persist(movimentacao6);
		manager.persist(movimentacao7);
		manager.persist(movimentacao8);
		manager.persist(movimentacao9);
		manager.persist(movimentacao10);
		manager.persist(movimentacao11);
		manager.persist(movimentacao12);
		
		
		manager.getTransaction().commit();
		manager.close();
		
		
	}

}
