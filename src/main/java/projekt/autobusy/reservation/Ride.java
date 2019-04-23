package projekt.autobusy.reservation;

import org.springframework.format.annotation.DateTimeFormat;
import projekt.autobusy.model.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "rides")
public class Ride extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(name = "ride_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rideTime;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ride")
    private Set<Reservation> reservations = new LinkedHashSet<>();


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public LocalDate getRideTime() {
        return rideTime;
    }

    public void setRideTime(LocalDate rideTime) {
        this.rideTime = rideTime;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

//    public Set<Reservation> getReservations() {
//        return reservations;
//    }
//
//    public void setReservations(Set<Reservation> reservations) {
//        this.reservations = reservations;
//    }
}
