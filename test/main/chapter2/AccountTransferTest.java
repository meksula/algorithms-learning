package main.chapter2;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/*
* Zadanie 2.2
* - rachunek bankowy ma mieć stan; +
* - oprocentowanie np. 2,5% w skali rocznej;
* - pieniążki są przesyłane na konto co 3 miesiące
* - PS: po roku na twoim koncie będzie kwota = (1 + x) * p
* */

public class AccountTransferTest {
    private AccountTransfer accountTransfer;
    private static final BigDecimal DEFAULT_BALANCE = BigDecimal.valueOf(344832.58);
    private static final double INTEREST = 0.025; // 2.5%
    private static final double DELTA = 1e-15;

    @Before
    public void setUp(){
        accountTransfer = new AccountTransfer("Adam Jankowski", DEFAULT_BALANCE);
        accountTransfer.setInterest(INTEREST);
    }

    @Test
    public void shouldInitializeCorrectly(){
        assertNotNull(accountTransfer);
        assertNotNull(accountTransfer.getClientName());
        assertEquals(DEFAULT_BALANCE, accountTransfer.getBalance());
    }

    @Test
    public void interestShouldBeDefined(){
        assertEquals(INTEREST, accountTransfer.getInterest(), DELTA);
    }

    @Test
    public void shouldIncreaseAccountBalance(){
        assertTrue(accountTransfer.getBalance().compareTo(DEFAULT_BALANCE) == 0);
        System.out.println(accountTransfer.toString());
    }

    /*sprawdzamy jeszcze inne metody, które dodają co miesiąc / 3   i 6 */
    @Test
    public void shouldEquals(){


    }
}