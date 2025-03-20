package priv.glycerolveinz.gigcheck.service.band;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import priv.glycerolveinz.gigcheck.model.band.Band;
import priv.glycerolveinz.gigcheck.model.band.BandInfo;
import priv.glycerolveinz.gigcheck.repository.band.BandRepository;
import priv.glycerolveinz.gigcheck.service.band.musician.MusicianService;
import priv.glycerolveinz.gigcheck.service.basic.AbstractBasicService;

@Transactional
@Service
public class BandServiceImpl extends AbstractBasicService<Band, Integer>
        implements BandService {
    private final BandRepository bandRepository;
    private final MusicianService musicianService;

    public BandServiceImpl(BandRepository bandRepository, MusicianService musicianService) {
        this.bandRepository = bandRepository;
        this.musicianService = musicianService;
    }

    @Override
    public Band addMusician(Band band, Integer musicianId) {
        band.getMembers().add(musicianService.findById(musicianId));
        return save(band);
    }

    @Override
    public Band removeMusician(Band band, Integer musicianId) {
        band.getMembers().remove(musicianService.findById(musicianId));
        return save(band);
    }

    @Override
    public Band createNewBand(BandInfo bandInfo) {
        Band band = new Band();
        band.setBandInfo(bandInfo);
        return save(band);
    }

    @Override
    protected JpaRepository<Band, Integer> getRepository() {
        return bandRepository;
    }
}
