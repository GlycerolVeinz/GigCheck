package priv.glycerolveinz.gigcheck.dto.venue;

import priv.glycerolveinz.gigcheck.model.venue.GeoLocation;

public record VenueResponce (
    String name,
    String description,
    String email,
    GeoLocation geoLocation
) {}
