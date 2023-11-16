/*
*   Name: Audrey Tan
*   Section: 11
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed Audrey Tan Date Nov 16 2023
* */

import static javax.swing.text.html.HTML.Attribute.N;

public class Main {

    public static int numberOfVowels(String one) {
        String vowels = "aeiou";
        int count = 0;
        for (int i=0; i < one.length(); i++) {
            char ch = one.charAt(i);
            if (vowels.contains("" + ch); {
                count++;
            }
        }
        return count;
    }

    public static int notDivisibleBy235(int i) {
            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        System.out.println(numberOfVowels(inputString)); // Output: 3

        int N = 5;
        int result = notDivisibleBy235(N);
        System.out.println("Answer: " + result); // Output: 1

        String inputString1 = "the-stealth-warrior";
        String inputString2 = "The_Stealth_Warrior";
        String inputString3 = "The_Stealth-Warrior";

        System.out.println(camelCaseMe(inputString1)); // Output: theStealthWarrior
        System.out.println(camelCaseMe(inputString2)); // Output: TheStealthWarrior
        System.out.println(camelCaseMe(inputString3)); // Output: TheStealthWarrior
    }



    public static String camelCaseMe(String string) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '-' || currentChar == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
        }

        return result.toString();
    }
}