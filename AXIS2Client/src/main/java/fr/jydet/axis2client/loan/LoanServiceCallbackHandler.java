/**
 * LoanServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package fr.jydet.axis2client.loan;


/**
 *  LoanServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class LoanServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public LoanServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public LoanServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for calculateMonthlyDue method
     * override this method for handling normal response from calculateMonthlyDue operation
     */
    public void receiveResultcalculateMonthlyDue() {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from calculateMonthlyDue operation
     */
    public void receiveErrorcalculateMonthlyDue(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for calculateDue method
     * override this method for handling normal response from calculateDue operation
     */
    public void receiveResultcalculateDue(
        LoanServiceStub.CalculateDueResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from calculateDue operation
     */
    public void receiveErrorcalculateDue(java.lang.Exception e) {
    }
}
