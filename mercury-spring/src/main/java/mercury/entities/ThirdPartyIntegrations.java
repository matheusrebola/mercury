package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record ThirdPartyIntegrations(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		IntegrationType type,
		String connectionsDetails,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
