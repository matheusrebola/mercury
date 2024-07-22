package mercury.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.RealTimeAnalysis;

@Repository
public interface RealTimeAnalysisRepository extends JpaRepository<RealTimeAnalysis, UUID> {

}
