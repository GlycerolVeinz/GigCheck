package priv.glycerolveinz.gigcheck.model.gig;

import jakarta.persistence.*;

@Embeddable
public class GigInfo {
    @Column(name = "gig_name")
    private String name;

}
