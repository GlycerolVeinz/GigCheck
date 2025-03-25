package priv.glycerolveinz.gigcheck.dto.gig;

import java.time.ZonedDateTime;
import java.util.List;

public record GigRecordResponce (
    Long id,
    String gigName,
    String gigDescription,
    ZonedDateTime dateTime,
    String venueName,
    String venueDescription,
    List<String> bandNames
){

}
