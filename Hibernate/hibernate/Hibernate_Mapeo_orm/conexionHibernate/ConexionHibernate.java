package hibernate.Hibernate_Mapeo_orm.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexionHibernate {

	public static void main(String[] args) {
	
		SessionFactory miFactory = new Configuration().configure("/hibernate.cfg.xml")
				                   .addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			
			Clientes cliente1= new Clientes("pedro2", "pikapiedra","paseo del chnurro");
			
			miSession.beginTransaction(); //comienza una nueva transacion
			
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
						
			System.out.println("Registro insertado correctamente en BBDD");
			
			//miFactory.close();
			
			// Lectura de registro
			
			miSession.beginTransaction(); 
			
			System.out.println("Lectura de registro con id" + cliente1.getId());
			
			Clientes clienteInsetado = miSession.get(Clientes.class, cliente1.getId());
			
			System.out.println("Registro: " + clienteInsetado);
			
			miSession.getTransaction().commit();
			
			System.out.println("terminado");
			
			miFactory.close();

			
			 
			
		}finally {
			
			miFactory.close();
		}

	}

}
