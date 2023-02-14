package phone;

public class model_phone {
       private String manfact;
       private String model;
       private double retailprice;
    public model_phone()
    {
        manfact="Apple";
        model="smart phone version 6";
        retailprice=7500;
    }
    public model_phone(double rt)
    {

        retailprice=rt;
    }
       public model_phone add(model_phone room2)
       {
           model_phone result =new model_phone();
           result.retailprice=this.retailprice+ room2.retailprice;
           return result;

       }

        public void setManfact(String mf)
        {
            manfact=mf;
        }
        public void setModel(String md)
        {
            model=md;
        }
        public void setRetailprice(double rp)
        {
            retailprice=rp;
        }
        public String getManfact()
        {
            return manfact;
        }
        public String getModel()
        {
            return model;
        }
        public double getRetailprice()
        {
            return retailprice;
        }

}
