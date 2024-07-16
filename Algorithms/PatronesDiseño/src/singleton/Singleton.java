package singleton;

public class Singleton {
	public static void main(String[] args) {
		Conexion conexionUnica = Conexion.getInstancia();
		
		
		conexionUnica.conectar();
		
		Conexion conexcion2 = Conexion.getInstancia();
		
		conexcion2.desconectar();
		
//		comprobar si es el mismo objeto
		System.out.println(conexionUnica.hashCode());
		System.out.println(conexcion2.hashCode());
		
		
	}
}
