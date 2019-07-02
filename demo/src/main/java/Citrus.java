import java.util.InputMismatchException;

public class Citrus extends Fruit {
    public int vitamin;

    public Citrus(int vitamin) {
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
        System.out.println("Input vitamin C content: ");
        try {
            vitamin = Main.scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Enter only digits");
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