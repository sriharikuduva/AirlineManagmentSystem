import metadata.FlightStatus;

import java.util.Date;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;

    public bool cancel();
    public void updateStatus(FlightStatus status);

    public Date getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getGate() {
        return gate;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }

    public FlightStatus getStatus() {
        return status;
    }
    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}