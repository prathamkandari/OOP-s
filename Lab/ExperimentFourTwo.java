class Player 
{
    void Info()
    {
        System.out.println("A Player");
    }
}
class Cricket_Player extends Player 
{
    void About()
    {
        System.out.println("A Cricket Palyer");
    }
}
class Football_Player extends Player 
{
    void msg()
    {
        System.out.println("A Football Player");
    }
}
class Hockey_Player extends Player 
{
    void Intro()
    {
        System.out.println("A Hockey Player");
    }
}

class ExperimentFourTwo
{
    public static void main(String args[])
    {
        Cricket_Player ob = new Cricket_Player();
        ob.About();
        ob.Info();
        Football_Player ob1 = new Football_Player();
        ob1.msg();
        Hockey_Player ob2 = new Hockey_Player();
        ob2.Intro();
    }
}