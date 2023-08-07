package com.ticket.entities;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_offers")
public class UserOffer implements Serializable {
    // private Long id;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "offer_id", referencedColumnName = "id")
    private Offer offer;
}