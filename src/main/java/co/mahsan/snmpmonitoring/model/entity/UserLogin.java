package co.mahsan.snmpmonitoring.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserLogin {
    private int id;
    private Date loginDate;
    private User user;

    public UserLogin() {
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
    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "uid"  )
//
//    public User getUser() {
//        return user;
//    }

    public void setUser(User user) {
        this.user = user;
    }
}
