package priv.glycerolveinz.gigcheck.repository.venue;

import org.springframework.data.jpa.repository.JpaRepository;
import priv.glycerolveinz.gigcheck.model.venue.Venue;

public interface VenueRepository extends JpaRepository<Venue, Integer> {
}
