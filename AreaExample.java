class shape
{
    double area()
    {
        return 0;
    }
}

class Rectangle extends shape
{
    double length;
    double width;
    
    @Override
    double area()
    {
        return length*width;
    }
}

class Square extends shape
{
    double side;

    @Override
    double area()
    {
        return side*side;
    }
}

public class AreaExample
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        Square s = new Square();

        r.length = 10;
        r.width = 5;
        s.side = 5;

        return area();

    }
}