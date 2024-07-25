package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, UUID> {

}
