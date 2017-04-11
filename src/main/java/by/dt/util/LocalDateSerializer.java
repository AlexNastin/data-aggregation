package by.dt.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {
    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DataAggrefationConstants.DATE_FORMAT);
        String formatString = value.format(formatter);
        gen.writeString(formatString);
    }
}
