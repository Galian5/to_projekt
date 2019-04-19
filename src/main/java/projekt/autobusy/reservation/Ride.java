package projekt.autobusy.reservation;

import org.springframework.format.annotation.DateTimeFormat;
import projekt.autobusy.model.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rides")
public class Ride extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(name = "ride_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rideTime;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ride")
//    private Set<Reservation> reservations;

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

//    public Set<Reservation> getReservations() {
//        return reservations;
//    }
//
//    public void setReservations(Set<Reservation> reservations) {
//        this.reservations = reservations;
//    }
}
