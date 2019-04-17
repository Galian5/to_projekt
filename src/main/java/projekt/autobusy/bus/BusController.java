package projekt.autobusy.bus;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
public class BusController {
    private final BusRepository buses;

    public BusController(BusRepository busRepository) {
        this.buses = busRepository;
    }

    @RequestMapping(value = "/buses", method = RequestMethod.GET, produces = "application/json")
    public Collection<Bus> getBuses() {
        return buses.findBuses();
    }

    @PostMapping("/buses")
    public String newBus(Bus bus) {
        this.buses.save(bus);
        return "redirect:buses.html";
    }

}
