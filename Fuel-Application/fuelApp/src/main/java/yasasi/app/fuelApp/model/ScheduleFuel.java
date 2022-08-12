package yasasi.app.fuelApp.model;




public class ScheduleFuel {


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
