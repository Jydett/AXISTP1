package fr.jydet.axisclient;

import servicestub.HelloWorldServiceLocator;
import servicestub.HelloWorldSoapBindingStub;
import servicestub.HelloWorld_PortType;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class HelloWorldClient {
    public static void main(String[] argv) {
        methode1QuiMarche();
//        methode2();
    }

    private static void methode2() {
        try {
            HelloWorld_PortType service = new HelloWorldServiceLocator().getHelloWorld();
            System.out.println(service.sayHelloWorldFrom("client"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void methode1QuiMarche() {
        try {
            URL url = new URL("http://localhost:8080/AXIS2Server_war_exploded/services/HelloWorld");
            HelloWorldSoapBindingStub stub = new HelloWorldSoapBindingStub(url, null);
            // If authorization is required
            //((HelloWorldSoapBindingStub)stub).setUsername("user3");
            //((HelloWorldSoapBindingStub)stub).setPassword("pass3");
            System.out.println(stub.sayHelloWorldFrom("client"));
        } catch (RemoteException | MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
