package fr.jydet.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LoanService {

    @WebMethod
    public double calculateMonthlyDue(double amount, int loanDuration, int annualFee) {
        return 0;
    }
}
