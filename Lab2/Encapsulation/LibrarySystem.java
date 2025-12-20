/* 
Design a class for a library book with private attributes such as title,
author, and publication date. Use encapsulation to protect the internal state.
*/
import java.util.Scanner;

class Library
{
    private String title;
    private String author;
    private String date;

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t)
    {
        this.title=t;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String a)
    {
        this.author=a;
    }

    public String getDate()
    {
        return date;
    }
    public void setDate(String d)
    {
        this.date=d;
    }

}
public class LibrarySystem
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        Library l=new Library();
        System.out.println("Enter the title of the book:");
        l.setTitle(scn.nextLine());

        System.out.println("\nEnter the author of the book:");
        l.setAuthor(scn.nextLine());

        System.out.println("\nEnter the date of the book in the format DD/MM/YYYY:");
        l.setDate(scn.nextLine());


        System.out.println("\n---------Book Information----------");
        System.out.println("\nThe title of the book is :"+l.getTitle());
        System.out.println("\nThe author of the book is :"+l.getAuthor());
        System.out.println("\nThe date of the book is :"+l.getDate());

        scn.close();
    }
}