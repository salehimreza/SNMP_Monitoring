package co.mahsan.snmpmonitoring.model.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
public class Server {

    private int id;
    private Inet4Address ip;
    private String name;
    private String os;

    public Server() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column
    public Inet4Address getIp() {
        return ip;
    }

    public void setIp(Inet4Address ip) {
        this.ip = ip;
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public InetAddress toAddress(String ip) throws UnknownHostException {
           return InetAddress.getByName(ip);
    }
    public String tooString(Inet4Address ip){
        return ip.toString();
    }
    List<User> userList;
    @ManyToMany(mappedBy = "serverList")
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public void addUser(User user){
        if(userList==null){
            userList = new ArrayList<>();
        }
        if(!userList.contains(user)){
            userList.add(user);
            user.addServer(this);
        }
    }
    public void removeUser(User user){
        if(userList==null)
            return;
        if(userList.contains(user)){
            userList.remove(user);
            user.removeServer(this);
        }
    }
}
