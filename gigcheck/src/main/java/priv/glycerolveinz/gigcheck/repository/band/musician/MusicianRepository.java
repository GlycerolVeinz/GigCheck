package priv.glycerolveinz.gigcheck.repository.band.musician;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import priv.glycerolveinz.gigcheck.model.band.musician.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Integer> {
}
