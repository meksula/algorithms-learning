package main.chapter2;

/*
* Proste zadania z ksiązki o algorytmach M. Sysło.
*
* */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class AccountTransfer {
    private LocalDate localDate;
    private BigDecimal balance;
    private double interest;
    private String clientName;

    public AccountTransfer(String clientName, BigDecimal balance){
        this.localDate = LocalDate.now();
        this.clientName = clientName;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    /*count money for one month*/
    public BigDecimal countPerOneMonth(){
        BigDecimal add = balance.multiply(BigDecimal.valueOf(interest));
        return add;
    }

    /*Kwota wpływa co 3 miesiące na konto: */
    public BigDecimal addToAccount(){
        return countPerOneMonth().multiply(BigDecimal.valueOf(3));
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return "Dane konta: " + clientName + ", stan konta: " + format.format(balance);
    }

    public void sum(BigDecimal decimal) {
        balance = balance.add(decimal);
    }
}
