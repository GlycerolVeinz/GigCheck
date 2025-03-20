package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;
import priv.glycerolveinz.gigcheck.model.band.BandInfo;
import priv.glycerolveinz.gigcheck.model.venue.VenueInfo;

import java.util.Set;

@Entity
public record GigRecord(
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id,

   @Embedded
   GigInfo gigInfo,

   @Embedded
   VenueInfo venueInfo,

   @ElementCollection
   @CollectionTable(name = "gig_band_infos", joinColumns = @JoinColumn(name = "gig_record_id"))
   Set<BandInfo> bandInfos

){
   @Override
   public String toString() {
      String bandInfosStr = bandInfos.stream().map(BandInfo::toString).reduce("", (a, b) -> a + b + ",\n");

      return "GigRecord %d:\nbands: %s\nabout gig: %s\nabout venue: %s\n".formatted(id, bandInfosStr, gigInfo, venueInfo);
   }

   public GigRecord(GigInfo gigInfo, VenueInfo venueInfo, Set<BandInfo> bandInfos){
      this(null, gigInfo, venueInfo, bandInfos);
   }
}