package fr.jydet.axisclient;

import servicestub.SSNCheckerServiceLocator;
import servicestub.SSNChecker_PortType;

import javax.xml.rpc.ServiceException;

public class SSNCheckerClient {

  public static final SSNChecker_PortType SSN_CHECKER;

  static {
    SSNChecker_PortType tmp;
    try {
      tmp = new SSNCheckerServiceLocator().getSSNChecker();
    } catch (ServiceException e) {
      e.printStackTrace();
      tmp = null;
      System.exit(-1);
    }
    SSN_CHECKER = tmp;
  }

  public static void main(String[] argv) {
    isValid("dsqd");
  }

  private static void isValid(String SSN) {
    try {
      boolean valid = SSN_CHECKER.isValid(SSN);
      System.out.println("Le numéro '" + SSN + "'" + (valid ? "est" : "n'est pas") + " valide !");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
