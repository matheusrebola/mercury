package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.DataSources;

@Repository
public interface DataSourcesRepository extends JpaRepository<DataSources, UUID> {

}
