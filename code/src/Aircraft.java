import java.util.List;

public class Aircraft {
    private String name, model;
    private int manufacturingYear;
    private List<Seat> seats;
    private List<FlightInstance> flightInstanceList;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public List<Seat> getSeats() {
        return seats;
    }
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<FlightInstance> getFlightInstanceList() {
        return flightInstanceList;
    }
    public void setFlightInstanceList(List<FlightInstance> flightInstanceList) {
        this.flightInstanceList = flightInstanceList;
    }
}