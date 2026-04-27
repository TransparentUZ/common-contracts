package uz.powercorp.common.exceptions;

public class BankIsNotAvailableException extends RuntimeException {
    public BankIsNotAvailableException(String message) {
        super(message);
    }
}
