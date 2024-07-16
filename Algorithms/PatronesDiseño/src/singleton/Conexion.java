package singleton;

public class Conexion {
	private static Conexion instancia;
	
	private Conexion() {}
	
	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia =  new Conexion();
		}
		return instancia;
	}
	
	public void conectar() {
		System.out.println("Estamos conectados");
	}
	
	public void desconectar() {
		System.out.println("Estamos desconectados");
	}
}