package fr.jydet.axis2client.ping;

import fr.jydet.axis2client.nss.SSNCheckerStub;

public class Main {

    public static void main(String[] args) {
        try {
            PingServiceStub stub = new PingServiceStub();
            PingServiceStub.Ping request = new PingServiceStub.Ping();
            request.setPing("ping");

            PingServiceStub.PingResponse response = stub.ping(request);
            System.out.println("Le serveur a répondu : " + response.local_return);

            PingServiceStub.Ping request2 = new PingServiceStub.Ping();
            request2.setPing("dqsdqssdq");

            PingServiceStub.PingResponse response2 = stub.ping(request2);
            System.out.println("Le serveur a répondu : " + response2.local_return);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
