package ku.cs.cafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.util.UUID;
/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/


@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String password;
    private String name;
    private String role;
}
