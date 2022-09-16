import java.util.ArrayList;
import java.util.Map;

public class UberVan extends CarAdvanced {

    Integer passenger;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver, typeCarAccepted, seatsMaterial);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros para UberVan.");
        }
    }
    
}
