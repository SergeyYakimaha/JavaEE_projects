package app.model;

import app.entites.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        List<String> list = new ArrayList<>();
        for (User user : model) {
            list.add(user.getName());
        }
        return list;
    }
}