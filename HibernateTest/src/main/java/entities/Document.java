package entities;

import javax.persistence.*;

@Entity
@Table(name = "document", schema = "public", catalog = "postgres")
public class Document {
    private int documentid;
    private int orgid;

    public Document() {
    }

    public Document(int documentid, int orgid) {
        this.documentid = documentid;
        this.orgid = orgid;
    }

    @Id
    @Column(name = "documentid", nullable = false)
    public int getDocumentid() {
        return documentid;
    }

    public void setDocumentid(int documentid) {
        this.documentid = documentid;
    }

    @Basic
    @Column(name = "orgid", nullable = false)
    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (documentid != document.documentid) return false;
        if (orgid != document.orgid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = documentid;
        result = 31 * result + orgid;
        return result;
    }
}
