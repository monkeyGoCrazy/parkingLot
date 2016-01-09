package parkingLot;

import enums.VehicleSize;
import vehicles.Vehicle;

/**
 * Created by mengleisun on 1/8/16.
 */
public class ParkingSpot {
    private boolean available = true;
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int spotNumber;
    public ParkingSpot( int n, VehicleSize size) {
        this.spotSize = size;
        this.spotNumber = n;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public boolean getAvailable() {
        return available;
    }
    public void setAvaibale(boolean available) {
        this.available = available;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
}
