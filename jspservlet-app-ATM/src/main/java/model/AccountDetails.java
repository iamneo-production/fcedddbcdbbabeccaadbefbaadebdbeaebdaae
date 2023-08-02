package model;

public class AccountDetails {
    private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;

    public AccountDetails(String accountType, double withdrawOrDepositAmount, double availableBalance, int pin) {
        this.accountType = accountType;
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
        this.availableBalance = availableBalance;
        this.pin = pin;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getWithdrawOrDepositAmount() {
        return withdrawOrDepositAmount;
    }

    public void setWithdrawOrDepositAmount(double withdrawOrDepositAmount) {
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
