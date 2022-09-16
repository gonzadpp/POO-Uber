public class CarBasic extends Car {
    
    String brand;
    String model;

    public CarBasic(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
        
        //TODO Auto-generated constructor stub
    }

    @Override
    public void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Model: " + model + " Brand: " + brand);
    }
    
}
