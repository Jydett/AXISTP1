package fr.jydet.axis2client.nss;

public class SSNCheckerClient {
    public static void main(String[] args){
        try {
            SSNCheckerServiceStub stub = new SSNCheckerServiceStub("http://localhost:8080/AXIS2Server_war_exploded/services/SSNChecker");
            SSNCheckerServiceStub.SSN request = new SSNCheckerServiceStub.SSN();
            request.setSSN("coucou");
            SSNCheckerServiceStub.IsValidReturn response = stub.isValid(request);
            System.out.println(response.localIsValidReturn ? "Valide" : "Pas valide");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
