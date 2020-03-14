package co.mahsan.snmpmonitoring.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    private int id;
    private String username;
    private String password;
    private int role;
    private String email;
    private boolean isEnable;
    private boolean isLogin;
    private String name;
    private String family;
    private Date lastLogin;
    private List<Server> serverList;
    List<UserLogin> loginList;

    public User() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Column
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column
    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    @Column
    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Column
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_server", joinColumns = {@JoinColumn(name = "userid")},
            inverseJoinColumns = {@JoinColumn(name="serverid")})

    public List<Server> getServerList() {
        return serverList;
    }

    public void setServerList(List<Server> serverList) {
        this.serverList = serverList;
    }

    public void addServer(Server server) {
        if (serverList == null) {
            serverList = new ArrayList<>();
        }
        if (!serverList.contains(server)) {
            serverList.add(server);
            server.addUser(this);
        }
    }

    public void removeServer(Server server) {
        if (serverList == null)
            return;
        if (serverList.contains(server)) {
            serverList.remove(server);
            server.removeUser(this);
        }
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)

    public List<UserLogin> getLoginList() {
        return loginList;
    }

    public void setLoginList(List<UserLogin> loginList) {
        this.loginList = loginList;
    }

}
