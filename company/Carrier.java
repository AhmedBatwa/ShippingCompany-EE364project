package company;

import shipment.Shipment;

public class Carrier {
private Shipment[][] assignedShipments;
private int[] workingHours;
enum Shift {
	MORNING_SHIFT,EVENING_SHIFT,NIGHT_SHIFT
}

public Carrier(Shift shift) {
	
}


public Shipment[][] getAssignedShipments() {
	return assignedShipments;
}


public int[] getWorkingHours() {
	return workingHours;
}


public void Deliver(int hours) {
	
}

public void assignShipment(Shipment shipment) {
	//element by element multiplaction for prefieredDeliveryTime for(shipment,reciever,carrierWorkingHours)
    //the result is the best suit delivery time
	//check if the best suit time not equiped in assignedShipment array of this carrier
	//return what happend bud
	

}

     
}
