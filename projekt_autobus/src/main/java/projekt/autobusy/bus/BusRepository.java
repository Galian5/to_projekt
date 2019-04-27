package projekt.autobusy.bus;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;

@org.springframework.stereotype.Repository
public interface BusRepository extends Repository<Bus, Integer> {
    @Query("SELECT bus FROM Bus bus")
    @Transactional(readOnly = true)
    Collection<Bus> findBuses();

    void save(Bus bus);
}
