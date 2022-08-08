package yasasi.app.dispatchApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ResFuel")
public class ReserveFuel {

    @Id
    private int orderId;
    private String fuelType;
    private int qty;

    public ReserveFuel(){}

    public ReserveFuel(int orderId, String fuelType, int qty) {
        this.orderId = orderId;
        this.fuelType = fuelType;
        this.qty = qty;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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


}
