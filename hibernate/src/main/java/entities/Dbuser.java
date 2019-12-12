package entities;

import javax.persistence.*;

@Entity
@Table(name = "dbuser")
public class Dbuser {
    @Id
    private int userid;

    private String username;

    private Integer usertype;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

}
