package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.DashboardsWidgets;

@Repository
public interface DashboardsWidgetsRepository extends JpaRepository<DashboardsWidgets, UUID> {

}
