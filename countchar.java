package countchar;
public class countchar {
    public static void main(String[]args)
    {
        String loc="localization";
        String lii="internationalization";
        System.out.println("The word of localization");
        numwords(loc);
        System.out.println("The world of internationalization");
        numwords(lii);

    }
    static final int MAX_CHAR=256;
    public static void numwords(String word)
    {
        int []calc=new int [MAX_CHAR];
        int ln=word.length();

        for(int i =0;i<ln;i++)
            calc[word.charAt(i)]++;

        char []mean= new char[word.length()];
        for(int i =0;i<ln;i++)
        {
            mean[i]=word.charAt(i);
            int get=0;
            for(int j=0;j<=i;j++)
            {
                if(word.charAt(i)== mean[j])
                    get++;
            }
            if(get==1)
                System.out.println("The Times of [" +word.charAt(i)+ "] is "+ calc[word.charAt(i)]);
        }

           }
}
