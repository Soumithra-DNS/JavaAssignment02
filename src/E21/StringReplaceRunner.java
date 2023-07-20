package E21;

import E21.StringReplace;

public class StringReplaceRunner {

    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        String stateName = stringReplace.replaceI();
        int lenght = stringReplace.calculateLenght(stateName);
        System.out.println(lenght);
        stringReplace.stringReplace(stateName);
        stateName= stringReplace.replaceSS();
        lenght = stringReplace.calculateLenght(stateName);
        System.out.println(lenght);
    }
}
