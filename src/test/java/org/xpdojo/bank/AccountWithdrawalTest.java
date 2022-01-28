package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.extractProperty;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountWithdrawalTest {

    @Test
    public void withdrawingAnAmountShouldDecreaseTheBalanceByTheSameAmount() {
        Account account = emptyAccount();
        account.deposit(50);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(40) ;
    }

    @Test
    public void withdrawMultipleAmounts() {
        Account account = emptyAccount() ;
        account.deposit(50);
        account.withdraw(10);
        account.withdraw(15);
        assertThat(account.balance()).isEqualTo(25);
    }

    @Test
    @Disabled // is this wanted behaviour?
    public void amountsGreaterThanTheBalanceCannotBeWithdrawn() {
    }

}
