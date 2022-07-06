package StringJoiner.src;

import java.util.StringJoiner;

public class App {
    public static void main(String[] args) throws Exception {

        StringifyJoiner stringifyJoiner = new StringifyJoiner("Abdullah", "Akbar");

        // used String Joiner because is more useful to give condition in delimter,
        // prefix, and suffix
        StringJoiner stringJoiner = new StringJoiner(" ", "{", "}");
        stringJoiner.add(stringifyJoiner.getFirstName()).add(stringifyJoiner.getLastName());

        String fullName = stringJoiner.toString();

        System.out.println(fullName);

    }
}
