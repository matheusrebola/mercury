package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.ProcessingMetrics;

@Repository
public interface ProcessingMetricsRepository extends JpaRepository<ProcessingMetrics, UUID> {

}
