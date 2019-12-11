package com.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "causestate")
public class Causestate {
    @Id
    private int causestateid;

    private String causestatename;

    public int getCausestateid() {
        return causestateid;
    }

    public void setCausestateid(int causestateid) {
        this.causestateid = causestateid;
    }

    public String getCausestatename() {
        return causestatename;
    }

    public void setCausestatename(String causestatename) {
        this.causestatename = causestatename;
    }

}
