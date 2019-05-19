import java.util.ArrayList;
import java.util.Date;

public class Parking {

    private String name;
    private String[] spots;
    private ArrayList<Vehicle> vehicles;
    private Date dateStart;

    public Parking(String name, int n) {
        this.name = name;
        this.spots = new String[n];
        this.vehicles = new ArrayList<>();
        this.dateStart = new Date();
    }

    public boolean addVehicle(Vehicle vehicle) throws Exception{


        for(int i = 0; i < this.spots.length; i++){
            if(vehicle.getDimension() == Vehicle.type.CAR && this.spots[i] == null){
                this.vehicles.add(vehicle);
                this.spots[i] = vehicle.getPlate();
                return true;
            }
            if(vehicle.getDimension() == Vehicle.type.TRUCK && this.spots[i] == null && this.spots[i + 1] == null && this.spots[i + 2] == null){
                this.vehicles.add(vehicle);
                this.spots[i] = vehicle.getPlate();
                this.spots[i + 1] = vehicle.getPlate();
                this.spots[i + 2] = vehicle.getPlate();
                return true;

            }
        }
        return false;
    }
}
