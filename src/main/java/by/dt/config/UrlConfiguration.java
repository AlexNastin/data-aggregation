package by.dt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@Configuration
public class UrlConfiguration {

    @Value("${url.boao-promtorg}")
    private String urlBoaoPromtorg;

    @Value("${url.user-storage}")
    private String urlUserStorage;

    public String getUrlUserStorage() {
        return urlUserStorage;
    }

    public String getUrlBoaoPromtorg() {
        return urlBoaoPromtorg;
    }
}
