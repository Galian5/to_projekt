package projekt.autobusy.reservation;


import org.springframework.web.bind.annotation.*;

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
}
