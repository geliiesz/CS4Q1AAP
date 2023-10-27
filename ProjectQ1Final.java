package QuarterOne;

import java.util.Scanner;
import java.util.concurrent.*;

public class ProjectQ1Final {

    public static int min, sec, Cont;
    
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        int Choice;
                
        do {
            System.out.println("===============================================");
            System.out.println("| Complementary & Supplementary Angle Program |");
            System.out.println("\t     --- Main Menu ---\n");
            System.out.println("[1] Automation/Calculator");
            System.out.println("[2] Student Debt Game");
            System.out.println("[0] Exit\n");
            System.out.println("===============================================");

            System.out.print("Your Choice: ");
            Choice = choice.nextInt();
                
            if (Choice == 1) {
                System.out.println("\n===============================================");
                System.out.println("| Complementary & Supplementary Angle Program |");
                System.out.println("\t       --- Calculator ---");
            }
                //computing complementary and supplementary angles 
                while (Choice == 1) {
                    System.out.println("\n[1] Complementary Angles x Slope-Intercept");
                    System.out.println("[2] Supplementary Angles x Slope-Intercept");
                    System.out.println("[0] Return to Main\n");
                    System.out.print("Your choice: ");
                    int clc_menu = choice.nextInt();
                    if (clc_menu == 0) {
                        System.out.println("=============================================");
                        System.out.println("\u001B[32mReturning to Main Menu...\u001B[0m\n");
                        Choice = 3;
                    }
                    while (clc_menu == 1){
                        System.out.println("\n---------- Complementary Angles Calc ----------");
                        int cmp_a, cmp_b;
                        do {
                            System.out.print("\u001B[36mEnter the value of a: \u001B[0m");
                            cmp_a = choice.nextInt();
                            System.out.print("\u001B[36mEnter the value of b: \u001B[0m");
                            cmp_b = choice.nextInt();
                            if (cmp_a > 0 && cmp_b > 0 && cmp_b < 90){
                                System.out.println("\nCalculating...\n");
                                System.out.println("\u001B[34mLet x and y be the complementary angles such that:\u001B[0m");
                                System.out.println("\t" + "y = " + cmp_a + "x + " + cmp_b);
                                System.out.println("\u001B[34mThen, by the definition of complementary angles:\u001B[0m");
                                System.out.println("\t" + "x + y = 90");
                                System.out.println("\t" + "x + " + cmp_a + "x + " + cmp_b + " = 90");
                                System.out.println("\t" + (cmp_a + 1) + "x = 90" + " - " + cmp_b);
                                System.out.println("\t" + (cmp_a + 1) + "x = " + (90-cmp_b));
                                System.out.println("\t" + "x = " + (90-cmp_b) + "/" + (cmp_a + 1));   
                                int cmp_gcf = 0;
                                for (int i = 1; i<=(90-cmp_b) | i<=(cmp_a+1); i++){
                                    if ((90-cmp_b)%i == 0 && (cmp_a+1)%i == 0){
                                        cmp_gcf = i;
                                    }
                                }
                                int cmp_x1 = (90-cmp_b)/cmp_gcf;
                                int cmp_x2 = (cmp_a + 1)/cmp_gcf;
                                System.out.println("\t" + "Simplified: x = " + cmp_x1 + "/" + cmp_x2);
                                System.out.println("\u001B[34mThus, with the computed x-value:\u001B[0m");
                                System.out.println("\t" + "y = 90 - " + cmp_x1 + "/" + cmp_x2);   
                                System.out.println("\t" + "y = " + (90*cmp_x2) + "/" + cmp_x2 + " - " + cmp_x1 + "/" + cmp_x2);  
                                int cmp_y1 = (90*cmp_x2) - cmp_x1;
                                System.out.println("\t" + "y = " + (cmp_y1) + "/" + cmp_x2); 
                                System.out.println("\t" + "Simplified: y = " + (cmp_y1) + "/" + cmp_x2); 

                                System.out.println("\u001B[34mChecking of correctness of the values:");
                                System.out.println("(1) Is x + y = 90?\u001B[0m");
                                System.out.println("\t" + "x + y = 90");
                                System.out.println("\t" + cmp_x1 + "/" + cmp_x2 + " + " + cmp_y1 + "/" + cmp_x2 + " = 90"); 
                                System.out.println("\t" + (cmp_x1 + cmp_y1) + "/" + cmp_x2 + " = 90"); 
                                System.out.println("\t" + (cmp_x1 + cmp_y1)/cmp_x2 + " = 90");
                                if (((cmp_x1 + cmp_y1)/cmp_x2) == 90){
                                    System.out.println("\t\u001B[32mCheck!");
                                }
                                else {
                                    System.out.println("\tWrong!");
                                }
                                System.out.println("\u001B[34m(2) Is y equal to " + cmp_a + "x + " + cmp_b + "?\u001B[0m");
                                System.out.println("\t" + "y = " + cmp_a + "x + " + cmp_b);
                                System.out.println("\t" + cmp_y1 + "/" + cmp_x2 + " = " + cmp_a + "(" + cmp_x1 + "/" + cmp_x2 + ") + " + cmp_b);
                                System.out.println("\t" + cmp_y1 + "/" + cmp_x2 + " - " + (cmp_a*cmp_x1) + "/" + cmp_x2 + " = " + cmp_b);
                                System.out.println("\t" + (cmp_y1-(cmp_a*cmp_x1)) + "/" + cmp_x2 + " = " + cmp_b);
                                System.out.println("\t" + (cmp_y1-(cmp_a*cmp_x1))/cmp_x2 + " = " + cmp_b);
                                if ((cmp_y1 - (cmp_a*cmp_x1))/cmp_x2 == cmp_b){
                                    System.out.println("\t\u001B[32mCheck!\u001B[0m");
                                }
                                else {
                                    System.out.println("\tWrong!");
                                }
                            }
                            else if ((cmp_a <= 0 || cmp_b <= 0) && cmp_b >= 90) {
                                System.out.println("\u001B[31mInvalid Input! Value of a and b must be positive and non-zero, and b must be less than 90!\u001B[0m");
                            }
                            else if ((cmp_a <= 0 || cmp_b <= 0) && cmp_b < 90) {
                                System.out.println("\u001B[31mInvalid Input! Value of a and b must be positive and non-zero!\u001B[0m");
                            }
                            else if ((cmp_a > 0 || cmp_b > 0) && cmp_b >= 90) {
                                System.out.println("\u001B[31mInvalid Input! Value of b must be less than 90!\u001B[0m");
                            }
                            else {
                                System.out.println("\u001B[31mInvalid Input!\u001B[0m");
                            }
                        }
                        while (cmp_a <= 0 || cmp_b <= 0 || cmp_b >= 90);
                        System.out.println("\nCalculate again?");
                        System.out.println("[1] Continue");
                        System.out.println("[0] Back to Calc Menu");
                        System.out.print("Your choice: ");
                        int clc1_chk = choice.nextInt();
                        if (clc1_chk != 1) {
                            System.out.println("-----------------------------------------------");
                            System.out.println("\u001B[32mReturning to Calculator Menu...\u001B[32m");
                            clc_menu = 0;
                        }
                    }
                    while (clc_menu == 2) {
                        System.out.println("\n---------- Supplementary Angles Calc ----------");
                        int spp_a, spp_b;
                        do {
                            System.out.print("\u001B[36mEnter the value of a: \u001B[0m");
                            spp_a = choice.nextInt();
                            System.out.print("\u001B[36mEnter the value of b: \u001B[0m");
                            spp_b = choice.nextInt();
                            if (spp_a > 0 && spp_b > 0 && spp_b < 180) {
                                System.out.println("\nCalculating...\n");
                                System.out.println("\u001B[34mLet x and y be the supplementary angles such that:\u001B[0m");
                                System.out.println("\t" + "y = " + spp_a + "x + " + spp_b);
                                System.out.println("\u001B[34mThen, by the definition of supplementary angles:\u001B[0m");
                                System.out.println("\t" + "x + y = 180");
                                System.out.println("\t" + "x + " + spp_a + "x + " + spp_b + " = 180");
                                System.out.println("\t" + (spp_a + 1) + "x = 180" + " - " + spp_b);
                                System.out.println("\t" + (spp_a + 1) + "x = " + (180-spp_b));
                                System.out.println("\t" + "x = " + (180-spp_b) + "/" + (spp_a + 1));   
                                int cmp_gcf = 0;
                                for (int i = 1; i<=(180-spp_b) | i<=(spp_a+1); i++){
                                    if ((180-spp_b)%i == 0 && (spp_a+1)%i == 0){
                                        cmp_gcf = i;
                                    }
                                }
                                int spp_x1 = (180-spp_b)/cmp_gcf;
                                int spp_x2 = (spp_a + 1)/cmp_gcf;
                                System.out.println("\t" + "Simplified: x = " + spp_x1 + "/" + spp_x2);
                                System.out.println("\u001B[34mThus, with the computed x-value:\u001B[0m");
                                System.out.println("\t" + "y = 180 - " + spp_x1 + "/" + spp_x2);   
                                System.out.println("\t" + "y = " + (180*spp_x2) + "/" + spp_x2 + " - " + spp_x1 + "/" + spp_x2);  
                                int spp_y1 = (180*spp_x2) - spp_x1;
                                System.out.println("\t" + "y = " + (spp_y1) + "/" + spp_x2); 
                                System.out.println("\t" + "Simplified: y = " + (spp_y1) + "/" + spp_x2); 

                                System.out.println("\u001B[34mChecking of correctness of the values:");
                                System.out.println("(1) Is x + y = 180?\u001B[0m");
                                System.out.println("\t" + "x + y = 180");
                                System.out.println("\t" + spp_x1 + "/" + spp_x2 + " + " + spp_y1 + "/" + spp_x2 + " = 180"); 
                                System.out.println("\t" + (spp_x1 + spp_y1) + "/" + spp_x2 + " = 180"); 
                                System.out.println("\t" + (spp_x1 + spp_y1)/spp_x2 + " = 180");
                                if (((spp_x1 + spp_y1)/spp_x2) == 180){
                                    System.out.println("\t\u001B[32mCheck!");
                                }
                                else {
                                    System.out.println("\tWrong!");
                                }
                                System.out.println("\u001B[34m(2) Is y equal to " + spp_a + "x + " + spp_b + "?\u001B[0m");
                                System.out.println("\t" + "y = " + spp_a + "x + " + spp_b);
                                System.out.println("\t" +  spp_y1 + "/" + spp_x2 + " = " + spp_a + "(" + spp_x1 + "/" + spp_x2 + ") + " + spp_b);
                                System.out.println("\t" +  spp_y1 + "/" + spp_x2 + " - " + (spp_a*spp_x1) + "/" + spp_x2 + " = " + spp_b);
                                System.out.println("\t" +  (spp_y1-(spp_a*spp_x1)) + "/" + spp_x2 + " = " + spp_b);
                                System.out.println("\t" +  (spp_y1-(spp_a*spp_x1))/spp_x2 + " = " + spp_b);
                                if ((spp_y1 - (spp_a*spp_x1))/spp_x2 == spp_b){
                                    System.out.println("\t\u001B[32mCheck!");
                                }
                                else {
                                    System.out.println("\tWrong!");
                                }
                                    }
                                    else if ((spp_a <= 0 || spp_b <= 0) && spp_b >= 180) {
                                        System.out.println("\u001B[31mInvalid Input! Value of a and b must be positive and non-zero, and b must be less than 180!\u001B[0m");
                                    }
                                    else if ((spp_a <= 0 || spp_b <= 0) && spp_b < 180) {
                                        System.out.println("\u001B[31mInvalid Input! Value of a and b must be positive and non-zero!\u001B[0m");
                                    }
                                    else if ((spp_a > 0 || spp_b > 0) && spp_b >= 180) {
                                        System.out.println("\u001B[31mInvalid Input! Value of b must be less than 180!\u001B[0m");
                                    }
                                    else {
                                        System.out.println("\u001B[31mInvalid Input!\u001B[0m");
                                    }
                                }
                                while (spp_a <= 0 || spp_b <= 0 || spp_b >= 180);
                                System.out.println("\nCalculate again?");
                                System.out.println("[1] Continue");
                                System.out.println("[0] Back to Calc Menu");
                                System.out.print("Your choice: ");
                                int clc2_chk = choice.nextInt();
                                if (clc2_chk != 1) {
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("\u001B[32mReturning to Calculator Menu...\u001B[32m");
                                    clc_menu = 0;
                                }
                            }
                    
                    }
            if (Choice == 2) {
                double debtI = 150; 
                double payAmt = 10;
                //intro to game
                System.out.println("\n===============================================");
                System.out.println("| Complementary & Supplementary Angle Program |");
                System.out.println("\t  --- Student Debt Game ---\n");
                System.out.println("You just entered the prestigious Sanchez University");
                System.out.println("In the process of doing so, you racked up a debt of 150,000 robux");
                System.out.println("Luckily for you, in a not-suspicious-whatsoever manner whatsoever, the Trexty");
                System.out.println("and Hardy Corporation offers to help you pay off your debt.");
                System.out.println("In exchange, you are to work as an intern with a starting pay of 4,000 robux");
                System.out.println("Pay off your debt within 5 minutes, you win!");
                System.out.println("Fail to do so, and you're going to Alcatraz!");
                System.out.print("\nEnter to continue");
                choice.nextLine();
                String holder = choice.nextLine();
                
                System.out.println("\nGENERAL INSTRUCTIONS");
                System.out.println("You have two task options. Each one has its own rewards or demerits depending on your answer.");
                System.out.println("\nTask ONE gives you with two angles with their measures in degrees. Based on the values, you");
                System.out.println("are to determine whether the two angles are either complementary or supplementary. A correct");
                System.out.println("answer will yield you with your pay, but a wrong answer will deduct you 1000 robux.");
                System.out.println("Task TWO gives you the equations of two angles, and if either the angles are complementary or");
                System.out.println("supplementary. With this, determine x's value. Right answers will yield your pay (w/ 750 bonus) and");
                System.out.println("increase your next salary. Wrong answers demote your next pay grade and deduct you twice your pay.");
                System.out.print("\nEnter to continue and begin");
                holder = choice.nextLine();
                
                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
                min = 4;
                sec = 3;
                Runnable task = new Runnable() {
                    @Override
                    public void run() {
                        if (sec > 0 || min > 0 ) {
                            System.out.println("\u001B[31m[GAME] " + min + ":" + sec + "0 left!\u001B[0m");
                            System.out.print("Continue input here: ");
                            if (sec == 0) {
                                min --;
                                sec = 3;
                            }
                            else {
                                sec = 0;
                            }
                        }
                    }
                };
                scheduler.scheduleAtFixedRate(task, 30, 30, TimeUnit.SECONDS);
                Runnable timerOut = new Runnable() {
                    @Override
                    public void run() {
                        scheduler.shutdownNow();
                        System.out.println("\u001B[31m[GAME] TIME RAN OUT! Finalize Inputs!");
                        System.out.print("Continue input here: ");
                    }
                };
                scheduler.schedule(timerOut, 300,TimeUnit.SECONDS);
                
                do {
                    System.out.println("\nYou are currently " + (int) debtI + ",000 in debt!");
                    System.out.println("Select work task in order pay off your debt!");
                    String optHead = "Task 1: This or That  |  Task 2: Finding eXes";
                    System.out.println(optHead);
                    String gainTab = "[/] + " + (int) (payAmt * 1000) + " robux  |";
                    for (int i=0; i<(23-gainTab.length()); i++) System.out.print(" ");
                    System.out.println(gainTab + "  [/] + " + (int) ((payAmt * 1000)+750) + " robux, + 25-50%");
                    System.out.println("    [x] - 1000 robux  |  [x] - " + (int) (payAmt * 2000) + " robux, + 15-30%");
                    System.out.print("Choose task: ");

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
                        int comOrSup = 0;
                        while (comOrSup != 1 && comOrSup != 2) {
                            System.out.print("Answer: ");
                            comOrSup = choice.nextInt();
                            if (comOrSup != 1 && comOrSup != 2) System.out.println("Invalid output. Input should be 1 or 2.");;
                        }
                        
                        
                        int correctAnswer = 0;
                        if (sum == 90) correctAnswer = 1;
                        else if (sum == 180) correctAnswer = 2;
                        
                        if (comOrSup == correctAnswer) {
                            System.out.println("Correct! The answer is " + correctAnswer + "!");
                            debtI -= payAmt;
                            System.out.println("\nT&H CO: Congrats! Your debts decreased by " + (int) (payAmt * 1000) + " robux");
                            System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                        } else {
                            System.out.println("Incorrect! The answer is " + correctAnswer + "!");
                            debtI++;
                            System.out.println("\nT&H CO: We expected better. Your debts increased by 1000 robux");
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

                        tsk2_answer = (tsk2_answer - eqConstAB) / (eqCoeffAB);
                        System.out.print("Input Answer (Numerator): ");
                            int tsk2_inputA = choice.nextInt();
                            System.out.print("Input Answer (Denominator): ");
                            int tsk2_inputB = choice.nextInt();
                            float tsk2_input = (float)tsk2_inputA / (float)tsk2_inputB;
                            if (tsk2_input == tsk2_answer) {
                                System.out.println("Correct! The answer (in decimals) is " + tsk2_answer + "!");
                                debtI -= (payAmt+.75);
                                System.out.println("\nCongrats! Your debts decreased by " + (int) ((payAmt * 1000)+750) + " robux");
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
                                double payIntDown = (Math.ceil(Math.random()*15)+15);
                                System.out.println("T&H CO: We expect better! Your salary will decrease by " + (int)(payIntDown) + "% (" + (int)(payIntDown*payAmt*10) + " robux)");
                                System.out.println("Your total debt is now " + (int) (debtI * 1000) + " robux");
                                payAmt = payAmt - (payAmt*payIntDown*0.01);
                                System.out.println("Your new salary will now be " + (int) (payAmt * 1000) + " robux");
                            }
                    }
                    
                        if (debtI <= 0) {
                            System.out.println("\u001B[32mYOU WON! You successfully paid off your debt! have now exited the program.");
                            System.out.println("\u001B[32mYour partnership with Trexty and Hardy Incorporated");
                            System.out.println("\u001B[32mhas ended as you continue your journey independently.");
                            scheduler.shutdownNow();
                            System.out.print("\n\u001B[0mPress ENTER to return to main menu");
                            choice.nextLine();
                            String holder2 = choice.nextLine();
                            Cont = 0;
                        }
                        else if ((sec > 0 || min > 0) && debtI > 0) {
                            //lets player choose to continue game or return to menu
                            System.out.println("\nDo you still want to play?");
                            System.out.println("[1] Continue");
                            System.out.println("[0] Back to Main");
                            System.out.print("Your choice: ");
                            Cont = choice.nextInt();
                        }
                        else if (sec <= 0 && min <= 0 && debtI > 0) {
                            System.out.println("\n\u001B[31mGAME OVER! You failed to pay your debt!");
                            System.out.println("\u001B[31mThe Internal Revenue Bureau sentenced you to a total..");
                            System.out.println("\u001B[31m10 YEARS IN ALCATRAZ PRISON!");
                            System.out.println("\u001B[31mUntil then, you suffer living in lonely misery.");
                            System.out.print("\n\u001B[0mPress ENTER to return to main menu");
                            choice.nextLine();
                            String holder2 = choice.nextLine();
                            Cont = 0;
                        }
                       

                        if (Cont == 0) {
                            System.out.println("===============================================");
                            System.out.println("\u001B[32mReturning to Main Menu...\u001B[0m\n");
                        }
                    }
                    while (Cont != 0);
                }
            }
            while (Choice != 0);  
            System.out.println("\n\u001B[31m[PROGRAM] You have now exited the program.\n");
        }
    }
