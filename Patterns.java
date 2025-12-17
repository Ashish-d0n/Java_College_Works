/*
Wap to print the following Patterns
    1
    12
    123
    1234
 */
import java.util.*;

 public class Patterns
 {
    int i,j;


    public static void  main(String[] args)
    {
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println(j+"\n");
            }
        }
    }
 } 