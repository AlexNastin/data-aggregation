package by.dt.util;

import by.dt.util.constants.DataAggrefationConstants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public class LocalDateSerializer extends JsonSerializer<LocalDate> {
    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DataAggrefationConstants.DATE_FORMAT);
        String formatString = value.format(formatter);
        gen.writeString(formatString);
    }
}
