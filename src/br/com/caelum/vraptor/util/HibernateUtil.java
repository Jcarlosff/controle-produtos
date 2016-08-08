package br.com.caelum.vraptor.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.bean.Usuario;

public class HibernateUtil {
	
	private static SessionFactory factory;
	
	static {
		Configuration cfg = new Configuration().addAnnotatedClass(Produto.class).addAnnotatedClass(Usuario.class);
		factory = cfg.buildSessionFactory();
	}
	
	public Session getSession(){
		return factory.openSession();
	}
}
