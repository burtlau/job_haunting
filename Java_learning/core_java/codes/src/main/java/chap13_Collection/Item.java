package chap13_Collection;
import java.util.*;

public class Item implements Comparable<Item>
{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartnumber)
    {
        description = aDescription;
        partNumber = aPartnumber;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return "[descriptioin=" + description + ", partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode()
    {
        return Objects.hash(description, partNumber);
    }
    @Override
    public int compareTo(Item o) {
        return Integer.compare(partNumber, o.partNumber);
    }
}
