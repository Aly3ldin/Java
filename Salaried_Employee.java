package inheritance;
public class Salaried_Employee extends Employee
{
    private int bonus;
    private int deduction;

    public Salaried_Employee()
    {

    }

    public Salaried_Employee(String n, int ag, String adr, String nt,int sl, String rk , String jb , int bs, int dd)
    {
        super(n,ag,adr,nt,sl,rk,jb);
        bonus=bs;
        deduction=dd;
    }

    @Override
    public int get_Salary() {

        return Salary + bonus-deduction;
    }
}
