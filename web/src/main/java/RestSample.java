import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sample")
public class RestSample {

    @GET
    public String getId() {
        return "abcdefg";
    }
}
