package fr.jydet.axis2client.loan;

public class LoanClient {

    public static void main(String[] args){
        try {
            LoanServiceStub stub = new LoanServiceStub();
            LoanServiceStub.CalculateMonthlyDue request = new LoanServiceStub.CalculateMonthlyDue();
            request.setAmount(10000);
            request.setAnnualFee(1);
            request.setLoanDuration(0);
            LoanServiceStub.CalculateMonthlyDueResponse response = stub.calculateMonthlyDue(request);
            System.out.println("Montant du credit mensuel : " + response.local_return);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
