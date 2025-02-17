// Online Java Compiler
// Use this editor to write, compile and run your Java code online
abstract class Instrument{
    public abstract void play();
    
}
class Piano extends Instrument{
    @Override
    public void play()
    {
        System.out.println(" tan tan tan tan");
    }
    
}
class Flute extends Instrument{
    @Override
    public void play(){
        System.out.println(" toot toot toot toot");
    }
    
}
class Guitar extends Instrument{
    @Override
    public void play(){
        System.out.println(" tin tin tin");
    }
    
}
class Q6 {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
        Instrument[] instrument=new Instrument[10];
        instrument[0]=new Piano();
        instrument[1]=new Flute();
        instrument[2]=new Guitar();
        instrument[3]=new Piano();
        instrument[4]=new Flute();
        instrument[5]=new Guitar();
        instrument[6]=new Piano();
        instrument[7]=new Flute();
        instrument[8]=new Guitar();
        instrument[9]=new Piano();
        int k=0;
        for(Instrument i:instrument)
        {
            System.out.println("At Index "+(k++)+" :");
            if(i instanceof Piano )
            {
                System.out.println("Piano is playing ");
            }
            else if(i instanceof Flute)
            {
                System.out.println("Flute is playing ");
            }
            else{
                System.out.println("Guitar is playing ");
            }
            i.play();
            System.out.println();
        }
        
        
    }
}