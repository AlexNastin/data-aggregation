package by.dt.util;

import by.dt.util.constants.DataAggrefationConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DataAggrefationConstants.DATE_FORMAT);
        return LocalDate.parse(p.getText(), formatter);
    }
}
