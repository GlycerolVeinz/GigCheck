package priv.glycerolveinz.gigcheck.repository.band;

import org.springframework.data.jpa.repository.JpaRepository;
import priv.glycerolveinz.gigcheck.model.band.Band;

public interface BandRepository extends JpaRepository<Band, Integer> {
}
