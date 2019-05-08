package projekt.autobusy.reservation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RouteTest {


    Ride ride1 = new Ride();

    @Test
    public void getRoute() {
        Route route1 = new Route();
        ride1.setRoute(route1);
        assertEquals(route1,ride1.getRoute());

    }
}
