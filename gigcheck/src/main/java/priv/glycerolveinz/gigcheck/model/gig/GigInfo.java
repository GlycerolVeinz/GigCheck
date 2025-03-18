package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;

@Embeddable
public class GigInfo {
    @Column(name = "name")
    private String name;

}
