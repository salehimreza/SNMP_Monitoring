package co.mahsan.snmpmonitoring.model.DAO;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "co.mahsan.snmpmonitoring.model.DAO.Repository.serverrepo.")
public class ServerRepo {
}
