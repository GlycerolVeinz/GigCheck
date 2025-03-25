package priv.glycerolveinz.gigcheck.service.band.musician;

import priv.glycerolveinz.gigcheck.model.band.Band;
import priv.glycerolveinz.gigcheck.model.band.musician.Instrument;
import priv.glycerolveinz.gigcheck.model.band.musician.Musician;
import priv.glycerolveinz.gigcheck.model.band.musician.MusicianInfo;
import priv.glycerolveinz.gigcheck.model.band.musician.Proficiency;
import priv.glycerolveinz.gigcheck.service.basic.BasicService;

import java.util.Map;

public interface MusicianService extends BasicService<Musician, Integer> {
    Musician addInstrumentProficiency(Musician musician, Instrument instrument, Proficiency proficiency);

    Musician updateInstrumentProficiency(Musician musician, Instrument instrument, Proficiency proficiency);

    Musician removeInstrumentProficiency(Musician musician, Instrument instrument);

    Musician createNewMusician(MusicianInfo musicianInfo);
    Musician createNewMusician(MusicianInfo musicianInfo, Map<Instrument, Proficiency> instrumentProficiency);
}
