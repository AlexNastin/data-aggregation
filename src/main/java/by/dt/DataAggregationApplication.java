package by.dt;

import by.dt.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@Import(WebConfiguration.class)
@SpringBootApplication
public class DataAggregationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataAggregationApplication.class, args);
    }
}
