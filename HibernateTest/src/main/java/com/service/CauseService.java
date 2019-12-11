package com.service;

import com.model.entities.Cause;

import java.util.List;

public interface CauseService {
    public List<Cause> allCauses();
    void addCause(Cause cause);
    void editCause(Cause cause);
    void removeCause(Cause cause);
    Cause getCauseByID(int id);
    Cause getCauseByCauseGNum(String causegnum);
}
