package models;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cause {
    @Id
    private int causeid;
    private int causestateid;
    private int createuser;
    private int changeuser;
    private String causegnum;
    private int arbitratorid;

    public Cause() {
    }

    public Cause(int causeid, int causestateid, int createuser, int changeuser, String causegnum, int arbitratorid) {
        this.causeid = causeid;
        this.causestateid = causestateid;
        this.createuser = createuser;
        this.changeuser = changeuser;
        this.causegnum = causegnum;
        this.arbitratorid = arbitratorid;
    }

    public int getCauseid() {
        return causeid;
    }

    public void setCauseid(int causeid) {
        this.causeid = causeid;
    }

    public int getCausestateid() {
        return causestateid;
    }

    public void setCausestateid(int causestateid) {
        this.causestateid = causestateid;
    }

    public int getCreateuser() {
        return createuser;
    }

    public void setCreateuser(int createuser) {
        this.createuser = createuser;
    }

    public int getChangeuser() {
        return changeuser;
    }

    public void setChangeuser(int changeuser) {
        this.changeuser = changeuser;
    }

    public String getCausegnum() {
        return causegnum;
    }

    public void setCausegnum(String causegnum) {
        this.causegnum = causegnum;
    }

    public int getArbitratorid() {
        return arbitratorid;
    }

    public void setArbitratorid(int arbitratorid) {
        this.arbitratorid = arbitratorid;
    }
}
