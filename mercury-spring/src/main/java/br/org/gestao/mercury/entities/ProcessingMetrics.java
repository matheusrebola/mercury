package br.org.gestao.mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record ProcessingMetrics(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String metricName,
		String metricValue,
		LocalDateTime timestamp,
		DataProcessingJobs dataProcessingJobs) {

}
