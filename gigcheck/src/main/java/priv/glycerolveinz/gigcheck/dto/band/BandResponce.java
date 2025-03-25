package priv.glycerolveinz.gigcheck.dto.band;

import priv.glycerolveinz.gigcheck.model.band.Genre;

public record BandResponce (
    Integer id,
    String name,
    Genre genre,
    String bandEmail,
    String description
) {}
