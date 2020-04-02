/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYICE4;

/**
 *
 * @author bhari
 */
public class Passwordval {

    String pass;
    char specificChar;

    public static void main(String[] args) {
        System.out.println("the number of specific characther is" + checkLength("mohammad", 'm'));
        System.out.println("the maximum characther is " + maxChar());
        System.out.println("the specific character is $ " + specificChar("mohammad"));

        
    }

    public static int checkLength(String pass, char specificChar) {
        int countSpecificChar = 0;

        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) == specificChar) {
                countSpecificChar = countSpecificChar + 1;
            }
        }
        return countSpecificChar;
    }

    public static char maxChar() {
        char[] max = {'m', 'o', 'h', 'a', 'd'};
        char max2 = max[0];

        for (int i = 0; i < 5; i++) {
            if (max[i] > 'm') {
                max2 = max[i];
            }

        }
        return max2;
    }

    public static boolean specificChar(String pass) {
        boolean exist = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) == 'a') {
               exist = true;
            }
        }
        return exist;

    }
}
