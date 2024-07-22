package mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record RealTimeAnalysis(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		AnalysisType analysisType,
		String result,
		IdentifiedPatterns identifiedPatterns,
		String anomaliesDetected,
		LocalDateTime createdAt,
		DataProcessingJobs dataProcessingJobs) {

}
