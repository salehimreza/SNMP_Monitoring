package co.mahsan.snmpmonitoring;

import co.mahsan.snmpmonitoring.model.DAO.Repository.serverrepo.ServerRepository;
import co.mahsan.snmpmonitoring.model.DAO.Repository.userrepo.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SnmpMonitoringApplicationTests {

    @Autowired
    ServerRepository serverRepository;
    @Autowired
    UserRepository userRepository;


    @Test
    void contextLoads() {

    }

}
