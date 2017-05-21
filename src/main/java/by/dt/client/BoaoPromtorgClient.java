package by.dt.client;

import by.dt.config.UrlConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@Component
public class BoaoPromtorgClient {

    private final RestTemplate rt;
    private final UrlConfiguration urlConfiguration;

    @Autowired
    public BoaoPromtorgClient(RestTemplate rt, UrlConfiguration urlConfiguration) {
        this.rt = rt;
        this.urlConfiguration = urlConfiguration;
    }

    public ResponseEntity<Object> send(String url, Object entity) {
        ResponseEntity<Object> response = rt.postForEntity(urlConfiguration.getUrlBoaoPromtorg() + url, entity, Object.class);
        System.out.println(response);
        return response;
    }

    public ResponseEntity<Object> send(String url) {
        ResponseEntity<Object> response = rt.getForEntity(urlConfiguration.getUrlBoaoPromtorg() + url, Object.class);
        System.out.println(response);
        return response;
    }
}