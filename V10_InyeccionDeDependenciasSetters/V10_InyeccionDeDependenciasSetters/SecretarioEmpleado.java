package V10_InyeccionDeDependenciasSetters;

public class SecretarioEmpleado implements Empleados {

	
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "El SecretarioEmpleado Gestiona la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de SecretarioEmpleado \n" + informeNuevo.getInforme2() ;
	}
	
	private CreacionInformes informeNuevo;
	
	
	
}
