package projekt.autobusy.reservation;

import org.junit.Test;

import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class RideTimeTest {

    @Test
    public void getRideTime() {
        Ride ride1 =new Ride();
        ride1.setRideTime(LocalDate.now());
        assertEquals(LocalDate.now(),ride1.getRideTime());
    }
}
