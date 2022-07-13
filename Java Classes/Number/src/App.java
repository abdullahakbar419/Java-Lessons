package Number.src;

public class App {
    public static void main(String[] args) throws Exception {

        // Used Number Class is very useful because can convert to any data types
        NumberApp numberApp = new NumberApp(100, 100.123, "127");

        Integer integerValue = numberApp.getIntegerValue();
        Double doubleValue = numberApp.getDoubleValue();

        Short shortValueInteger = integerValue.shortValue();
        Short shortValueDouble = doubleValue.shortValue();
        Short shortValueString = Short.valueOf(numberApp.getNumber());

        Byte byteValueInteger = integerValue.byteValue();
        Byte byteValueDouble = doubleValue.byteValue();
        Byte byteValueString = Byte.valueOf(numberApp.getNumber());

        Long longValueInteger = integerValue.longValue();
        Long longValueDouble = doubleValue.longValue();
        Long longValueString = Long.valueOf(numberApp.getNumber());

        System.out.println(shortValueInteger);
        System.out.println(shortValueDouble);
        System.out.println(shortValueString);
        System.out.println(byteValueInteger);
        System.out.println(byteValueDouble);
        System.out.println(byteValueString);
        System.out.println(longValueInteger);
        System.out.println(longValueDouble);
        System.out.println(longValueString);
    }
}
