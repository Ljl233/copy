package pair3;

import java.time.LocalDate;

public class Employee
{
    protected String name;
    protected double bonus;
    private LocalDate hireDay;

    public Employee(String n, double b, int year, int month, int day)
    {
        name = n;
        bonus = b;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getBonus(){
        return bonus;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

}
