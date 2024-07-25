package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.VisualizationDashboards;

@Repository
public interface VisualizationDashboardsRepository extends JpaRepository<VisualizationDashboards, UUID> {

}
