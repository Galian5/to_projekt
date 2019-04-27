package projekt.autobusy.reservation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ReservationRepository extends Repository<Reservation, Integer> {
    @Query("SELECT reservation FROM Reservation reservation")
    @Transactional(readOnly = true)
    List<Reservation> findAll();

    void save(Reservation reservation);
}
