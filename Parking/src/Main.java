public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking("Flex", 4);
        Vehicle v1 = new Vehicle("AV155FR", 1);
        Vehicle v2 = new Vehicle("FR155LL", 3);

        try {
            System.out.println(parking.addVehicle(v1));
            System.out.println(parking.addVehicle(v2));
        } catch (Exception e) {
            System.out.printf("Vehicle not flex");
        }

    }
}
