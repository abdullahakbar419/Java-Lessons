package StringBuilder.src;

public class App {
    public static void main(String[] args) throws Exception {
        StringifyBuilder stringifyBuilder = new StringifyBuilder("Abdullah", "Akbar");

        // using String Builder because is more eficience then use direct string for
        // manipulate strings
        StringBuilder builder = new StringBuilder();
        builder.append(stringifyBuilder.getFirstName() + " " + stringifyBuilder.getLastName());

        String name = builder.toString();

        System.out.println(name);
    }
}
