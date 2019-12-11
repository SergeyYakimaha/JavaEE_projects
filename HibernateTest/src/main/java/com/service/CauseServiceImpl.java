package com.service;

import com.model.entities.Cause;
import com.dao.CauseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CauseServiceImpl implements CauseService {
    @Autowired
    private CauseDAO causeDAO;

    @Override
    public List<Cause> allCauses() {
        return causeDAO.getAllCause();
    }

    @Override
    public void addCause(Cause cause) {

    }

    @Override
    public void editCause(Cause cause) {

    }

    @Override
    public void removeCause(Cause cause) {

    }

    @Override
    public Cause getCauseByID(int id) {
        return null;
    }

    @Override
    public Cause getCauseByCauseGNum(String causegnum) {
        return null;
    }
}
