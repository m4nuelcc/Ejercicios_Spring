package V09_InyeccionDeDependencias;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "El SecretarioEmpleado Gestiona la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de SecretarioEmpleado";
	}

}
