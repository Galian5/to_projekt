package projekt.autobusy.reservation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteIdTest {
    Route route1 = new Route();

    @Test
    public void getId() {
        route1.setId(1);
        assertEquals(Integer.valueOf(1),route1.getId());

    }
}
