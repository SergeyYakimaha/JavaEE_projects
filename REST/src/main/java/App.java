import shop.test.TestRest;

import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//@ApplicationPath(Constants.APPLICATION_PATH)
//@ApplicationPath("/shop")
public class App extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(TestRest.class);
        return Collections.unmodifiableSet(resources);
    }
}
