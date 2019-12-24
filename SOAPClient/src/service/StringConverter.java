package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StringConverter {

    @WebMethod
    String toUpperCase(String string);

    @WebMethod
    String toLowerCase(String string);

    @WebMethod
    String reverseString(String string);
}
