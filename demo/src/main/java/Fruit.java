import java.io.*;

public class Fruit implements Serializable {
    private String name;
    private String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input() {
        System.out.println("Input fruit name: ");
        name = DemoJava.scanner.next();
        System.out.println("Input fruit color: ");
        color = DemoJava.scanner.next();
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}





