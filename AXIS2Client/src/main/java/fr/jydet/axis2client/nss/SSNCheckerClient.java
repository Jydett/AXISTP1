package fr.jydet.axis2client.nss;

public class SSNCheckerClient {
    public static void main(String[] args){
        try {
            SSNCheckerStub stub = new SSNCheckerStub("http://localhost:8080/AXIS2Server_war_exploded/services/SSNChecker");
            SSNCheckerStub.IsValid request = new SSNCheckerStub.IsValid();
            request.setSSN("coucou");
            SSNCheckerStub.IsValidResponse response = stub.isValid(request);
            System.out.println(response.local_return ? "Valide" : "Pas valide");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
