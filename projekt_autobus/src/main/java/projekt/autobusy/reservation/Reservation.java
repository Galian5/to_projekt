package projekt.autobusy.reservation;

import projekt.autobusy.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "ride_id")
    private Ride ride;

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }
}
