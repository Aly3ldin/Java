package inheritance;
public class Employee extends Person
{
    int Salary;
    private String Rank;
    private String Job;

    public Employee(String n, int ag, String adr, String nt,int sl, String rk , String jb) {
        super(n, ag, adr, nt);
        Salary =sl;
        Rank =rk;
        Job=jb;
    }

    public Employee() {
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public void setJob(String job) {
        Job = job;
    }

    public int get_Salary() {
        return Salary;
    }

    public String getRank() {
        return Rank;
    }

    public String getJob() {
        return Job;
    }

    @Override
    public void print_all_details ()
    {
    super.print_all_details();
    System.out.println("Job:"+Job+"\nRank:"+Rank+"\nSalary:"+Salary);
    }


}
