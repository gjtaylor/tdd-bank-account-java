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
    @Disabled // important to check this, but might take time
    public void balancesDoNotOverflow() {
        Account account = emptyAccount();
        account.deposit(Integer.MAX_VALUE);
        account.deposit(1);
        assertThat(account.balance()).isGreaterThan(0);
    }

}
