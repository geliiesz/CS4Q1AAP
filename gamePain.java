

import java.util.Scanner;

public class gamePain {
    public static void main(String[]args){
        System.out.println("\nComplementary and Supplementary Angles");
        System.out.println("[1] Automation/Calculator");
        System.out.println("[2] Student Debt Game");
        System.out.println("[0] Exit");
        //select option
        Scanner choice = new Scanner(System.in);
        int Choice = choice.nextInt();

        if(Choice == 1){
            //computing complementary and supplementary angles 
            //insert Dyll's code here

        }
        if(Choice == 2){
            double debtI = 400000; //I can't subtract the 'money' variable from it if it's int ;-;
            //intro to game
            System.out.println("\nStudent Debt Game");
            System.out.println("You just entered the prestigious Sanchez University");
            System.out.println("In the process of doing so, you racked up a debt of 400,000 robux");
            System.out.print("Luckily for you, in a not-suspicious-whatsoever manner whatsoever, the Trexty and Hardy^tm Corporation");
            System.out.println("offers to help you pay off your debt");
            System.out.println("In exchange, you are to work as a []");
            while(Choice == 2){
                
                 //provide 2 angles, program tells if complementary or supplementary
                double rand = Math.random()*2;
                rand = Math.round(rand);
                int oneOrTwo=(int)(rand);
                int angle1, angle2;

                if(oneOrTwo == 1){
                    //generate complementary angles
                    double number = Math.random();
                    number = number * 90;
                    angle1=(int)(number);
                    angle2 = 90 - angle1;
                }
                else{
                    //generate supplementary angles    
                    double number = Math.random();
                    number = number * 180;
                    angle1=(int)(number);
                    angle2 = 180 - angle1;
                }
                //get sum of 2 angles
                int sum = angle1 + angle2;

                //ask if complementary or supplementary
                System.out.println("\nDetermine if the angles are complementary of supplementary");
                System.out.println("Angle 1: " + angle1);
                System.out.println("Angle 2: " + angle2);
                System.out.println("Are the angles complementary or supplementary?");

                //enter 1 if complementary and 2 if supplementary
                System.out.println("[1] complementary");
                System.out.println("[2] supplementary");
                Scanner a = new Scanner(System.in);
                int comOrSup = a.nextInt();
                int correctAnswer = 0;

                if(comOrSup != 1 && comOrSup != 2){
                    System.out.println("That is not a valid input. Please enter 1 or 2");
                }
                else if(sum == 90){
                    correctAnswer = 1;
                }
                else if(sum == 180){
                    correctAnswer = 2;
                }
                System.out.println(correctAnswer);
                System.out.println("your input: " + comOrSup);
                
                if(comOrSup == correctAnswer){
                    double money = Math.round(Math.random()*(9-1+1)+1)*10000;
                    debtI = debtI - money;
                    System.out.println("Congrats! Your debts decreased by " + money + " robux");
                    System.out.println("You're total debt is now " + debtI + "robux");
                }

                //lets player choose to continue game or return to menu
                System.out.println("\nDo you still want to play?");
                System.out.println("[1] Continue");
                System.out.println("[0] exit");
                Scanner cont = new Scanner(System.in);
                int Cont = cont.nextInt();
                if(Cont == 0){
                    Choice = 0;
                }
            }    
        }
    }
}

