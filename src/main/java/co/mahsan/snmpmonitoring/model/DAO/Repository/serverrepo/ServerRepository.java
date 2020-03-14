package co.mahsan.snmpmonitoring.model.DAO.Repository.serverrepo;

import co.mahsan.snmpmonitoring.model.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends JpaRepository<Server,Integer> {
}
