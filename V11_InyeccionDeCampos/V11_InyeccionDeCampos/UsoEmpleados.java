package V11_InyeccionDeCampos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		SecretarioEmpleado Juan = contexto.getBean("miSecretario", SecretarioEmpleado.class);		
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println("Email: "+Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		
		contexto.close();
	

	}

}
