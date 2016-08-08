package br.com.caelum.vraptor.util;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.bean.Usuario;

public class GeraTabelas {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Usuario.class);
				
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
		
		cfg.addAnnotatedClass(Produto.class);
		se = new SchemaExport(cfg);
		se.create(true,true);
	}
}

