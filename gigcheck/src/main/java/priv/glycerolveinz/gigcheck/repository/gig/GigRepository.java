package priv.glycerolveinz.gigcheck.repository.gig;

import org.springframework.data.jpa.repository.JpaRepository;
import priv.glycerolveinz.gigcheck.model.gig.Gig;

public interface GigRepository extends JpaRepository<Gig, Long> {
}
