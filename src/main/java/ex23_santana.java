import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
Replace cables and try again.
 */

public class ex23_santana
{
    public static void main( String[] args )
    {
        System.out.println("Is the car silent when you turn the key? ");
        Scanner in1 = new Scanner(System.in);
        String sil = in1.nextLine();
        if(sil.equals("yes")||sil.equals("y")||sil.equals("Yes") || sil.equals("Y"))
        {
            System.out.println("Are the battery terminals corroded? ");
            Scanner in2 = new Scanner(System.in);
            String corr = in2.nextLine();
            if(corr.equals("yes")||corr.equals("y")||corr.equals("Yes")||corr.equals("Y"))
            {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise? ");
            Scanner in2 = new Scanner(System.in);
            String slick = in2.nextLine();
            if(slick.equals("yes")||slick.equals("y")||slick.equals("Yes")||slick.equals("Y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                Scanner in3 = new Scanner(System.in);
                String fail = in3.nextLine();
                if(fail.equals("yes")||fail.equals("y")||fail.equals("Yes")||fail.equals("Y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    Scanner in4 = new Scanner(System.in);
                    String snd = in4.nextLine();
                    if(snd.equals("yes")||snd.equals("y")||snd.equals("Yes")||snd.equals("Y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        Scanner in5 = new Scanner(System.in);
                        String inj = in5.nextLine();
                        if(inj.equals("yes")||inj.equals("y")||inj.equals("Yes")||inj.equals("Y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
