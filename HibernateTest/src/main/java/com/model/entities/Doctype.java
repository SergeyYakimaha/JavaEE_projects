package com.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "doctype")
public class Doctype {
    @Id
    private int doctypeid;

    private String doctypename;

    public int getDoctypeid() {
        return doctypeid;
    }

    public void setDoctypeid(int doctypeid) {
        this.doctypeid = doctypeid;
    }

    public String getDoctypename() {
        return doctypename;
    }

    public void setDoctypename(String doctypename) {
        this.doctypename = doctypename;
    }
}
