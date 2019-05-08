package projekt.autobusy.reservation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideIdTest {

    Ride ride1 = new Ride();

    @Test
    public void getId() {
        ride1.setId(1);
        assertEquals(Integer.valueOf(1),ride1.getId());

    }
}
