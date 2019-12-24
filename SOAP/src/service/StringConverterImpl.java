package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.StringConverter")
public class StringConverterImpl implements StringConverter {
    @Override
    public String toUpperCase(String string) {
        return string.toUpperCase();
    }

    @Override
    public String toLowerCase(String string) {
        return string.toLowerCase();
    }

    @Override
    public String reverseString(String string) {
        return (new StringBuffer(string).reverse()).toString();
    }
}
