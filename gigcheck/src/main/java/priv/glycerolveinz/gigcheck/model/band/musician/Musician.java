package priv.glycerolveinz.gigcheck.model.band.musician;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import priv.glycerolveinz.gigcheck.model.band.Band;

import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "musicians")
@Getter
@Setter
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private MusicianInfo musicianInfo;

    @ElementCollection
    @CollectionTable(name = "instrument_proficiency", joinColumns = @JoinColumn(name = "musician_id"))
    @MapKeyColumn(name = "instrument")
    @Column(name = "proficiency")
    @Enumerated(EnumType.STRING)
    private Map<Instrument, Proficiency> instrumentProficiency;

    @ManyToMany(mappedBy = "members")
    private Set<Band> bands;
}
