package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record SystemSettings(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String settingName,
		String settingValue,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
