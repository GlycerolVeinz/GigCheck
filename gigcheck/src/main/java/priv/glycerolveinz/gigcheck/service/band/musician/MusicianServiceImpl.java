package priv.glycerolveinz.gigcheck.service.band.musician;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import priv.glycerolveinz.gigcheck.model.band.musician.Instrument;
import priv.glycerolveinz.gigcheck.model.band.musician.Musician;
import priv.glycerolveinz.gigcheck.model.band.musician.MusicianInfo;
import priv.glycerolveinz.gigcheck.model.band.musician.Proficiency;
import priv.glycerolveinz.gigcheck.repository.band.musician.MusicianRepository;
import priv.glycerolveinz.gigcheck.service.basic.AbstractBasicService;

import java.util.Map;

@Transactional
@Service
public class MusicianServiceImpl extends AbstractBasicService<Musician, Integer>
        implements MusicianService {

    private final MusicianRepository musicianRepository;

    public MusicianServiceImpl(MusicianRepository musicianRepository) {
        this.musicianRepository = musicianRepository;
    }

    @Override
    public Musician addInstrumentProficiency(Musician musician, Instrument instrument, Proficiency proficiency) {
        musician.getInstrumentProficiency().put(instrument, proficiency);
        return save(musician);
    }

    @Override
    public Musician updateInstrumentProficiency(Musician musician, Instrument instrument, Proficiency proficiency) {
        musician.getInstrumentProficiency().replace(instrument, proficiency);
        return save(musician);
    }

    @Override
    public Musician removeInstrumentProficiency(Musician musician, Instrument instrument) {
        musician.getInstrumentProficiency().remove(instrument);
        return save(musician);
    }

    @Override
    public Musician createNewMusician(MusicianInfo musicianInfo) {
        return createNewMusician(musicianInfo, Map.of());
    }

    @Override
    public Musician createNewMusician(MusicianInfo musicianInfo, Map<Instrument, Proficiency> instrumentProficiency) {
        Musician musician = new Musician();

        musician.setMusicianInfo(musicianInfo);
        musician.setInstrumentProficiency(instrumentProficiency);

        return save(musician);
    }

    @Override
    protected JpaRepository<Musician, Integer> getRepository() {
        return this.musicianRepository;
    }
}
