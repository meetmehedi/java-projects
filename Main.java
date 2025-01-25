public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("M3");
        car.setPrice(100000.00);
        car.setNumberOfDoors(4);

        System.out.println("Car Details: ");
        car.displayDetails();


        Bike bike = new Bike();
        bike.setBrand("Honda");
        bike.setModel("CBR");
        bike.setPrice(10000.00);
        bike.setEngineCapacity("125cc");
        System.out.println("\nBike Details:");
        bike.displayDetails();
    }
}