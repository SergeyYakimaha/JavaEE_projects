package dao;

import entities.Cause;

public interface CauseDAO {
    void insert(Cause cause);
    void delete(Cause cause);
    void update(Cause cause);
    void insert(int causeCount);
    Cause get(int id);
}
