public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Welcome to Uber");
        UberX uberX = new UberX("FEWE23Q23", new Account("Carlos Vasquez", "16937212", "carlos.v@gmail.com", "car10s.v"), "Seat", "Leon");
        uberX.setPassenger(4);
        uberX.printDataCar();
    }
}
