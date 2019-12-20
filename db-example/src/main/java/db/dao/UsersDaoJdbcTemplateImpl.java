package db.dao;

import db.models.Car;
import db.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.*;

public class UsersDaoJdbcTemplateImpl implements UserDao {
    private JdbcTemplate template;

    private final String SQL_SELECT_ALL =
            "SELECT * FROM fix_user";

    private final String SQL_SELECT_ALL_BY_FIRST_NAME =
            "SELECT * FROM fix_user WHERE first_name = ?";

    private final String SQL_SELECT_USER_WITH_CAR =
            "SELECT fix_user.*, fix_car.id as car_id, fix_car.model " +
                    "FROM fix_user LEFT JOIN fix_car ON (fix_user.id = fix_car.owner_id) WHERE fix_user.id = ?";

    private final String SQL_SELECT_ALL_USER_CARS =
            "SELECT fix_user.id as user_id, fix_user.first_name, fix_user.last_name, fix_car.id as car_id, fix_car.model, fix_car.owner_id " +
                    "FROM fix_user LEFT JOIN fix_car ON (fix_user.id = fix_car.owner_id)";

    private Map<Integer, User> usersMap = new HashMap<>();

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return template.query(SQL_SELECT_ALL_BY_FIRST_NAME, userRowMapper, firstName);
    }

    @Override
    public List<User> findAllByLastName(String lastName) {
        return null;
    }

    @Override
    public Optional<User> find(Integer id) {
        template.query(SQL_SELECT_USER_WITH_CAR, userRowMapperWithCars, id);

        if (usersMap.containsKey(id)) {
            return Optional.of(usersMap.get(id));
        }
        return Optional.empty();
    }

    @Override
    public void save(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Integer id) {

    }

    private RowMapper<User> userRowMapperWithCars
            = (resultSet, i) -> {
        Integer id = resultSet.getInt("id");

        if (!usersMap.containsKey(id)) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");

            User user = new User(id, firstName, lastName, new ArrayList<>());
            usersMap.put(id, user);
        }

        Car car = new Car(resultSet.getInt("car_id"),
                resultSet.getString("model"), usersMap.get(id));

        usersMap.get(id).getCars().add(car);

        return usersMap.get(id);
    };

    private RowMapper<User> userRowMapper
            = (resultSet, i) -> {
        return new User(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"));
    };


    @Override
    public List<User> findAll() {

        // 1.
        return template.query(SQL_SELECT_ALL, new UserMapper());
        // 2.
        // return template.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public Map<User, List<Car>> FindAllUserAllCars() {
        return template.query(SQL_SELECT_ALL_USER_CARS, new UserCarsMapper());
    }
}
