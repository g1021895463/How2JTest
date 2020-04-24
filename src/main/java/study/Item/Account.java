package study.Item;

public class Account {
    private double balance;
    private double deficit;

    public Account(double balance, double deficit) {
        this.balance = balance;
        this.deficit = deficit;
    }

    public double getDeficit() {
        return this.deficit;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double money) throws MoneyException {
        if (money < 0.0 || money > 100000) {
            if (money < 0.0)
                throw new MoneyException("存款金额不能为负！");
            if (money > 100000)
                throw new MoneyException("单次存款不能超过10万元");
        }
        this.balance += money;
        System.out.println("存入" + money + "元");
    }

    public void withdraw(double money) throws MoneyException {
        if (money < 0.0 || money > 100000) {
            if (money < 0.0)
                throw new MoneyException("取款金额不能为负！");
            if (money > 100000)
                throw new MoneyException("单次取款不能超过10万元");
        }
        this.balance -= money;
        System.out.println("取出" + money + "元");
    }
    public class MoneyException extends Exception {
        MoneyException(String msg) {
            super(msg);
        }
    }
}
