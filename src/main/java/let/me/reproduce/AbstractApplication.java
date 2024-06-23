package let.me.reproduce;

import jakarta.ws.rs.core.Application;
import java.util.Set;

public abstract class AbstractApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(RootResource.class);
    }
}
