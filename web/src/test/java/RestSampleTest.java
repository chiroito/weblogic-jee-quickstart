import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.client.ClientBuilder;
import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Arquillian.class)
public class RestSampleTest {

    @ArquillianResource
    private URL baseUrl;

    private final String resourcePrefix = RestApplication.class.getAnnotation(ApplicationPath.class).value();
    private final String resourcePath = RestSample.class.getAnnotation(Path.class).value();

    @Test
    @RunAsClient
    public void test() throws Exception {
        String ret = ClientBuilder.newClient()
                .target(new URL(this.baseUrl, resourcePrefix + "/" + resourcePath).toURI())
                .request()
                .get(String.class);

        assertThat(ret, is("abcdefg"));
    }

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addClasses(RestSample.class, RestApplication.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
}
