package priv.glycerolveinz.gigcheck.service.venue;

import priv.glycerolveinz.gigcheck.model.gig.GigInfo;
import priv.glycerolveinz.gigcheck.model.gig.UpcomingGig;
import priv.glycerolveinz.gigcheck.model.venue.Venue;
import priv.glycerolveinz.gigcheck.model.venue.VenueInfo;

public interface VenueService {
    Venue addUpcomingGig(Venue venue, Integer gigId);
    Venue removeUpcomingGig(Venue venue, Integer gigId);

    Venue createNewVenue(VenueInfo venueInfo);
}
