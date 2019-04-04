package Strategy_design_pattern;

public class Words implements Strategy {
    private char type;

    public boolean validate(String d) {
        boolean valid = true;
        int i;
        char[] z = d.toCharArray();
        switch (type)
        {
            case 'u': for (i=0; i < z.length; i++)
                if (!isupper(z[i])) {
                    valid = false;
                    break;
                }
                break;
            case 'l': for (i=0; i < z.length; i++)
                if (!islower(z[i])) {
                    valid = false;
                    break;
                }
                break;
        }
        return valid;
    }

    public void setValidationType(char f) {
        type = f;
    }
}
