package company;

import receiver.Receiver;
import sender.Sender;
import shipment.Shipment;
import shipment.Undelayable;

public class ShippingCompany {
	
	private Carrier[] carriers;
	private Shipment[] shipments;
	private Sender[] senders;
	private Receiver[] receives;

	
	public static void main(String args[]) {
		//simulation of the two phases
		simulatePhase1();
		simulatePhase2();
	}
	
	private static void simulatePhase1() {
		/*
		 * loop to generate employee ,loop shipments,assign to employee directly
		 * 
		 */
		
		
	}
	
	private static void simulatePhase2() {
		/*
		 * generate employee through the method
		 * generateShipments
		 * startDelivering
		 */
	}
	
	private static boolean receive(Shipment shipment , Sender sender,Receiver reciever) {
		/*
		 * 
		 * Receives the shipment from the sender
		 * will pass the shipment to assignToCarrier
		 * if succesed -> add to arrays otherwise->false
		 * 
		 */
	}
	
	
	private static boolean assignToCarrier(Shipment shipment) {
		/*
		 * loops through all the carriers call carrier.assignShipment see if accepted
		 * if undelayble hasn't been assigned call forceAssign 
		 */
	}
	
	//puts the undelayble shipment in place of a normal shipment
	private static boolean forceAssignToCarrier(Undelayable shipment) {
		
		/*
		 * loop throught the shipments array to find a normal shipment at the preffered time of the undelayble shipment
		 * then acess its carrier + registeredDeliveryTime 
		 * remove it from shipment array , carrier assignedShipment 
		 * assign this shipment to the carrier, and add it shipments array , sender ,reciver details
		 */
	    
	}

	private static boolean generateCarries(int numberOfCarriers) {
		//loop to generate carreier
	}
	
	private static boolean generateShipments(int numberOfShipments) {
		//loop to recieve( new shipment , new sender,new receiver)
	}
	
	private static void startDelivering() {
		//loop calls deliver(hour)
	}
	
	private static void deliver(int hour) {
		/*loop through the carriers array and call method deliver(hour)
		 * 
		 */
	}
	
	
	
	
	
	
}

//TODO
//1.create consturctors
//2.create getter & setters ( we may remove non-useful ones )














