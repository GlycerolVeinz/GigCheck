package priv.glycerolveinz.gigcheck.service.band;

import priv.glycerolveinz.gigcheck.model.band.Band;
import priv.glycerolveinz.gigcheck.model.band.BandInfo;
import priv.glycerolveinz.gigcheck.model.band.Genre;
import priv.glycerolveinz.gigcheck.service.basic.BasicService;

public interface BandService extends BasicService<Band, Integer> {
    Band addMusician(Band band, Integer musicianId);

    Band removeMusician(Band band, Integer musicianId);

    Band createNewBand(BandInfo bandInfo);
    Band createNewBand(BandInfo bandInfo, Genre genre);
}
