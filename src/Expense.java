import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;

public class Expense {
    private LocalDateTime dateTime;
    private BigDecimal sum;
    private Currency currency;
    private String category;
    private Account account;
    private String note;


    Expense(LocalDateTime dateTime, BigDecimal sum, Currency currency, String category, Account account, String note) {
        this.dateTime = dateTime;
        this.sum = sum;
        this.currency = currency;
        this.category = category;
        this.account = account;
        this.note = note;

    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAccount() {
        return account.getName();
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }



}
