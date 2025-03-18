package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import priv.glycerolveinz.gigcheck.model.band.Band;
import priv.glycerolveinz.gigcheck.model.venue.Venue;

import java.util.Set;

@Entity
@Table(name = "upcoming_gigs")
@Getter
@Setter
public class UpcomingGig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private GigInfo gigInfo;

    @ManyToMany
    @JoinTable(
            name = "gig_bands",
            joinColumns = @JoinColumn(name = "gig_id"),
            inverseJoinColumns = @JoinColumn(name = "band_id")
    )
    private Set<Band> attendingBands;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

}
