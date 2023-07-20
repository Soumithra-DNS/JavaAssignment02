package E22;
public class RemoveSpaceRunner {
    public static void main(String[] args) {
        E22.RemoveSpace removeSpace = new E22.RemoveSpace();
        String newString = removeSpace.removeAllSpaceBytrim();
        System.out.println(newString);
        newString = removeSpace.removeAllSpaceByReplaceMethod();
        System.out.println(newString);
    }
}
