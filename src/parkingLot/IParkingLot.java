package parkingLot;

import vehicles.Vehicle;

/**
 * Created by mengleisun on 1/8/16.
 */
public interface IParkingLot {
    public void setCapacity(Capacity capacity);
    public Capacity getCapacity();
    public int availableSpots(Vehicle vehicle);
    public void enterVehicle(Vehicle vehicle);
    public void exitVehicle(Vehicle vehicle);
    public void setSpots(Vehicle vehicle);
}
