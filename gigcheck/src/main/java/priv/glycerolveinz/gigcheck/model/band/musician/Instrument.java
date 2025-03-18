package priv.glycerolveinz.gigcheck.model.band.musician;

import lombok.Getter;

@Getter
public enum Instrument {
    OTHER,
    GUITAR,
    BASS,
    DRUMS,
    VOCALS,
    KEYBOARD,
    DJ,
    WIND_INSTRUMENT;

    private final int id;

    Instrument(){
        this.id = this.ordinal();
    }
}
