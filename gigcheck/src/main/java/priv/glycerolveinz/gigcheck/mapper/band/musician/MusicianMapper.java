package priv.glycerolveinz.gigcheck.mapper.band.musician;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import priv.glycerolveinz.gigcheck.dto.band.musician.MusicianResponce;
import priv.glycerolveinz.gigcheck.model.band.musician.Musician;

@Mapper(componentModel = "spring")
public interface MusicianMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "musicianInfo.firstName", target = "firstName")
    @Mapping(source = "musicianInfo.lastName", target = "lastName")
    @Mapping(source = "musicianInfo.nickname", target = "nickname")
    MusicianResponce toDTO(Musician musician);
}
