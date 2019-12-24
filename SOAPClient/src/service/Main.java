package service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        TestClass tc = new TestClass();

        TempConverter tempConverter = tc.getTempConverter();
        StringConverter stringConverter = tc.getStringConverter();

        System.out.println(tempConverter.c2f(100));
        System.out.println(tempConverter.f2c(218));

        System.out.println(stringConverter.toUpperCase("I am super"));
        System.out.println(stringConverter.toLowerCase("HELLO SUPER MAN !"));
        System.out.println(stringConverter.reverseString("123456789"));

        URL url = new URL("http://localhost:8080//soap_war_exploded/TempConverterImplService?wsdl");

        QName qName = new QName("http://service/", "TempConverterImplService");
        Service service = Service.create(url, qName);

        QName port = new QName("http://service/", "TempConverterImplPort");

        TempConverter tv = service.getPort(port, TempConverter.class);

        System.out.println(tv.c2f(100));
        System.out.println(tv.f2c(218));
    }

}
