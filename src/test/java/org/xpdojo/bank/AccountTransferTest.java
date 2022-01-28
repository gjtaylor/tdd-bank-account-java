package org.xpdojo.bank;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.xpdojo.bank.Account.emptyAccount;


public class AccountTransferTest {
    @Test
    public void transfersDecreaseTheSendingAccountBalance() {
        Account sendingAccount = emptyAccount() ;
        Account receivingAccount = emptyAccount() ;
        sendingAccount.deposit(100);
        sendingAccount.transfer(30, receivingAccount);
        assertThat(sendingAccount.balance()).isEqualTo(70);
    }


    @Test
    public void transfersIncreaseTheReceivingAccountBalance() {
        Account sendingAccount = emptyAccount() ;
        Account receivingAccount = emptyAccount() ;
        sendingAccount.deposit(100);
        sendingAccount.transfer(30, receivingAccount);
        assertThat(receivingAccount.balance()).isEqualTo(30);
    }

}
