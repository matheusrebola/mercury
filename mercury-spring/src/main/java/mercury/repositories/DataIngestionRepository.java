package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.DataIngestion;

@Repository
public interface DataIngestionRepository extends JpaRepository<DataIngestion, UUID>{

}
