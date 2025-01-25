 class Vehicle {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
           }
    public void setBrand(String brand) {

        this.brand = brand;
    }
    public String getModel(){

        return model;
    }
    public void setModel(String model){
        this.model = model;

    }
    public double getPrice(){

        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
class Car extends Vehicle{
    private int numberOfDoors;
     public int getNumberOfDoors(){

         return numberOfDoors;
     }
     public void setNumberOfDoors(int numberOfDoors){

         this.numberOfDoors = numberOfDoors;
     }
     @Override
    public void displayDetails(){
         super.displayDetails();
         System.out.println("Number of doors: " + numberOfDoors);
     }
}
class Bike extends Vehicle{
    private String engineCapacity;
    public String getEngineCapacity(){

        return engineCapacity;
    }
    public void setEngineCapacity(String engineCapacity){

        this.engineCapacity = engineCapacity;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Engine capacity: " + engineCapacity);
    }
}
