package ku.cs.cafe.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/

@Data
@Entity
public class OrderItem {


    @EmbeddedId
    private OrderItemKey id;

    private int quantity;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "menu_id")
    private Menu menu;


    public double getSubtotal() {
        return menu.getPrice() * quantity;
    }

}

