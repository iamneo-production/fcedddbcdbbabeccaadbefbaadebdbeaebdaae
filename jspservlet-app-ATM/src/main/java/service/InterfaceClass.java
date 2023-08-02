package service;

public interface InterfaceClass {
    public abstract double withdrawAmount(double amount, double availableBalance);
    public abstract double depositAmount(double amount, double availableBalance);
    public abstract double accountBalance(double availableBalance);
}
