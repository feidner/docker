package hfe;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HfeServlet", urlPatterns = {"/hfe"})
public class HfeServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String host = System.getenv("hostname") == null ? "localhost" : System.getenv("hostname");
        System.out.println("host- " +host);
        try(CloseableHttpClient client = HttpClientBuilder.create().build()) {
            try (CloseableHttpResponse response = client.execute(new HttpGet("http://"+host+":9000/load"))) {
                response.getEntity().writeTo(resp.getOutputStream());
            }
        }
    }
}
