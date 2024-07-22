package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record DataSources(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		DataType dataType,
		String connectionDetails,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
