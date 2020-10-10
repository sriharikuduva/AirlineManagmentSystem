import metadata.SeatClass;
import metadata.SeatType;

public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass _class;

    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getType() {
        return type;
    }
    public void setType(SeatType type) {
        this.type = type;
    }

    public SeatClass get_class() {
        return _class;
    }
    public void set_class(SeatClass _class) {
        this._class = _class;
    }
}