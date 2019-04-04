package Strategy_design_pattern;

import java.util.Scanner;

public class Number implements Strategy {
    private char type;

    public boolean validate(String s) {
        boolean valid = true;
        int i;
        char[] z = s.toCharArray();
        switch (type) {
            case 'p': {
                for (i = 0; i < z.length; i++)
                    if (!isdigit(z[i])) {
                        valid = false;
                        break;
                    }
                break;
            }
            case 'm': {
                for (i = 0; i < z.length; i++) {
                    if (!isminus(z[0])) {
                        valid = false;
                        break;
                    }
                    if (i > 0 && !isdigit(z[i])) {
                        valid = false;
                        break;
                    }
                    break;
                }
            }

        }
        return valid;
    }

    public void setValidationType(char f) {
        type = f;
    }

    public static void main(String[] arg){
        Strategy dialog;
        char answer;

        System.out.println("Choose (n)umber or (w)ord");
        Scanner s = new Scanner(System.in);
        answer = s.next().charAt(0);

        switch (answer){
            case 'n':
                dialog = new Number();
                System.out.println("Input type [ (p)lus number, (m)inus number, e(x)it ]:");
                char ans = s.next().charAt(0);
                while(ans!='x')
                {
                    dialog.setValidationType(ans);
                    dialog.interact();
                    System.out.println("Input type [ (p)lus number, (m)inus number, e(x)it ]:");
                    ans = s.next().charAt(0);
                }
                break;
            case 'w':
                dialog = new Words();
                System.out.println("Input type [ (u)pper word, (l)ower word, e(x)it ]:");
                char wns = s.next().charAt(0);
                while(wns!='x')
                {
                    dialog.setValidationType(wns);
                    dialog.interact();
                    System.out.println("Input type [ (u)pper word, (l)ower word, e(x)it ]:");
                    wns = s.next().charAt(0);
                }
                break;

        }
    }
}
