package by.dt.client;

import by.dt.config.UrlConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Properties;

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

    public ResponseEntity<Object> sendPost(String url, Object entity) {
        return rt.postForEntity(urlConfiguration.getUrlBoaoPromtorg() + url, entity, Object.class);
    }

    public ResponseEntity<Object> sendGet(String url) {
        return rt.getForEntity(urlConfiguration.getUrlBoaoPromtorg() + url, Object.class);
    }

    public ResponseEntity<Object> sendPut(String url, Object entity, Properties uriParameters) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(urlConfiguration.getUrlBoaoPromtorg() + url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> httpEntity = new HttpEntity<>(entity, headers);
        return rt.exchange(builder.buildAndExpand(uriParameters).toUri(), HttpMethod.PUT, httpEntity, Object.class);
    }
}