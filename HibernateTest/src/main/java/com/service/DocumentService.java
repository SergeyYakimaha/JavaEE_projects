package com.service;

import com.model.entities.Document;

import java.util.List;

public interface DocumentService {
    public List<Document> allDocuments();
    void addDocument(Document document);
    void editDocument(Document document);
    void removeDocument(Document document);
    Document getDocumentByID(int id);
    List<Document> getDocumentsByCauseID(int causeId);
    List<Document> getDocumentsByCauseGNum(String causegnum);
}
