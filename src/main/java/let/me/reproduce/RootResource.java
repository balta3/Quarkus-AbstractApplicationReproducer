package let.me.reproduce;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
@ApplicationScoped
public class RootResource {

    @GET
    public String get() {
        return "Hello";
    }
}
