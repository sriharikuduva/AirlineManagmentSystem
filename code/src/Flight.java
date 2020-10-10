import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure, arrival;
    private int durationInMinutes;

    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    private List<FlightInstance> flightInstances;


    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airport getDeparture() {
        return departure;
    }
    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }
    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public List<WeeklySchedule> getWeeklySchedules() {
        return weeklySchedules;
    }
    public void setWeeklySchedules(List<WeeklySchedule> weeklySchedules) {
        this.weeklySchedules = weeklySchedules;
    }

    public List<CustomSchedule> getCustomSchedules() {
        return customSchedules;
    }
    public void setCustomSchedules(List<CustomSchedule> customSchedules) {
        this.customSchedules = customSchedules;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }
    public void setFlightInstances(List<FlightInstance> flightInstances) {
        this.flightInstances = flightInstances;
    }
}