package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record DataIngestion(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime ingestionTime,
		String rawData,
		StatusIngestion statusIngestion,
		LocalDateTime createdAt,
		DataSources dataSources) {

}
