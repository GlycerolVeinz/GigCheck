package priv.glycerolveinz.gigcheck.model.venue;

import jakarta.persistence.*;

@Embeddable
public class VenueInfo {
    @Column(name = "venue_name", nullable = false)
    private String name;

    @Column(name = "venue_email", nullable = false)
    private String email;

    @Column(name = "description")
    private String description;

    @Embedded
    private GeoLocation geoLocation;
}
