package Math.src;

public class App {
    public static void main(String[] args) throws Exception {
        MathApp mathApp = new MathApp(2, 10);

        Double sin = Math.sin(mathApp.getAngka2());

        Double cos = Math.cosh(mathApp.getAngka2());

        int max = Math.max(mathApp.getAngka1(), mathApp.getAngka2());

        int min = Math.min(mathApp.getAngka1(), mathApp.getAngka2());

        Double pow = Math.pow(mathApp.getAngka1(), mathApp.getAngka2());

        Double sqrt = Math.sqrt(mathApp.getAngka2());

        Double log10 = Math.log10(mathApp.getAngka1());

        System.out.println(sin);
        System.out.println(cos);
        System.out.println(max);
        System.out.println(min);
        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(log10);
    }
}
