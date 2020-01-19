package shop.providers;

import shop.entity.StudentList;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class TextPlainProviderBodyWriter implements MessageBodyWriter<StudentList> {

    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        if (mediaType.equals(MediaType.TEXT_PLAIN))
            return true;
        else
            return false;
    }

    @Override
    public long getSize(StudentList studentList, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(StudentList studentList, Class<?> aClass, Type type, Annotation[] annotations,
                        MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {

        OutputStreamWriter osw = new OutputStreamWriter(outputStream);
        osw.append(mediaType.toString());
        osw.close();
    }
}
