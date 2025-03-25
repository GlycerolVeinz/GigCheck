package priv.glycerolveinz.gigcheck.model.band;

public enum Genre {
    CLASSICAL,
    JAZZ,
    ROCK,
    POP,
    HIPHOP_RAP,
    RNB_SOUL,
    ELECTRONICA,
    COUNTRY,
    REGGAE,
    BLUES,
    FOLK_WORLD,
    METAL,
    LATIN,
    GOSPEL_RELIGIOUS,
    OTHER;

    private final int id;

    Genre(){
        this.id = this.ordinal();
    }

    @Override
    public String toString() {
        return "Genre{%s}".formatted(this.name());
    }
}
