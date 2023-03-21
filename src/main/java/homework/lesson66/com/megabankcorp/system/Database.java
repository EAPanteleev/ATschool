package homework.lesson66.com.megabankcorp.system;

import homework.lesson66.com.megabankcorp.records.Account;
import io.qameta.allure.Step;

import java.math.BigDecimal;

public abstract class Database {



    @Step("cохраняет указанную сумму на указанный счет")
    public abstract void deposit(BigDecimal sum, Account account);

    @Step("снимает указанную сумму с указанного счета")
    public abstract void withdraw(BigDecimal sum, Account account);

    @Step("получает значение суммы с указанного счета")
    protected abstract BigDecimal getAmount(Account account);

    @Step("передает указанную сумму с одного указанного счета на другой")
    void transfer(BigDecimal sum,Account accountTransfer, Account accountAccept) {
        withdraw(sum,accountTransfer);
        deposit(sum, accountAccept);
    }
}
