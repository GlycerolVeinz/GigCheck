package priv.glycerolveinz.gigcheck.service.gig;

import priv.glycerolveinz.gigcheck.model.gig.GigInfo;
import priv.glycerolveinz.gigcheck.model.gig.GigRecord;
import priv.glycerolveinz.gigcheck.model.gig.UpcomingGig;
import priv.glycerolveinz.gigcheck.service.basic.BasicService;

import java.time.ZonedDateTime;

public interface GigService extends BasicService<UpcomingGig, Long> {
    UpcomingGig addBandToGig(UpcomingGig gig, Integer bandId);
    UpcomingGig removeBandFromGig(UpcomingGig gig, Integer bandId);

    GigRecord finishGigAndMakeRecord(UpcomingGig gig);
    UpcomingGig createNewGig(GigInfo gigInfo);
}
