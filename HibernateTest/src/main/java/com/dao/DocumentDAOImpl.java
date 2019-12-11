package com.dao;

import com.model.entities.Cause;
import com.model.entities.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentDAOImpl implements DocumentDAO {
    @Override
    public void insert(Document document) {

    }

    @Override
    public void delete(Document document) {

    }

    @Override
    public void update(Document document) {

    }

    @Override
    public void insert(int documentCount) {

    }

    @Override
    public Cause getDocumentByID(int id) {
        return null;
    }

    @Override
    public Cause getDocumentByDocumentNumber(String documentNumber) {
        return null;
    }
}
