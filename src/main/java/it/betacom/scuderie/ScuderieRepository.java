package it.betacom.scuderie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.betacom.scuderie.Scuderie;

@Repository
public interface ScuderieRepository extends JpaRepository<Scuderie, Long> {
}