package yasasi.app.distributionApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Distribution")
public class Dispatch {

    @Id
    private int orderId;
    private String scheduleDate;



    public Dispatch() {
    }

    public Dispatch(int orderId, String scheduleDate) {
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
        return "Dispatch{" +
                "orderId=" + orderId +
                ", scheduleDate='" + scheduleDate + '\'' +
                '}';
    }
}
