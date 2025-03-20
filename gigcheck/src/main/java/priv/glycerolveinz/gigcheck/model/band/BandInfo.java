package priv.glycerolveinz.gigcheck.model.band;

import jakarta.persistence.*;

@Embeddable
public class BandInfo {
    @Column(name = "band_name", unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "band_email", nullable = false)
    private String email;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return "Band \"%s\" (%s), contact: %s, \"%s\"".formatted(name, genre, email, description);
    }
}
