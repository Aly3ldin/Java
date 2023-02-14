package phone;
public class comparing_copying {
    private int length;
    private int width;
    public comparing_copying(int ln,int wd)
    {
        length=ln;
        width=wd;
    }
    public void setLength(int ln) {
        ln = length;
    }

    public void setWidth(int wd) {
        wd = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int getresult(int result)
    {
        result =length+width;
        return result;
    }
    public boolean isequal(comparing_copying obj2)
    {
        if(this.length == obj2.length && this.width == obj2.width)
        {
            return true;
        }
        else
            return false;
    }
    public comparing_copying(comparing_copying sourceobject)
    {
        this.length= sourceobject.length;
        this.width=sourceobject.width;
    }
}
