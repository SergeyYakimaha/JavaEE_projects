package app.model;

import app.entites.User;

import java.util.ArrayList;
import java.util.Iterator;
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

    public boolean add(User user) {
        if (!model.contains(user)) {
            model.add(user);
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        Iterator<User> userIterable = model.iterator();
        while (userIterable.hasNext()) {
            if (userIterable.next().getName().equals(name)) {
                userIterable.remove();
                return true;
            }
        }
        return false;
    }

    public List<String> list() {
        List<String> list = new ArrayList<>();
        for (User user : model) {
            list.add(user.getName());
        }
        return list;
    }
}