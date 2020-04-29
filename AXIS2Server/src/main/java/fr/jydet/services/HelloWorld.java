package fr.jydet.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "hello")
public class HelloWorld {

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

}
