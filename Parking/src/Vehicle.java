import java.util.Date;

public class Vehicle {
    private String plate;
    private int dimension;
    private Date time;


    public Vehicle(String plate) {
        this.plate = plate;
        this.dimension = 1;
        Date time = new Date();
    }

    public Vehicle(String plate, int dimension ) {
        this(plate);
        this.dimension = dimension;
    }

    public String getPlate() {
        return plate;
    }

    public type getDimension() {
        if(this.dimension == 1){
            return type.CAR;
        }
        return type.TRUCK;
    }



    enum type{

        CAR(1),
        TRUCK(3);

        type(int i) {}
    }


}
