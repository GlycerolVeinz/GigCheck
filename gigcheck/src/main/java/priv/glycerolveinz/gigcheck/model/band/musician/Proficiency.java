package priv.glycerolveinz.gigcheck.model.band.musician;

public enum Proficiency {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED,
    EXPERT,
    GODLIKE;

    private final int id;

    Proficiency(){
        this.id = this.ordinal();
    }

    @Override
    public String toString() {
        return "Proficiency{%s}".formatted(this.name());
    }
}
