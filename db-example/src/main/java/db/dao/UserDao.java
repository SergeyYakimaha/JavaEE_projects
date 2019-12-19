package db.dao;

import db.models.User;

import java.util.List;

public interface UserDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);
}
