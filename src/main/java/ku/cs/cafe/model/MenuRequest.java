package ku.cs.cafe.model;

import lombok.Data;

import java.util.UUID;

/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/

@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}

