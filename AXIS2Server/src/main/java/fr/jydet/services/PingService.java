package fr.jydet.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PingService {

    @WebMethod
    public String ping(String ping) {
        if ("ping".equals(ping)) {
            return "pong";
        } else {
            return null;
        }
    }
}
