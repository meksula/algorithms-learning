package main;

import main.chapter2.AccountTransfer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Wprowadź swoją kwotę, powiem Ci ile będziesz miał kasy za 3 miesiące.");
        Scanner scanner = new Scanner(System.in);
        BigDecimal account = scanner.nextBigDecimal();
        System.out.println("Po ilu miesiącach chcesz zobaczyć zysk? ");
        int months = scanner.nextInt();
        AccountTransfer transfer = new AccountTransfer("Użytkownik", account);
        transfer.setInterest(0.030);
        for (int i = 0; i <= months; i++){
            transfer.sum(transfer.countPerOneMonth());
            DecimalFormat format = new DecimalFormat(".##");
            System.out.println("Months: " + i + " " + format.format(transfer.getBalance()));
        }

    }
}
