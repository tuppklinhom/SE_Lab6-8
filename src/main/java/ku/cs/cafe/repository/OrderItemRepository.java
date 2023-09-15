package ku.cs.cafe.repository;

import ku.cs.cafe.entity.OrderItem;
import ku.cs.cafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/


@Repository
public interface OrderItemRepository
        extends JpaRepository<OrderItem, OrderItemKey> {
}
