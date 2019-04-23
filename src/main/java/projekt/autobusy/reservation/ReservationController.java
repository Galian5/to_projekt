package projekt.autobusy.reservation;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import projekt.autobusy.bus.Bus;

import java.util.List;

@RestController
public class ReservationController {

    private ReservationRepository reservations;

    public ReservationController(ReservationRepository reservations) {
        this.reservations = reservations;
    }

    @RequestMapping(value = "/reservations", method = RequestMethod.GET, produces = "application/json")
    public List<Reservation> getAll() {
        return reservations.findAll();
    }

    @PostMapping("/reservations")
    public String newReservation(Ride ride, Reservation reservation, ModelMap model) {

        ride.addReservation(reservation);
        this.reservations.save(reservation);

        return "redirect:reservations.html";
    }
}
