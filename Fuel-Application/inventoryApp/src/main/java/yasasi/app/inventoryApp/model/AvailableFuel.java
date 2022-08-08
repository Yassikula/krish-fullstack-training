package yasasi.app.inventoryApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "AvaFuel")
public class AvailableFuel {

    @Id
    private int id;
    private String fuelType;
    private int qty;

    public AvailableFuel() {
    }

    public AvailableFuel(int id, String fuelType, int qty) {
        super();
        this.id = id;
        this.fuelType = fuelType;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "AvailableFuel{" +
                "id=" + id +
                ", fuelType='" + fuelType + '\'' +
                ", qty=" + qty +
                '}';
    }
}
