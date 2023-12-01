import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Currency;

public class Expense {
    private LocalDate date;
    private LocalTime time;
    private BigDecimal sum;
    private Currency currency;
    private String category;
    private Account account;
    private String note;

    Expense(LocalDate date, LocalTime time, BigDecimal sum, Currency currency, String category, Account account, String note) {
        this.date = date;
        this.time = time;
        this.sum = sum;
        this.currency = currency;
        this.category = category;
        this.account = account;
        this.note = note;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
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