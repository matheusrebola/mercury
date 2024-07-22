package br.org.gestao.mercury.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record DataProcessingJobs(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		JobType jobType,
		LocalDateTime startTime,
		LocalDateTime endTime,
		StatusJob statusJob,
		String result,
		LocalDateTime createdAt,
		DataIngestion dataIngestion) {

}
