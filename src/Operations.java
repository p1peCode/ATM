import java.util.HashMap;
import java.util.Map;

public class Operations implements OperationInterface {
    ATM atm = new ATM();
    Map<Double, String> lastOperations = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawValue(double withdrawValue) {
        if (withdrawValue % 100 == 0) {
            if (atm.getBalance() < withdrawValue) {
                System.out.println("Not enough money on your balance.");
            } else {
                lastOperations.put(withdrawValue, " withdrawn");
                System.out.println(withdrawValue + " Successfully withdrawn");
                atm.setBalance(atm.getBalance() - withdrawValue);
                viewBalance();
            }
        } else {
            System.out.println("Enter the amount in multiples of 100");
        }
    }

    @Override
    public void depositValue(double depositValue) {
        lastOperations.put(depositValue, " deposited");
        System.out.println(depositValue + " Successfully deposited");
        atm.setBalance(atm.getBalance() + depositValue);
        viewBalance();
    }

    @Override
    public void viewLastOperations() {
        for (Map.Entry<Double, String> m: lastOperations.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
