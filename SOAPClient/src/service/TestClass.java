package service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {
    private URL urlTempConverter;
    private URL urlStringConverter;

    private TempConverter tempConverter;
    private StringConverter stringConverter;

    public TestClass() throws MalformedURLException {
        this.urlTempConverter = new URL("http://localhost:8080//soap_war_exploded/TempConverterImplService?wsdl");
        this.urlStringConverter = new URL("http://localhost:8080//soap_war_exploded/StringConverterImplService?wsdl");
        Init();
    }

    private void Init(){
        QName qTempConverterName = new QName("http://service/", "TempConverterImplService");
        QName qStringConverterName = new QName("http://service/", "StringConverterImplService");

        Service serviceTempConverter = Service.create(urlTempConverter, qTempConverterName);
        Service serviceStringConverter = Service.create(urlStringConverter, qStringConverterName);

        QName portTempConverter = new QName("http://service/", "TempConverterImplPort");
        QName portStringConverter = new QName("http://service/", "StringConverterImplPort");

        tempConverter = serviceTempConverter.getPort(portTempConverter, TempConverter.class);
        stringConverter = serviceStringConverter.getPort(portStringConverter, StringConverter.class);
    }

    public TempConverter getTempConverter() {
        return this.tempConverter;
    }

    public StringConverter getStringConverter() {
        return this.stringConverter;
    }
}
