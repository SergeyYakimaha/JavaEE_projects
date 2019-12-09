package entities;

import javax.persistence.*;

@Entity
@Table(name = "cause", schema = "public", catalog = "postgres")
public class Cause {
    private int causeid;
    private int orgid;
    private String causegnum;

    public Cause() {
    }

    public Cause(int causeid, int orgid, String causegnum) {
        this.causeid = causeid;
        this.orgid = orgid;
        this.causegnum = causegnum;
    }

    @Id
    @Column(name = "causeid", nullable = false)
    public int getCauseid() {
        return causeid;
    }

    public void setCauseid(int causeid) {
        this.causeid = causeid;
    }

    @Basic
    @Column(name = "orgid", nullable = false)
    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    @Basic
    @Column(name = "causegnum", nullable = true, length = 255)
    public String getCausegnum() {
        return causegnum;
    }

    public void setCausegnum(String causegnum) {
        this.causegnum = causegnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cause that = (Cause) o;

        if (causeid != that.causeid) return false;
        if (orgid != that.orgid) return false;
        if (causegnum != null ? !causegnum.equals(that.causegnum) : that.causegnum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = causeid;
        result = 31 * result + orgid;
        result = 31 * result + (causegnum != null ? causegnum.hashCode() : 0);
        return result;
    }
}
