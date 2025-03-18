package priv.glycerolveinz.gigcheck.service.gig;

import priv.glycerolveinz.gigcheck.model.gig.GigInfo;
import priv.glycerolveinz.gigcheck.model.gig.GigRecord;
import priv.glycerolveinz.gigcheck.model.gig.UpcomingGig;

import java.time.ZonedDateTime;

public interface GigService {
    UpcomingGig addBandToGig(UpcomingGig gig, Integer bandId);

    GigRecord finishGigAndMakeRecord(Integer gigId);

    UpcomingGig createNewGig(GigInfo gigInfo);
}
