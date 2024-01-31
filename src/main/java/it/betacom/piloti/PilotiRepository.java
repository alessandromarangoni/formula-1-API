package it.betacom.piloti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.betacom.piloti.Piloti;

@Repository
public interface PilotiRepository extends JpaRepository<Piloti, Long> {
}