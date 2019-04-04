package Strategy_design_pattern;

import java.util.Scanner;

public interface Strategy {
    boolean validate(String s);

    default void interact(){
        String answer;
        System.out.print("Prompt: ");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        while (!answer.equals("exit")) {
            if (validate(answer)) System.out.println("Good!");
            else System.out.println("Bad!");
            System.out.print("Prompt: ");
            answer = sc.nextLine();
        }
    }

    void setValidationType(char f);
    default boolean isdigit( char ch ) { return ch >= '0' && ch <= '9'; }
    default boolean isminus( char ch ) { return ch=='-'; }
    default boolean isupper( char ch ) { return ch >= 'A' && ch <= 'Z'; }
    default boolean islower( char ch ) { return ch >= 'a' && ch <= 'z'; }

}
