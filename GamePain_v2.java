package QuarterOne;

import java.util.Scanner;

public class gamePain {
 
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("| Complementary & Supplementary Angle Program |");
        System.out.println("\t     --- Main Menu ---\n");
        System.out.println("[1] Automation/Calculator");
        System.out.println("[2] Student Debt Game");
        System.out.println("[0] Exit");
        System.out.println("===============================================");
        
        //select option
        Scanner choice = new Scanner(System.in);
        int Choice = choice.nextInt();

        if (Choice == 1) {
            //computing complementary and supplementary angles 
            //insert Dyll's code here

        }
        if (Choice == 2) {
            double debtI = 400; 
            double payAmt = 4;
            //intro to game
            System.out.println("\nStudent Debt Game");
            System.out.println("You just entered the prestigious Sanchez University");
            System.out.println("In the process of doing so, you racked up a debt of 400,000 robux");
            System.out.print("Luckily for you, in a not-suspicious-whatsoever manner whatsoever, the Trexty and Hardy^tm Corporation");
            System.out.println("offers to help you pay off your debt");
            System.out.println("In exchange, you are to work as an intern with a starting pay of 4,000 robux");
            while (Choice == 2) {
                System.out.println("\nYou are currently " + (int) debtI + ",000 in debt!");
                System.out.println("Select work task in order pay off your debt!");
                System.out.println("Task Option 1: Complementary vs Supplementary");
                System.out.println("Determine if the two angles given are complementary angles or supplementary angles");
                System.out.println("A correct answer will yield " + (int) (payAmt * 1000) + " robux, but a wrong answer will deduct you 1000 robux");
                System.out.println("Task Option 2: Angle Algebra");
                System.out.println("Determine the value of x, given the equation of two angles that are either complementary or supplementary angles");
                System.out.println("A correct answer will yield " + (int) (payAmt * 1000) + " robux, but a wrong answer will deduct you " + (int) (payAmt * 2000) + " robux");
                System.out.println("Moreover, a correct answer will raise your next salary by 25-50%, while a wrong answer will cut your next salary by 15-20%");
                System.out.print("\nChoose task: ");

                int taskOpt = choice.nextInt();

                if (taskOpt == 1) {
                    //provide 2 angles, program tells if complementary or supplementary
                    double rand = Math.random() * 2;
                    rand = Math.round(rand);
                    int oneOrTwo = (int) (rand);
                    int angle1, angle2;

                    if (oneOrTwo == 1) {
                        //generate complementary angles
                        double number = Math.random();
                        number = number * 90;
                        angle1 = (int) (number);
                        angle2 = 90 - angle1;
                    } else {
                        //generate supplementary angles    
                        double number = Math.random();
                        number = number * 180;
                        angle1 = (int) (number);
                        angle2 = 180 - angle1;
                    }
                    //get sum of 2 angles
                    int sum = angle1 + angle2;

                    //ask if complementary or supplementary
                    System.out.println("\nDetermine if the angles are complementary or supplementary");
                    System.out.println("Angle 1: " + angle1);
                    System.out.println("Angle 2: " + angle2);
                    System.out.println("Are the angles complementary (1) or supplementary (2)?");

                    //enter 1 if complementary and 2 if supplementary
                    System.out.print("Answer: ");
                    int comOrSup = choice.nextInt();
                    int correctAnswer = 0;

                    if (comOrSup != 1 && comOrSup != 2) {
                        System.out.println("That is not a valid input. Please enter 1 or 2");
                    } else if (sum == 90) {
                        correctAnswer = 1;
                    } else if (sum == 180) {
                        correctAnswer = 2;
                    }
                    if (comOrSup == correctAnswer) {
                        System.out.println("Correct! The answer is " + correctAnswer + "!");
                        debtI -= payAmt;
                        System.out.println("\nCongrats! Your debts decreased by " + (int) (payAmt * 1000) + " robux");
                        System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                    } else {
                        System.out.println("Incorrect! The answer is " + correctAnswer + "!");
                        debtI++;
                        System.out.println("\nOh no! Your debts increased by 1000 robux");
                        System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                    }
                } 
                else if (taskOpt == 2) {
                    //provide 2 angles, program tells if complementary or supplementary
                    double rand = Math.random() * 2;
                    rand = Math.round(rand);
                    int oneOrTwo = (int) (rand);
                    
                    int eqCoeffA, eqConstA, eqCoeffB, eqConstB;
                    float tsk2_answer;
                    int eqConstSignA = (int) Math.ceil(Math.random() * 2);
                    int eqConstSignB = (int) Math.ceil(Math.random() * 2);

                    if (oneOrTwo == 1) {
                        //complementary angle logic
                        eqCoeffA = (int) Math.ceil(Math.random() * 15);
                        eqConstA = (int) Math.ceil(Math.random() * 25);
                        eqCoeffB = (int) Math.ceil(Math.random() * 15);
                        eqConstB = (int) Math.ceil(Math.random() * 25);
                        tsk2_answer = 90;
                        System.out.println("\nAngles A and B are COMPLEMENTARY");
                    } 
                    else {
                        //supplementary angle logic   
                        eqCoeffA = (int) Math.ceil(Math.random() * 30);
                        eqConstA = (int) Math.ceil(Math.random() * 50);
                        eqCoeffB = (int) Math.ceil(Math.random() * 30);
                        eqConstB = (int) Math.ceil(Math.random() * 50);
                        tsk2_answer = 180;
                        System.out.println("\nAngles A and B are SUPPLEMENTARY");
                    }
                    int eqCoeffAB = 0, eqConstAB = 0;
                    if (eqConstSignA == 1) {
                        System.out.println("Angle A = " + eqCoeffA + "x + " + eqConstA); //positive constant
                        eqCoeffAB = eqCoeffA;
                        eqConstAB = eqConstA;
                    }
                    else if (eqConstSignA == 2) {
                        System.out.println("Angle A = " + eqCoeffA + "x - " + eqConstA); //negative constant
                        eqCoeffAB = eqCoeffA;
                        eqConstAB = 0 - eqConstA;
                    }
                    if (eqConstSignB == 1) {
                        System.out.println("Angle B = " + eqCoeffB + "x + " + eqConstB); //positive constant
                        eqCoeffAB += eqCoeffB;
                        eqConstAB += eqConstB;
                    } 
                    else if (eqConstSignB == 2) {
                        System.out.println("Angle B = " + eqCoeffB + "x - " + eqConstB); //negative constant
                        eqCoeffAB += eqCoeffB;
                        eqConstAB -= eqConstB;
                    }
                    
                    System.out.println(eqCoeffAB + " " + eqConstAB);
                    tsk2_answer = (tsk2_answer - eqConstAB) / (eqCoeffAB);
                    System.out.print("Input Answer (Numerator): ");
                        int tsk2_inputA = choice.nextInt();
                        System.out.print("Input Answer (Denominator): ");
                        int tsk2_inputB = choice.nextInt();
                        float tsk2_input = (float)tsk2_inputA / (float)tsk2_inputB;
                        if (tsk2_input == tsk2_answer) {
                            System.out.println("Correct! The answer (in decimals) is " + tsk2_answer + "!");
                            debtI -= payAmt;
                            System.out.println("\nCongrats! Your debts decreased by " + (int) (payAmt * 1000) + " robux");
                            double payIntUp = (Math.ceil(Math.random()*25)+25);
                            System.out.println("T&H CO: Excellent! Your salary will increase by " + (int)(payIntUp) + "% (" + (int)(payIntUp*payAmt*10) + " robux)");
                            System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                            payAmt = payAmt + (payAmt*payIntUp*0.01);
                            System.out.println("Your new salary will now be " + (int) (payAmt * 1000) + " robux");
                        } 
                        else {
                            System.out.println("Incorrect! The answer (in decimals) is " + tsk2_answer + "!");
                            debtI += payAmt;
                            System.out.println("\nOh no! Your debts increased by "  + (int) (payAmt * 1000) + " robux");
                            double payIntDown = (Math.ceil(Math.random()*5)+15);
                            System.out.println("T&H CO: We expect better! Your salary will decrease by " + (int)(payIntDown) + "% (" + (int)(payIntDown*payAmt*10) + " robux)");
                            System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                            payAmt = payAmt - (payAmt*payIntDown*0.01);
                            System.out.println("Your new salary will now be " + (int) (payAmt * 1000) + " robux");
                        }
                }

                //lets player choose to continue game or return to menu
                System.out.println("\nDo you still want to play?");
                System.out.println("[1] Continue");
                System.out.println("[0] exit");
                Scanner cont = new Scanner(System.in);
                int Cont = cont.nextInt();
                if (Cont == 0) {
                    Choice = 0;
                }
            }
        }
    }
}
