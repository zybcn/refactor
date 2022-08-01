package move.field;

/**
 * @Author ZhangYiBo
 * @Date 2022-08-01 23:02
 */
public class Account {

    private AccountType accountType;
    /**
     * 想要搬移的field
     */
    private double interestRate;


    /**
     * 第一种方式  直接似乎用accountType
     */
    double interestForAmount_days1(double amount, int days) {
        return accountType.getInterestRate() * amount * days / 365;
    }


    /**
     * 第二种方式 使用自封装来进行字段的转移 accountType在被大量使用时 建议采用自我封装
     */
    public double getInterestRate() {
        return accountType.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        accountType.setInterestRate(interestRate);
    }

    double interestForAmount_days2(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }


}
