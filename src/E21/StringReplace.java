package E21;

public class StringReplace {
    private String stateName;

    public StringReplace(){
        stateName = "Mississippi";
    }

    public void stringReplace(String stateName){
       this.stateName = stateName;
    }
    public String replaceI(){
        String newStateReplace = stateName.replace("i","ii");
        return newStateReplace;
    }

    public int calculateLenght(String name){
        int length = name.length();
        return length;
    }

    public String replaceSS(){
        String newStateReplace = stateName.replace("ss" , "s");
        return newStateReplace;
    }

}
