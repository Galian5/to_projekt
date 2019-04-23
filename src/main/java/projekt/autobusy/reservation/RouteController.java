package projekt.autobusy.reservation;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RouteController {

    private final RouteRepository routes;

    public RouteController(RouteRepository routes) {
        this.routes = routes;
    }

    @RequestMapping(value = "/routes", method = RequestMethod.GET, produces = "application/json")
    public List<Route> getRides() {
        return this.routes.findAll();
    }

    @PostMapping(value = "/routes")
    public String createRoute(Route route) {
        routes.save(route);
        return "redirect:/routes/{routeId}";
    }

    @RequestMapping(value = "/routes/{routeId}", method = RequestMethod.GET, produces = "application/json")
    public Route getRoute(@PathVariable("routeId") int routeId) {
        return routes.findById(routeId);
    }
}
