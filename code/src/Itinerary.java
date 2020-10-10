import java.util.Date;
import java.util.List;

public class Itinerary {
    private String customerId;
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private List<FlightReservation> reservations;

    public boolean makeReservation();
    public boolean makePayment();

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Airport getStartingAirport() {
        return startingAirport;
    }
    public void setStartingAirport(Airport startingAirport) {
        this.startingAirport = startingAirport;
    }

    public Airport getFinalAirport() {
        return finalAirport;
    }
    public void setFinalAirport(Airport finalAirport) {
        this.finalAirport = finalAirport;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setReservations(List<FlightReservation> reservations) {
        this.reservations = reservations;
    }
    public List<FlightReservation> getReservations() { return reservations; }
}