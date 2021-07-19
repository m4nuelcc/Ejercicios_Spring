package V10_InyeccionDeDependenciasSetters;

public class JefeEmpleado implements Empleados {
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	//Creacion de campo tipo creacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		
		return "Gestiono las cuestiones de mis empleados porque soy JefeEmpleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe JefeEmpleado " + informeNuevo.getInforme2();
	}

}
