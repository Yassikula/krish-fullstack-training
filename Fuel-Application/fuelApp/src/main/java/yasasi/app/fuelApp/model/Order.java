package yasasi.app.fuelApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.StringJoiner;


@Document(collection = "Order")
public class Order {


    @Id
    private int orderId;
    private int stationId;
    private String stationName;
    private  String location;
    private String fuelType;
    private Integer amount;
    private String status;
    private String scheduleDate;

    public Order(){}


    public Order(int orderId, int stationId, String stationName, String location, String fuelType, Integer amount, String status, String scheduleDate) {
       super();
        this.orderId = orderId;
        this.stationId = stationId;
        this.stationName = stationName;
        this.location = location;
        this.fuelType = fuelType;
        this.amount = amount;
        this.status = status;
        this.scheduleDate = scheduleDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
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

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", location='" + location + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", scheduleDate='" + scheduleDate + '\'' +
                '}';
    }
}
