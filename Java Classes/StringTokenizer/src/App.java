package StringTokenizer.src;

import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        StringifyTokenizer stringifyTokenizer = new StringifyTokenizer("Abdullah", "Akbar");

        String fullname = stringifyTokenizer.getFirstName() + "_" + stringifyTokenizer.getLastName();

        System.out.println(fullname);

        StringTokenizer stringTokenizer = new StringTokenizer(fullname, "_");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
