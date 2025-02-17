// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Shapes{
    public int l;
    public Shapes(int l)
    {
        this.l=l;
    }
    void calculateArea(){
        System.out.println("Calculating method of area in generic method ");
    }
}
class Rectangle extends Shapes{
    int b;
    public Rectangle(int l,int b)
    {
        super(l);
        this.b=b;
        
    }
    @Override
    void calculateArea(){
        System.out.println("Area of rectangle");
        System.out.println(l*b);
    }
}
class Square extends Shapes{
    public Square(int l)
    {
        super(l);
    }
    @Override
    void calculateArea()
    {
        System.out.println("Area of Square");
        System.out.println(l*l);
    }
}
class Triangle extends Shapes{
    int h;
    public Triangle(int l,int h)
    {
        super(l);
        this.h=h;
    }
    @Override
    void calculateArea()
    {
        System.out.println("Area of Triangle");
        System.out.println((0.5)*l*h);
    }
}
class Q3 {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Shapes[] shapes=new Shapes[4];
        shapes[0]=new Shapes(4);
        shapes[1]=new Rectangle(5,6);
        shapes[2]=new Square(2);
        shapes[3]=new Triangle(3,6);
        for( Shapes s:shapes)
        {
            s.calculateArea();
        }
    }
}