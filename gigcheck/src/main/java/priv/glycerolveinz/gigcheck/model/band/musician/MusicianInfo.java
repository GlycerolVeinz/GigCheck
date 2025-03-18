package priv.glycerolveinz.gigcheck.model.band.musician;

import jakarta.persistence.*;

@Embeddable
public class MusicianInfo {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "musician_email", nullable = false)
    private String email;

    @Column(name = "nick_name")
    private String nickname;
}
