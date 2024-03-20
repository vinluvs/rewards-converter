public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double Conversion_rate=0.0035;
    public RewardValue(double cash)
    {
        this.cashValue=cash;
        this.milesValue=cash/Conversion_rate;
    }
    public RewardValue( int miles)
    {
        this.milesValue=miles;
        this.cashValue=miles*Conversion_rate;
    }

    public double getCashValue()
    {
        return this.cashValue;
    }
    public double getMilesValue()
    {
        return this.milesValue;
    }
}
