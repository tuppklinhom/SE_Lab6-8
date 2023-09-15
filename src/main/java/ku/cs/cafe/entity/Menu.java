package ku.cs.cafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


import java.util.UUID;
/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/


@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Category category;

    private String name;
    private double price;
}
