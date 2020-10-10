import java.sql.Time;
import java.util.Date;

public class CustomSchedule {
    private Date customDate;
    private Time departureTime;

    public Date getCustomDate() {
        return customDate;
    }
    public void setCustomDate(Date customDate) {
        this.customDate = customDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
}