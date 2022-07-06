package String.src;

public class App {
    public static void main(String[] args) throws Exception {
        Stringify stringify = new Stringify("Abdullah Akbar");

        String nameToLowerCase = stringify.getName().toLowerCase();
        String nameToUpperCase = stringify.getName().toUpperCase();
        String nameRepeat = stringify.getName().repeat(2);
        String nameConcat = stringify.getName().concat(" with my crush");
        String[] nameSplit = stringify.getName().split(" ");
        Integer nameLength = stringify.getName().length();
        Boolean nameStartWith = stringify.getName().startsWith("Ab");
        Boolean nameEndWith = stringify.getName().endsWith("ar");

        System.out.println(stringify.getName());
        System.out.println(nameToLowerCase);
        System.out.println(nameToUpperCase);
        System.out.println(nameRepeat);
        System.out.println(nameConcat);
        for (String name : nameSplit) {
            System.out.println(name);
        }
        System.out.println(nameLength);
        System.out.println(nameStartWith);
        System.out.println(nameEndWith);

    }
}
