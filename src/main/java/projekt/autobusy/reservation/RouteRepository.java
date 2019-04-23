package projekt.autobusy.reservation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public interface RouteRepository extends Repository<Route, Integer> {
    @Query("SELECT DISTINCT route FROM Route route left join fetch route.rides")
    @Transactional(readOnly = true)
    List<Route> findAll();

    @Query("SELECT route FROM Route route left join fetch route.rides WHERE route.id =:id")
    @Transactional(readOnly = true)
    Route findById(@Param("id") Integer id);

    void save(Route route);
}
