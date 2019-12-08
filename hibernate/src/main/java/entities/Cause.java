package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cause {
    @Id
    private int causeid;

    @Column(nullable = true)
    private int orgid;

    private String causegnum;

    public Cause() {
    }

    public Cause(int causeid, int orgid, String causegnum) {
        this.causeid = causeid;
        this.orgid = orgid;
        this.causegnum = causegnum;
    }

    public int getCauseid() {
        return causeid;
    }

    public void setCauseid(int causeid) {
        this.causeid = causeid;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getCausegnum() {
        return causegnum;
    }

    public void setCausegnum(String causegnum) {
        this.causegnum = causegnum;
    }
}
