package vehicles;

import enums.VehicleSize;

/**
 * Created by mengleisun on 1/8/16.
 */
public class Car extends Vehicle {
    public String licensePlace;
    public VehicleSize size;
    public Car(String plate) {
        this.licensePlace = plate;
        size = VehicleSize.Compact;
    }
}
