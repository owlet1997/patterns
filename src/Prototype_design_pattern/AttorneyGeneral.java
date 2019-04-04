package Prototype_design_pattern;

import java.util.Scanner;

public class AttorneyGeneral extends FederalFraudvillian {
    public AttorneyGeneral(String p) {
        party = p;
    }

    public void partyLine(){
        System.out.println(party+": see no evil");
    }

    public static void main(String[] arg) {

        FederalFraudvillian[] moralMisfits = new FederalFraudvillian[10];
        int in, i, total = 0;
        String rep = "Republican";
        String dem = "Democrat";
        System.out.print("President(1) AG(2) MPCP(3) Go(0): ");
        Scanner sc = new Scanner(System.in);
        in = sc.nextInt();

        if (arg[0].equals("DEMOCRAT")) {
            while (in != 0) {
                switch (in) {
                    case 1:
                        moralMisfits[total++] = new President(dem);
                        break;
                    case 2:
                        moralMisfits[total++] = new AttorneyGeneral(dem);
                        break;
                    default:
                        moralMisfits[total++] = new MinorityPartyCongressPerson(dem);
                        break;
                }
                System.out.print("President(1) AG(2) MPCP(3) Go(0): ");
                in = sc.nextInt();
            }
        }

       else
            while (in != 0) {
                switch (in) {
                    case 1:
                        moralMisfits[total++] = new President(rep);
                        break;
                    case 2:
                        moralMisfits[total++] = new AttorneyGeneral(rep);
                        break;
                    default:
                        moralMisfits[total++] = new MinorityPartyCongressPerson(rep);
                        break;
                }
                System.out.print("President(1) AG(2) MPCP(3) Go(0): ");
                in = sc.nextInt();
            }

            for (i = 0; i < total; i++) {
                System.out.print(i + " ");
                moralMisfits[i].partyLine();
            }
        }

}
