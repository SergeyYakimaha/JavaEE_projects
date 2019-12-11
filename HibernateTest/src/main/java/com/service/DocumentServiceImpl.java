package com.service;

import com.dao.CauseDAO;
import com.dao.DocumentDAO;
import com.model.entities.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentDAO documentDAO;

    @Override
    public List<Document> allDocuments() {
        return null;
    }

    @Override
    public void addDocument(Document document) {

    }

    @Override
    public void editDocument(Document document) {

    }

    @Override
    public void removeDocument(Document document) {

    }

    @Override
    public Document getDocumentByID(int id) {
        return null;
    }

    @Override
    public List<Document> getDocumentsByCauseID(int causeId) {
        return null;
    }

    @Override
    public List<Document> getDocumentsByCauseGNum(String causegnum) {
        return null;
    }
}
