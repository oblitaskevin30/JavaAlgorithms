package ticketsAnfiteatro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class TicketsAnfiteatro {
	public static void main(String[] args) {
		
		
		ArrayList<TicketEntity> ticketsList = new ArrayList<>();
		TicketEntity ticket1 = new TicketEntity(1,0,1,10,new Date(),new Date());
		TicketEntity ticket2 = new TicketEntity(2,0,2,10,new Date(),new Date());
		TicketEntity ticket3 = new TicketEntity(3,5,5,100,new Date(),new Date());
		TicketEntity ticket4 = new TicketEntity(3,5,5,1000,new Date(),new Date());
		
		
		ticketsList.add(ticket3);
		ticketsList.add(ticket2);
		ticketsList.add(ticket1);
		
//		ver pagos 
		double totalPago = 0 ;
		for(TicketEntity ticket : ticketsList) {
			
			System.out.println(ticket.getPrecio());
			totalPago += ticket.getPrecio();
			
		}
		System.out.println("total a pagar : " + totalPago);
		
		
//		verTicketsPorFilas
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el numero de fila a consultar");
		int fila = scan.nextInt();
		boolean encuentraFila = false;
		
			for(TicketEntity ticket : ticketsList) {
				if(fila == ticket.getFila()) {
					System.out.println(ticket.toString());
					encuentraFila = true;
					
				}
			} 
			
			if(encuentraFila == false) {
				System.out.println("no se encuentraron datos de la fila ");
			}
			
		Cliente cliente1 = new Cliente(1,"Jonathan","oblitas",ticketsList);	
		
		cliente1.getListaTickets().add(ticket4);
		
		for(TicketEntity ticket : cliente1.getListaTickets()) {
			System.out.println(ticket.toString());
		}
		
		scan.close();
	}
}
