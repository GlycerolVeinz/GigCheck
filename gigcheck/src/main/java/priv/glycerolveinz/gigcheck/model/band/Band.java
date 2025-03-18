package priv.glycerolveinz.gigcheck.model.band;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import priv.glycerolveinz.gigcheck.model.band.musician.Musician;
import priv.glycerolveinz.gigcheck.model.gig.UpcomingGig;

import java.util.Set;

@Entity
@Table(name = "bands")
@Getter
@Setter
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private BandInfo bandInfo;

    @ManyToMany
    @JoinTable(
            name = "band_members",
            joinColumns = @JoinColumn(name = "band_id"),
            inverseJoinColumns = @JoinColumn(name = "musician_id")
    )
    private Set<Musician> members;

    @ManyToMany(mappedBy = "attendingBands")
    private Set<UpcomingGig> upcomingGigs;
}
