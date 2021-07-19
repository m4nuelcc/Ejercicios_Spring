package V08_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creacion de objetos de tipo Empleados
		
		//JefeEmpleado Empleado1 = new JefeEmpleado();
		
//		Empleados Empleado1 = new JefeEmpleado();
//		
//		Empleados Empleado2 = new SecretarioEmpleado();
//		
//		Empleados Empleado3 = new DirectorEmpleado();
//		
		
		
		
		//uso de los objetos creados
		
//		System.out.println(Empleado1.getTareas());
//		System.out.println(Empleado2.getTareas());
//		System.out.println(Empleado3.getTareas());
//		
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		Empleados Juan = contexto.getBean("directorEmpleado", Empleados.class);		
		
		System.out.println(Juan.getTareas());
		
		contexto.close();
	

	}

}
