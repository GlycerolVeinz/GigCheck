package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Embeddable
public class GigInfo {
    @Column(name = "gig_name", nullable = false)
    private String name;

    @Column(name = "date_time", nullable = false)
    private ZonedDateTime dateTime;

    @Column(name = "description")
    private String description;
}
