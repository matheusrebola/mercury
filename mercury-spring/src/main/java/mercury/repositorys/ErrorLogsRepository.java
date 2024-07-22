package mercury.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.ErrorLogs;

@Repository
public interface ErrorLogsRepository extends JpaRepository<ErrorLogs, UUID> {

}
