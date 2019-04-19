package projekt.autobusy.reservation;

import projekt.autobusy.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(name = "start_city")
    private String startCity;

    @Column(name = "end_city")
    private String endCity;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "route")
//    private Set<Ride> rides;

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

//    public Set<Ride> getRides() {
//        return rides;
//    }

//    public void setRides(Set<Ride> rides) {
//        this.rides = rides;
//    }
}
