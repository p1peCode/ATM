import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperationInterface oi = new Operations();
        int login = 1234;
        int pin = 9981;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login: ");
        int EnteredLogin = sc.nextInt();
        System.out.println("Enter Pin: ");
        int EnteredPin = sc.nextInt();
        if ((login == EnteredLogin) && (pin == EnteredPin)) {
            while (true) {
                System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. View last operations\n5. Exit");
                System.out.println("Enter operation: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    oi.viewBalance();
                } else if (choice == 2) {
                    System.out.println("Enter how much you want to withdraw: ");
                    double withdrawValue = sc.nextDouble();
                    oi.withdrawValue(withdrawValue);
                } else if (choice == 3) {
                    System.out.println("Enter how much you want to deposit: ");
                    double depositValue = sc.nextDouble();
                    oi.depositValue(depositValue);
                } else if (choice == 4) {
                    oi.viewLastOperations();
                } else if (choice == 5) {
                    System.out.println("Take your card!\nThank you.");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Incorrect login or pin");
            System.exit(0);
        }
    }
}
