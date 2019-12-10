package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "cause")
public class Cause {

    @Id
    private int causeid;

    @OneToOne
    @JoinColumn(name="causestateid")
    private Causestate causestate;

    @OneToOne
    @JoinColumn(name="createuser")
    private Dbuser createuser;

    @OneToOne
    @JoinColumn(name="changeuser")
    private Dbuser changeuser;

    private String causegnum;

    @OneToOne
    @JoinColumn(name="arbitratorid")
    private Dbuser arbitrator;

    public Dbuser getArbitrator() {
        return arbitrator;
    }

    public void setArbitrator(Dbuser arbitrator) {
        this.arbitrator = arbitrator;
    }

    public Causestate getCausestate() {
        return causestate;
    }

    public void setCausestate(Causestate causestate) {
        this.causestate = causestate;
    }

    public int getCauseid() {
        return causeid;
    }

    public void setCauseid(int causeid) {
        this.causeid = causeid;
    }

    public Dbuser getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Dbuser createuser) {
        this.createuser = createuser;
    }

    public Dbuser getChangeuser() {
        return changeuser;
    }

    public void setChangeuser(Dbuser changeuser) {
        this.changeuser = changeuser;
    }

    public String getCausegnum() {
        return causegnum;
    }

    public void setCausegnum(String causegnum) {
        this.causegnum = causegnum;
    }

    @Override
    public String toString() {
        return "Cause{" +
                "causeid=" + causeid +
                ", causestate=" + causestate.getCausestatename() +
                ", createuser=" + createuser.getUsername() +
                ", changeuser=" + changeuser.getUsername() +
                ", causegnum='" + causegnum + '\'' +
                ", arbitrator=" + arbitrator.getUsername() +
                '}';
    }
}
