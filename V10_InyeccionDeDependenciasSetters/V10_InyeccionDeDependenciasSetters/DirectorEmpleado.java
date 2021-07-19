package V10_InyeccionDeDependenciasSetters;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	
	//Creacion del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestiona la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Inoforme creado por el DirectorEmpleado:\n" + informeNuevo.getInforme2();
	}
	
	

}
