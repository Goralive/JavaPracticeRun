package diffrenttask;

public class ChangeSymbols {
    public String replaceSymbols(String entryString) {

        entryString = entryString.replace("##","<");

        System.out.println(entryString);
        return entryString;
    }
}
