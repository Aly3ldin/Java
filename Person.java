package inheritance;
public abstract class Person
{
    private String name;
    private int age;
    private String address;
    private String nationality;

    public Person(String n,int ag , String adr, String nt)
    {
      name =n;
      age =ag;
      address=adr;
      nationality=nt;
    }

    public Person() {
    }

    public void setName(String nm)
    {
        name=nm;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public void print_all_details()
    {
        System.out.println("Name:"+name+"\nAge:"+age+"\nAddress"+address+"\nNationality:"+nationality);
    }

}
