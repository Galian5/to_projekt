package projekt.autobusy.reservation;

import org.junit.Test;
import projekt.autobusy.bus.Bus;
import static org.junit.Assert.assertEquals;

public class AddModelTest {

    @Test
    public void getModel() throws Exception{

        Bus bus = new Bus();
        bus.setModel("Audi");
        assertEquals("Audi",bus.getModel());

    }



}
