package priv.glycerolveinz.gigcheck.model.venue;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import priv.glycerolveinz.gigcheck.model.gig.Gig;

import java.util.Set;

@Entity
@Table(name = "venues")
@Getter
@Setter
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private VenueInfo venueInfo;

    @OneToMany
    @JoinColumn(name = "upcoming_gig_id")
    private Set<Gig> gigs;
}
