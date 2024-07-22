package mercury.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercury.entities.ThirdPartyIntegrations;

@Repository
public interface ThirdPartyIntegrationsRepository extends JpaRepository<ThirdPartyIntegrations, UUID> {

}
