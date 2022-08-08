package yasasi.app.dispatchApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Schedule")
public class ScheduleFuel {

    @Id
    private int orderId;
    private String fuelType;
    private int qty;
    private LocalDate scheduleDate = LocalDate.now().plusDays(4);
    private String status;

    public ScheduleFuel() {}

    public ScheduleFuel(int orderId, String fuelType, int qty, LocalDate scheduleDate, String status) {
        this.orderId = orderId;
        this.fuelType = fuelType;
        this.qty = qty;
        this.scheduleDate = scheduleDate;
        this.status = status;
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

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate() {
        this.scheduleDate = scheduleDate;
    }

    public String getStatus(String scheduled) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ScheduleFuel{" +
                "orderId=" + orderId +
                ", fuelType='" + fuelType + '\'' +
                ", qty=" + qty +
                ", scheduleDate=" + scheduleDate +
                ", status='" + status + '\'' +
                '}';
    }
}
