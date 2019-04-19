package projekt.autobusy.reservation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RideController {

    private final RideRepository rides;
    private final RouteRepository routes;

    public RideController(RideRepository rides, RouteRepository routes) {
        this.rides = rides;
        this.routes = routes;
    }

    @RequestMapping(value = "/rides", method = RequestMethod.GET, produces = "application/json")
    public List<Ride> getRides() {
        return this.rides.findAll();
    }
}
