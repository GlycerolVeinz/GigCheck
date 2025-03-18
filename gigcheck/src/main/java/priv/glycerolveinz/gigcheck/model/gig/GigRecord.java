package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;
import priv.glycerolveinz.gigcheck.model.band.BandInfo;
import priv.glycerolveinz.gigcheck.model.venue.VenueInfo;

@Entity
public record GigRecord(
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id,

   @Embedded
   BandInfo bandInfo,

   @Embedded
   GigInfo gigInfo,

   @Embedded
   VenueInfo venueInfo
){ }