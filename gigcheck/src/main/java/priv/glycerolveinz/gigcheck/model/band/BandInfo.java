package priv.glycerolveinz.gigcheck.model.band;

import jakarta.persistence.*;

@Embeddable
public class BandInfo {
    @Column(name = "band_name", unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "description")
    private String description;

}
