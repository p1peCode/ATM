public class ATM {
    private double balance;
    private double depositValue;
    private double withdrawValue;

    public ATM() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public double getWithdrawValue() {
        return withdrawValue;
    }

    public void setWithdrawValue(double withdrawValue) {
        this.withdrawValue = withdrawValue;
    }
}
