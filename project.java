package QuarterOne;

import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose menu: ");
        int clc_menu = sc.nextInt();
        if (clc_menu == 1){
            int cmp_a, cmp_b;
            do {
                System.out.print("\u001B[33mEnter the value of a: \u001B[0m");
                cmp_a = sc.nextInt();
                System.out.print("\u001B[33mEnter the value of b: \u001B[0m");
                cmp_b = sc.nextInt();
                if (cmp_a > 0 && cmp_b > 0 && cmp_b < 90){
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
                        System.out.println("\t\u001B[32mCheck!");
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
            
            
        }
        else if (clc_menu == 2) {
            int spp_a, spp_b;
            do {
                System.out.print("Enter the value of a: ");
                spp_a = sc.nextInt();
                System.out.print("Enter the value of b: ");
                spp_b = sc.nextInt();
                if (spp_a > 0 && spp_b > 0 && spp_b < 180) {
                     System.out.println("Let x and y be the supplementary angles such that:");
            System.out.println("\t" + "y = " + spp_a + "x + " + spp_b);
            System.out.println("Then, by the definition of supplementary angles:");
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
            System.out.println("Thus, with the computed x-value:");
            System.out.println("\t" + "y = 180 - " + spp_x1 + "/" + spp_x2);   
            System.out.println("\t" + "y = " + (180*spp_x2) + "/" + spp_x2 + " - " + spp_x1 + "/" + spp_x2);  
            int spp_y1 = (180*spp_x2) - spp_x1;
            System.out.println("\t" + "y = " + (spp_y1) + "/" + spp_x2); 
            System.out.println("\t" + "Simplified: y = " + (spp_y1) + "/" + spp_x2); 
            
            System.out.println("Checking of correctness of the values:");
            System.out.println("(1) Is x + y = 180?");
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
            System.out.println("(2) Is y equal to " + spp_a + "x + " + spp_b + "?");
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
        }
    }
    
}
