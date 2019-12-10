package dao;

import entities.Cause;
import entities.Dbuser;

public interface UserDAO {
    void insert(Dbuser user);
    void delete(Dbuser user);
    void update(Dbuser user);
    Dbuser getByUserID(int id);
}