package fr.jydet.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LoanService {

    @WebMethod
    public double calculateDue(double amount, int maturitiesCount, double annualFee) {
        return annualFee / (double) maturitiesCount * amount;
    }
}
