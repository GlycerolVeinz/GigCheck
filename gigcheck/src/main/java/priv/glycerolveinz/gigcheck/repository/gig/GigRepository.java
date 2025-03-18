package priv.glycerolveinz.gigcheck.repository.gig;

import org.springframework.data.jpa.repository.JpaRepository;
import priv.glycerolveinz.gigcheck.model.gig.UpcomingGig;

public interface GigRepository extends JpaRepository<UpcomingGig, Long> {
}
