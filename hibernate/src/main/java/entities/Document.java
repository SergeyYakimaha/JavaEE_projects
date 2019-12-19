package entities;

import javax.persistence.*;

@Entity
@Table(name = "document")
public class Document {
    @Id
    private int documentid;

    @ManyToOne
    @JoinColumn(name = "causeid")
    private Cause cause;

    @OneToOne
    @JoinColumn(name = "doctypeid")
    private Doctype doctype;

    private String docnumber;

    public Document() {
    }

    public int getDocumentid() {
        return documentid;
    }

    public void setDocumentid(int documentid) {
        this.documentid = documentid;
    }

    public Cause getCause() {
        return cause;
    }

    public void setCause(Cause cause) {
        this.cause = cause;
    }

    public Doctype getDoctype() {
        return doctype;
    }

    public void setDoctype(Doctype doctype) {
        this.doctype = doctype;
    }

    public String getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(String docnumber) {
        this.docnumber = docnumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentid=" + documentid +
                ", cause=" + cause +
                ", doctype=" + doctype +
                '}';
    }
}