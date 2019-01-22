package pair3;

public class Manger extends Employee
{
    public Manger(String n, double b, int year, int month, int day) {
        super(n, b, year, month, day);
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
}
