// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class PhoneNumber{
    String areaCode;
    String exchange;
    String extension;
    PhoneNumber(String areaCode,String exchange,String extension)
    {
        this.areaCode=areaCode;
        this.exchange=exchange;
        this.extension=extension;
    }
    public String toString()
    {
        return "("+areaCode+")"+exchange+"-"+extension;
    }
}
class Main {
     public static boolean isEqual(Object p,Object q)
        {
            System.out.println("First Phone Number: "+p.toString());
            System.out.println("Second Phone Number: "+q.toString());
            
            return p.toString().equals(q.toString());
        }
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       
        PhoneNumber p=new PhoneNumber("800","867","5309");
        PhoneNumber q=new PhoneNumber("880","867","5309");
        System.out.println(isEqual(p,q));
        
    }
}