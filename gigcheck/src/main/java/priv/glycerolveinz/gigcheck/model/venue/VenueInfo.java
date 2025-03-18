package priv.glycerolveinz.gigcheck.model.venue;

import jakarta.persistence.*;

@Embeddable
public class VenueInfo {
    @Column(name = "name")
    private String name;

    @Embedded
    private GeoLocation geoLocation;
}
