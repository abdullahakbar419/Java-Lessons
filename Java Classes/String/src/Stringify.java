package String.src;

public class Stringify {
    public String name;

    public Stringify(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
