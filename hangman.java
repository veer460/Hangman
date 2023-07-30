import java.util.*; //importing the pacakge util
public class HangMan//creating a class pf type public with the name HangMan
{
    public static void Error()//to display when the user enters the first wrong letter
    {
        System.out.println("      _______   ");
        System.out.println("     |       |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public static void Error1()//to display when the user enters the second wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       ");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public static void Error2()//to display when the user enters the third wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public static void Error3()//to display when the user enters the fourth wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |      /");
        System.out.println("_____|_____ ");
    }
    public static void Error4()//to display when the user enters the fifth wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }
    public static void Error5()//to display when the user enters the sixth wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |      /|");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }
    public static void Error6()//to display when the user enters the senventh wrong letter
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |      /|\\");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }
    public static void main()
    {//main opens
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");//to ask the user to enter a word
        String word;
        char guess;
        int i,c=0,x=0,flag=0;
        word =in.next();//the word is stored by the user
        int l=word.length();//to calculate the length of the word
        char a[] = new char[10];
        for( i=0;i<word.length();i++)//loop starts
        {
            a[i]=word.charAt(i);//each letter of the word is stored in the array
            System.out.print('\u000C');//this erases the word from the terminal window
        }
        for(i=0;i<100;i++)//loop starts
        {
            System.out.println("enter your guessings");//to ask the user to start entering their guessings
            guess=in.next().charAt(0);//storing them in the variable guess
            for(int j=0;j<l;j++)//loop starts
            {
                flag=0;
                if(guess==a[j])//to compare each leeter of the word with the guessed letter
                {
                    System.out.println("Correct guess , continue");
                    x++;//value of x incremets
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                c++;          

                if (c==1)
                {
                    System.out.println("");
                    Error();
                    System.out.println("");
                }
                else if (c==2)
                {
                    System.out.println("");
                    Error1();
                    System.out.println("");
                }
                else if (c==3)
                {
                    System.out.println("");
                    Error2();
                    System.out.println("");
                }
                else if (c==4)
                {
                    System.out.println("");
                    Error3();
                    System.out.println("");
                }
                else if (c==5)
                {
                    System.out.println("");
                    Error4();
                    System.out.println("");
                }
                else if (c==6)
                {
                    System.out.println("");
                    Error5();
                    System.out.println("");
                }
                else if (c==7)
                {
                    System.out.println("");
                    Error6();
                    System.out.println("");
                    System.out.println("Sorry you lost try again");

                }
            }
            if(x==l)
            {
                System.out.println("Congratulations you have guessed the word "+word+"currectly");
                break;
            }
            if(c==7){
                System.out.println("you lose");
                System.out.println("The word was "+word);
                System.out.println("GAME OVER!!!");
                break;
    
            }//loop ends
        }//loop ends
    }//main ends
}//class ends