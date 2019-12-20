package db.dao;

import db.models.Car;
import db.models.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserCarsMapper implements ResultSetExtractor<Map<User, List<Car>>> {
    @Override
    public Map<User, List<Car>> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
            Map<User, List<Car>> data = new HashMap<>();
            while (resultSet.next()) {
                Integer user_id = resultSet.getInt("user_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                Integer car_id = resultSet.getInt("car_id");
                String model = resultSet.getString("model");
                Integer owner_id = resultSet.getInt("owner_id");

                User user = new User(user_id, firstName, lastName);
                Car car = new Car(car_id, model, user);

                data.putIfAbsent(user, new ArrayList<>());
                data.get(user).add(car);
            }

            for (Map.Entry<User, List<Car>> pair : data.entrySet()) {
                pair.getKey().setCars(pair.getValue());
            }

            return data;
        }
}
