package co.mahsan.snmpmonitoring.model.DAO.Repository.userrepo;

import co.mahsan.snmpmonitoring.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
