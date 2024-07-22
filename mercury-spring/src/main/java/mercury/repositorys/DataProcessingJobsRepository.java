package mercury.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.DataProcessingJobs;

@Repository
public interface DataProcessingJobsRepository extends JpaRepository<DataProcessingJobs, UUID>{

}