package projekt.autobusy.reservation;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/routes/{routeId}/rides/{rideId}")
public class ReservationController {

    private ReservationRepository reservations;
    private RideRepository rides;

    public ReservationController(ReservationRepository reservations,
    RideRepository rides) {
        this.reservations = reservations;
        this.rides = rides;
    }

    @ModelAttribute("ride")
    public Ride findRide(@PathVariable("rideId") int rideId) {
        return this.rides.findById(rideId);
    }

    @RequestMapping(value = "/reservations", method = RequestMethod.GET, produces = "application/json")
    public List<Reservation> getAll() {
        return reservations.findAll();
    }

    @PostMapping("/reservations")
    public RedirectView newReservation(Ride ride, Reservation reservation, ModelMap model) {

        ride.addReservation(reservation);
        reservation.setRide(ride);
        this.reservations.save(reservation);
        return new RedirectView("/reservations.html");
//        return "redirect:reservations.html";
    }

//    @PostMapping("/reservations")
//    public String createReservation(Ride ride, Reservation reservation, ModelMap map) {
//        System.out.println("ride id: " + ride.getId());
//
//        reservation.setRide(ride);
//        ride.addReservation(reservation);
//
//        reservations.save(reservation);
//
//        return "redirect:/routes/{routeId}/rides{";
//    }
}
