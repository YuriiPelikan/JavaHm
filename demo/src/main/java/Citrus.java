import java.util.InputMismatchException;

public class Citrus extends Fruit {
    public int vitamin;

    public Citrus(int vitamin) {
        this.vitamin = vitamin;
    }

    public Citrus(String name, String color, int vitamin) {
        super(name, color);
        this.vitamin = vitamin;
    }

    public Citrus() {
    }

    public int getVitamin() {
        return vitamin;
    }

    public void setVitamin(int vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input vitaminC content: ");
        try {
            vitamin = DemoJava.scanner.nextInt();
            do {
                System.out.println("Enter vitamin >0 ");
                vitamin = DemoJava.scanner.nextInt();
            } while (vitamin < 0);
        } catch (InputMismatchException e) {
            System.err.println("You can't enter letters. Enter only digits");
        }
    }

    @Override
    public void print() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Citrus{" +
                "name='" + getName() +
                ", color='" + getColor() + "vitamin=" + getVitamin();
    }
}