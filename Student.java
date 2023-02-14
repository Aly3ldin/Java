package inheritance;
public class Student extends Person
{
    private String Study_level;
    private String Specialization;
    private double GPA;

    public Student(String n, int ag, String adr, String nt, String sl,String spz, double gpa) {
        super(n, ag, adr, nt);
        Study_level=sl;
        Specialization=spz;
        GPA=gpa;
    }


    public void setStudy_level(String study_level) {
        Study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getStudy_level() {
        return Study_level;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public double getGPA() {
        return GPA;
    }
}
