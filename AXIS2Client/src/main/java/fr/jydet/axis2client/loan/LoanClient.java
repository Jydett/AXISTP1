package fr.jydet.axis2client.loan;

public class LoanClient {

    public static void main(String[] args){
        try {
            LoanServiceStub stub = new LoanServiceStub();
            LoanServiceStub.CalculateDue request = new LoanServiceStub.CalculateDue();
            request.setAmount(10000);
            request.setAnnualFee(0.01);
            request.setMaturitiesCount(6);
            LoanServiceStub.CalculateDueResponse response = stub.calculateDue(request);
            System.out.println("Montant du credit mensuel : " + response.local_return);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
