package priv.glycerolveinz.gigcheck.repository.gig;

import org.springframework.data.jpa.repository.JpaRepository;
import priv.glycerolveinz.gigcheck.model.gig.GigRecord;

public interface GigRecordRepository extends JpaRepository<GigRecord, Long> {
}
