package com.dao;

import com.model.entities.Cause;

import java.util.List;

public interface CauseDAO {
    List<Cause> getAllCause();
    void insert(Cause cause);
    void delete(Cause cause);
    void update(Cause cause);
    void insert(int causeCount);
    Cause getCauseByID(int id);
    Cause getCauseByCauseGNum(String causegnum);
}
