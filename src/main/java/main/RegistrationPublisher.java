package main;

import registration.RegistrationServiceImpl;
import javax.xml.ws.Endpoint;

public class RegistrationPublisher {

    private static final String SERVICE_URL = "http://localhost:8080/register";

    public static void main(String[] args) {
        Endpoint.publish(SERVICE_URL, new RegistrationServiceImpl());
        System.out.println("Service is available under: " + SERVICE_URL);
    }

}