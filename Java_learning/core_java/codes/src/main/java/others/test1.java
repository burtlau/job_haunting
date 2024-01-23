package others;

public class test1 {
    public static void main(String[] args)
    {
        Programmer w = new Programmer();
        w.write();
    }


}

abstract class Writer
{
    public void write()
    {
        System.out.println("Writing...");
    }
}

class Author extends Writer{
    public void write()
    {
        System.out.println("Writing book");
    }
}

class Programmer extends Writer
{
    public void write()
    {
        System.out.println("Writing code");
    }
}

