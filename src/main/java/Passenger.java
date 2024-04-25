import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

    private int passengerId;
    private String passengerName;
    private int passengerAge;
    /*private String seatAllocatedId;*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return passengerId == passenger.passengerId && passengerAge == passenger.passengerAge && Objects.equals(passengerName, passenger.passengerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, passengerName, passengerAge);
    }
}
