import metadata.ReservationStatus;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;

    public static FlightReservation fetchReservationDetails(String reservationNumber);
    public List<Passenger> getPassengers();

    public String getReservationNumber() {
        return reservationNumber;
    }
    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public FlightInstance getFlight() {
        return flight;
    }
    public void setFlight(FlightInstance flight) {
        this.flight = flight;
    }

    public Map<Passenger, FlightSeat> getSeatMap() {
        return seatMap;
    }
    public void setSeatMap(Map<Passenger, FlightSeat> seatMap) {
        this.seatMap = seatMap;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}