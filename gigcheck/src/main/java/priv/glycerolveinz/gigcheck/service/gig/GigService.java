package priv.glycerolveinz.gigcheck.service.gig;

import priv.glycerolveinz.gigcheck.model.gig.GigInfo;
import priv.glycerolveinz.gigcheck.model.gig.GigRecord;
import priv.glycerolveinz.gigcheck.model.gig.Gig;
import priv.glycerolveinz.gigcheck.service.basic.BasicService;

public interface GigService extends BasicService<Gig, Long> {
    Gig addBandToGig(Gig gig, Integer bandId);
    Gig removeBandFromGig(Gig gig, Integer bandId);

    GigRecord finishGigAndMakeRecord(Gig gig);
    Gig createNewGig(GigInfo gigInfo);
}
