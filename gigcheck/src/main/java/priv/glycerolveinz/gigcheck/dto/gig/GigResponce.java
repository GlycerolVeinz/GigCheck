package priv.glycerolveinz.gigcheck.dto.gig;

import java.time.ZonedDateTime;

public record GigResponce (
     Long id,
     String name,
     String description,
     ZonedDateTime dateTime,
     String venueName
) {}
