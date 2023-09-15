package ku.cs.cafe.repository;
import ku.cs.cafe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/



@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
