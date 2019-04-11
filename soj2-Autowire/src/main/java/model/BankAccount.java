package model;

public class BankAccount {
    private String iban;
    private String ownerName;
    private Double balance;

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
