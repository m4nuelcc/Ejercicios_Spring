package V11_InyeccionDeCampos;

public class SecretarioEmpleado implements Empleados {

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

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
	
	private String email;
	
	private String nombreEmpresa;
	
}
