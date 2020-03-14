package co.mahsan.snmpmonitoring;

import co.mahsan.snmpmonitoring.model.DAO.Repository.serverrepo.ServerRepository;
import co.mahsan.snmpmonitoring.model.DAO.Repository.userrepo.UserRepository;
import co.mahsan.snmpmonitoring.model.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class SnmpMonitoringApplicationTests {
    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    ServerRepository serverRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void LoadUsers() {
        List<User> all = userRepository.findAll();
        System.err.println(all);

    }

}
