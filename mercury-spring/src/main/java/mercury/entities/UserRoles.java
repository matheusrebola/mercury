package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record UserRoles(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String roleName,
		UserPermissions permissions,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
