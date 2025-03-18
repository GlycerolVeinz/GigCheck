package priv.glycerolveinz.gigcheck.model.venue;

import jakarta.persistence.*;

import java.util.Set;

@Embeddable
public class GeoLocation {
    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;
}
