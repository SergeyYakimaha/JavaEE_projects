package com.dao;

import com.model.entities.Cause;
import com.model.entities.Document;

public interface DocumentDAO {
    void insert(Document document);
    void delete(Document document);
    void update(Document document);
    void insert(int documentCount);
    Cause getDocumentByID(int id);
    Cause getDocumentByDocumentNumber(String documentNumber);
}
