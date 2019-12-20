package db.dao;

import db.models.Car;
import db.models.User;

import java.util.List;
import java.util.Map;

public interface UserDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);
    Map<User, List<Car>> FindAllUserAllCars();
}
