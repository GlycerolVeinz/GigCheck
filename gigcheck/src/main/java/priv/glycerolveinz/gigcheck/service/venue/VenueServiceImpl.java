package priv.glycerolveinz.gigcheck.service.venue;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import priv.glycerolveinz.gigcheck.model.venue.Venue;
import priv.glycerolveinz.gigcheck.model.venue.VenueInfo;
import priv.glycerolveinz.gigcheck.repository.venue.VenueRepository;
import priv.glycerolveinz.gigcheck.service.basic.AbstractBasicService;
import priv.glycerolveinz.gigcheck.service.gig.GigService;

@Service
@Transactional
public class VenueServiceImpl extends AbstractBasicService<Venue, Integer> implements VenueService {
    private final VenueRepository venueRepository;
    private final GigService gigService;

    public VenueServiceImpl(VenueRepository venueRepository, GigService gigService) {
        this.venueRepository = venueRepository;
        this.gigService = gigService;
    }

    @Override
    protected JpaRepository<Venue, Integer> getRepository() {
        return venueRepository;
    }

    @Override
    public Venue addUpcomingGig(Venue venue, Integer gigId) {
        venue.getGigs().add(gigService.findById(Long.valueOf(gigId)));
        return save(venue);
    }

    @Override
    public Venue removeUpcomingGig(Venue venue, Integer gigId) {
        venue.getGigs().removeIf(gig -> gig.getId().equals(Long.valueOf(gigId)));
        return save(venue);
    }

    @Override
    public Venue createNewVenue(VenueInfo venueInfo) {
        Venue venue = new Venue();
        venue.setVenueInfo(venueInfo);
        return save(venue);
    }
}
