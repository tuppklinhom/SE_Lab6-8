package ku.cs.cafe.repository;

import ku.cs.cafe.entity.Member;
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
public interface MemberRepository extends JpaRepository<Member, UUID> {
    Member findByUsername(String username);// SELECT * FROM Member WHERE username = "username"
}