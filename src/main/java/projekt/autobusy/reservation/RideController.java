package projekt.autobusy.reservation;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/routes/{routeId}")
public class RideController {

    private final RideRepository rides;
    private final RouteRepository routes;

    public RideController(RideRepository rides, RouteRepository routes) {
        this.rides = rides;
        this.routes = routes;
    }

    @ModelAttribute("route")
    public Route findRoute(@PathVariable("routeId") int routeId) {
        return this.routes.findById(routeId);
    }


    @RequestMapping(value = "/rides/{rideId}", method = RequestMethod.GET, produces = "application/json")
    public Ride getRide(@PathVariable("rideId") int rideId){
        return rides.findById(rideId);
    }

    @RequestMapping(value = "/rides", method = RequestMethod.GET, produces = "application/json")
    public List<Ride> getRides(Route route){
        List<Ride> all = rides.findAll();
        all.removeIf(ride -> !ride.getRoute().getId().equals(route.getId()));

        return all;
    }


    @PostMapping("/rides")
    public RedirectView createRide(Route route, Ride ride, ModelMap map) {
        System.out.println("route id: " + route.getId());
        ride.setRoute(route);
        System.out.println(ride.getRoute());
        System.out.println(map);
        route.addRide(ride);

        rides.save(ride);

//        return "redirect:/routes/{routeId}";
        return new RedirectView("/rides.html");
    }
}
