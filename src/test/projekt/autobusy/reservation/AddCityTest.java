package projekt.autobusy.reservation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddCityTest {


    @Test
    public void getStartCity() throws Exception{

        Route route = new Route();
       route.setStartCity("Cracow");
        assertEquals("Cracow",route.getStartCity());

    }

    @Test
    public void getEndCity() throws Exception{

        Route route = new Route();
        route.setEndCity("Lublin");
        assertEquals("Lublin",route.getEndCity());

    }
}
