package projekt.autobusy.reservation;

import projekt.autobusy.model.BaseEntity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(name = "start_city")
    private String startCity;

    @Column(name = "end_city")
    private String endCity;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "route")
    private Set<Ride> rides = new LinkedHashSet<>();

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }
}
