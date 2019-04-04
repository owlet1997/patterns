package Prototype_design_pattern;

public class President extends FederalFraudvillian {
    public President(String pp){
        party = pp;
    }

    public void partyLine(){
        System.out.println(party+": speak no evil");
    }
}
