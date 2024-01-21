package chap5;

public class Student extends Person
{
    private String subject;

    public Student(String n, String aSubject)
    {
        super(n);
        subject = aSubject;
    }


    public String getDescription() {
        return String.format("a Student who is majoring in %s", subject);
    }

}
