// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Game{
    void displayInfo()
    {
        System.out.println("Game");
        System.out.println("Game  is a structured type of play, usually undertaken for entertainment or fun, and sometimes used as an educational tool");
        System.out.println();
    }
}
class Cricket extends Game{
    @Override
    void displayInfo()
    {
        System.out.println("Cricket");
        System.out.println("Cricket is a bat-and-ball game played between two teams.");
        System.out.println("Each team eleven players on a field");
        System.out.println();
    }
}
class FootBall extends Game{
    @Override
    void displayInfo()
    {
        System.out.println("Tennis");
        System.out.println("Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal.");
        System.out.println("Each team eleven players on a field.");
        System.out.println();
    }
}
class Tennis extends Game{
    @Override
    void displayInfo()
    {
        System.out.println("Tennis is a racket sport that is played either individually against a single opponent or between two teams");
        System.out.println("Each team two players on a field");
        System.out.println();
    }
}
class Q2 {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
        Game[] game=new Game[5];
        game[0]=new Game();
        game[1]=new Cricket();
        game[2]=new FootBall();
        game[3]=new Tennis();
        game[4]=new Game();
        for(Game g:game)
        {
            g.displayInfo();
        }
    }
}