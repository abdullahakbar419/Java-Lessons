package Number.src;

public class NumberApp {
    private Integer integerValue;
    private Double doubleValue;
    private String number;

    public NumberApp(Integer integerValue, Double doubleValue, String number) {
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.number = number;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
