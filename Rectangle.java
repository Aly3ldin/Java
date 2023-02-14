package objeandclas;

public class Rectangle
    {
        private double width;
        private double length;


        public void setlength(double l)
        {
            length=l;
        }
        public void setWidth(double w)
        {
            width =w;
        }
        public double getLength()
        {
            return length;
        }
        public double getWidth()
        {
            return width;
        }
        public double getarea()
        {
             return width*length;
        }


    }

