package yasasi.app.fuelApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.StringJoiner;


@Document(collection = "Order")
public class Order {


    @Id
    private int orderId;
    private String stationId;
    private String stationName;
    private  String location;
    private String fuelType;
    private Integer amount;
    private String status= "Pending";

    public Order(){}

    public Order(int orderId, String stationId, String stationName, String location, String fuelType, Integer amount, String status) {
        super();
        this.orderId = orderId;
        this.stationId = stationId;
        this.stationName = stationName;
        this.location = location;
        this.fuelType = fuelType;
        this.amount = amount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", location='" + location + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
