package service;

public class AmountDetails implements InterfaceClass {
    //@Override
    public double withdrawAmount(double amount, double availableBalance) {
        if (amount <= availableBalance) {
            return availableBalance - amount;
        } else {
            System.out.println("Insufficient balance");
            return availableBalance;
        }
    }

    //@Override
    public double depositAmount(double amount, double availableBalance) {
        return availableBalance + amount;
    }

    //@Override
    public double accountBalance(double availableBalance) {
        return availableBalance;
    }
}
