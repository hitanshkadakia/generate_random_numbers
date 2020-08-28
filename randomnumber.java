//This code will generate 10 random numbers between 0-500
import java.util.*;
public class randomnumber
{
    public static void main()
    {
        int c;
        Random num=new Random();
        System.out.println("Random number\n");
        for(c=1;c<=10;c++)
        {
            System.out.println(num.nextInt(500));
        }
    }
}
    