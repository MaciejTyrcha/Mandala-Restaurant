package pl.coderslab.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.domain.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}