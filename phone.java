package phone;

import javax.swing.*;

public class phone {
    public static void main(String[]args)
    {
      //  model_phone smart ;

       // smart=new model_phone();

            /*smart.setManfact("OPPO");
            smart.setModel("Smart phone");
            smart.setRetailprice(2021);

            model_phone smrt;
            smrt=new model_phone();

           String mf= smart.getManfact();
           System.out.println(mf);

           String md= smart.getModel();
           System.out.println(md);

           double rt =smart.getRetailprice();
           System.out.println(rt);


        model_phone r1;
         r1=new model_phone(3333);

         model_phone r2;
         r2=new model_phone(2992);

         System.out.println(r1.add(r2).getRetailprice());


        comparing_copying r1= new comparing_copying(33,50);
        comparing_copying r2= new comparing_copying(30,50);

        if(r1.isequal(r2))
            System.out.println("The objects are equal");
        else
            System.out.println("The Objects are not equal");
             */
        comparing_copying r1 =new comparing_copying(44,55);
        comparing_copying r2 =new comparing_copying(r1);

        System.out.println(r2.getLength()+" "+r2.getWidth());




    }
}
