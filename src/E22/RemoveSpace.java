package E22;
public class RemoveSpace {
    private String name;
    public RemoveSpace(){
        name = "   I Am SHANTO     ";
    }
    public String removeAllSpaceBytrim(){
        return name.trim();
    }

    public String removeAllSpaceByReplaceMethod(){
        return name.replace(" ","");
    }
}
