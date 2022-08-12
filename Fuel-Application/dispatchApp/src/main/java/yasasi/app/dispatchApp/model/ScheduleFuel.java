package yasasi.app.dispatchApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Schedule")
public class ScheduleFuel {

    @Id
    private int orderId;
    private String scheduleDate ;


    public ScheduleFuel() {}

    public ScheduleFuel(int orderId, String scheduleDate) {
        this.orderId = orderId;
        this.scheduleDate = scheduleDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @Override
    public String toString() {
        return "ScheduleFuel{" +
                "orderId=" + orderId +
                ", scheduleDate='" + scheduleDate + '\'' +
                '}';
    }
}
