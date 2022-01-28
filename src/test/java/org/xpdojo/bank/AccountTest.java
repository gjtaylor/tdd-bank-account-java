package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    @Test
    public void newAccountsHaveZeroBalance() {
        assertThat(emptyAccount().balance()).isEqualTo(0);
    }


    @Test
    public void depositingAnAmountShouldIncreaseTheBalanceByTheSameAmount() {
        Account account = emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

}
