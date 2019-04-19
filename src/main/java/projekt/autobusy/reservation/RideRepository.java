package projekt.autobusy.reservation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public interface RideRepository extends Repository<Ride, Integer> {
    @Query("SELECT ride FROM Ride ride")
    @Transactional(readOnly = true)
    List<Ride> findAll();

    void save(Ride ride);
}
