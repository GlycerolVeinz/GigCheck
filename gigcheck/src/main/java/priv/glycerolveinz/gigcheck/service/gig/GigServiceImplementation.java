package priv.glycerolveinz.gigcheck.service.gig;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import priv.glycerolveinz.gigcheck.model.band.Band;
import priv.glycerolveinz.gigcheck.model.gig.GigInfo;
import priv.glycerolveinz.gigcheck.model.gig.GigRecord;
import priv.glycerolveinz.gigcheck.model.gig.Gig;
import priv.glycerolveinz.gigcheck.repository.gig.GigRecordRepository;
import priv.glycerolveinz.gigcheck.repository.gig.GigRepository;
import priv.glycerolveinz.gigcheck.service.band.BandService;
import priv.glycerolveinz.gigcheck.service.basic.AbstractBasicService;

import java.util.stream.Collectors;

@Transactional
@Service
public class GigServiceImplementation extends AbstractBasicService<Gig, Long>
        implements GigService {
    private final GigRepository gigRepository;
    private final GigRecordRepository gigRecordRepository;
    private final BandService bandService;

    public GigServiceImplementation(GigRepository gigRepository, GigRecordRepository gigRecordRepository, BandService bandService) {
        this.gigRepository = gigRepository;
        this.gigRecordRepository = gigRecordRepository;
        this.bandService = bandService;
    }

    @Override
    protected JpaRepository<Gig, Long> getRepository() {
        return this.gigRepository;
    }

    @Override
    public Gig addBandToGig(Gig gig, Integer bandId) {
        gig.getAttendingBands().add(bandService.findById(bandId));
        return save(gig);
    }

    @Override
    public Gig removeBandFromGig(Gig gig, Integer bandId) {
        gig.getAttendingBands().removeIf(band -> band.getId().equals(bandId));
        return save(gig);
    }

    @Override
    public GigRecord finishGigAndMakeRecord(Gig gig) {
        GigRecord record = new GigRecord(
                gig.getGigInfo(),
                gig.getVenue().getVenueInfo(),
                gig.getAttendingBands().stream().map(Band::getBandInfo).collect(Collectors.toSet()));

        return gigRecordRepository.save(record);
    }

    @Override
    public Gig createNewGig(GigInfo gigInfo) {
        Gig gig = new Gig();
        gig.setGigInfo(gigInfo);

        return save(gig);
    }
}
