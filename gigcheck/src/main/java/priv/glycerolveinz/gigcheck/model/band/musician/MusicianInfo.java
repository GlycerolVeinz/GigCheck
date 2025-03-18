package priv.glycerolveinz.gigcheck.model.band.musician;

import jakarta.persistence.*;

@Embeddable
public class MusicianInfo {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nick_name")
    private String nickname;
}
