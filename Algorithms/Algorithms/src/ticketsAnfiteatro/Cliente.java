package ticketsAnfiteatro;

import java.util.List;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellido;
	private List<TicketEntity> listaTickets;
	public Cliente(int idCliente, String nombre, String apellido, List<TicketEntity> listaTickets) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTickets = listaTickets;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<TicketEntity> getListaTickets() {
		return listaTickets;
	}
	public void setListaTickets(List<TicketEntity> listaTickets) {
		this.listaTickets = listaTickets;
	}
	
}
