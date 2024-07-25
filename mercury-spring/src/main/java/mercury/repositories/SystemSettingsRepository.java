package mercury.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.SystemSettings;

@Repository
public interface SystemSettingsRepository extends JpaRepository<SystemSettings, UUID> {

}
