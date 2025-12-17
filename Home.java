class Home{
    String name;
    int len, bre;

    public Home(String n, int l, int b)
    {
        name=n;
        len=l;
        bre=b;
    }

    public void display()
    {
        System.out.println("The house name is:"+name+"\nLength is:"+len+"\nBredth is:"+bre);
    }

    public static void main(String [] args)
    {
        Home obj=new Home("Ambani's House",173 ,131);

        obj.display();
    }
}