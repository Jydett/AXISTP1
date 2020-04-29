package fr.jydet.services;

import javax.jws.WebService;

@WebService
public class SSNChecker {

    public boolean isValid(String SSN) {
        if (SSN.length() != 15) return false;
        switch (SSN.charAt(0)) {
            case '1': case '2': case '3': case '7': case '4': case '8': break;
            default: return false;
        }
        if (! Character.isDigit(SSN.charAt(1)) || ! Character.isDigit(SSN.charAt(2))) return false;
        try {
            int month = Integer.parseInt(SSN.substring(3, 5));
            if (! ((month >= 1 && month <= 12) || (month >= 30 && month <= 42) || (month >= 50 && month <= 99) || month == 20)) {
                return false;
            }

            if (isMidValid(SSN)) {
                if (! Character.isDigit(SSN.charAt(10)) ||
                    ! Character.isDigit(SSN.charAt(11)) ||
                    ! Character.isDigit(SSN.charAt(12))) return false;
                int birthNumber = Integer.parseInt(SSN.substring(10, 13));
                if (birthNumber == 0) return false;

                long keyV = 97 - (Long.parseLong(SSN.substring(0, 13).replaceAll("2A", "19").replaceAll("2B", "18")) % 97);

                if (Integer.parseInt(SSN.substring(13, 15)) != keyV) {
                    System.err.println("key : " + keyV);
                    return false;
                }
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isMidValid(String SSN) {
        if (! Character.isDigit(SSN.charAt(5)) ||
            ! (Character.isDigit(SSN.charAt(6)) || (SSN.charAt(5) == '2' && ('A' == SSN.charAt(6) || 'B' == SSN.charAt(6)))) ||
            ! Character.isDigit(SSN.charAt(7)) ||
            ! Character.isDigit(SSN.charAt(8)) ||
            ! Character.isDigit(SSN.charAt(9))) return false;

        try {
            if ('0' == SSN.charAt(5) && '0' == SSN.charAt(6)) return false;
            if ('9' == SSN.charAt(5) && ('7' == SSN.charAt(6) || '8' == SSN.charAt(6))) {
                if ('0' == SSN.charAt(8) && '0' == SSN.charAt(9)) {
                    return false;
                }
            }
            return 0 != Integer.parseInt(SSN.substring(7, 10));
        } catch (Exception e) {
            return false;
        }
    }
}
