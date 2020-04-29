package fr.jydet.axis2client.hello;


public class HelloWorldClient {
    public static void main(String[] args){
        try {
            HelloWorldStub stub = new HelloWorldStub("http://localhost:8080/AXIS2Server_war_exploded/services/HelloWorld");

            HelloWorldStub.SayHelloWorldFrom request = new HelloWorldStub.SayHelloWorldFrom();
            request.setFrom("client");

            HelloWorldStub.SayHelloWorldFromResponse response = stub.sayHelloWorldFrom(request);

            System.out.println("Response : " + response.get_return());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
