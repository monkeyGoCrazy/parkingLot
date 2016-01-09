package parkingLot;
import enums.VehicleSize;
import vehicles.Vehicle;

import java.util.*;
/**
 * Created by mengleisun on 1/8/16.
 */
public class ParkingLot implements IParkingLot {
    private ArrayList<ParkingSpot> spots = new ArrayList<ParkingSpot>();
    private Capacity capacity;
    private Capacity current;
    public ParkingLot() {

    }
    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
        this.current = new Capacity(capacity.motorcycleNum,capacity.compactNum,capacity.largeNum);
    }
    public Capacity getCapacity() {
        return capacity;
    }
    public int availableSpots(Vehicle vehicle) {
        if (vehicle.size == VehicleSize.Motorcycle) {
            return current.motorcycleNum;
        } else if (vehicle.size == VehicleSize.Compact) {
            return current.compactNum;
        } else {
            return current.largeNum;
        }
    }
    public void enterVehicle(Vehicle vehicle) {

    }
    public void exitVehicle(Vehicle vehicle) {

    }
    public void setSpots(Vehicle vehicle) {

    }
}
