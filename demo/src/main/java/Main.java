import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FruitFactory fruitFactory = new FruitFactory();
        List<Fruit> fruits = new ArrayList<Fruit>();
        System.out.println("1 add Fruits ");
        System.out.println("2 print Fruits");
        System.out.println("3 see Fruits with one color");
        System.out.println("3 see Fruits with one color");
        int sc = scanner.nextInt();
        do {
            switch (sc) {
                case 1: {

                    System.out.println("1 add Fruit");
                    System.out.println("2 add Citrus");
                    int sn = scanner.nextInt();
                    switch (sn) {
                        case 1: {
                            Fruit fruit = new Fruit();
                            fruit.input();
                            fruits.add(fruit);
                            break;
                        }
                        case 2: {
                            Citrus citrus = new Citrus();
                            citrus.input();
                            fruits.add(citrus);
                            break;
                        }
                        default:
                            System.out.println("Exit");
                            break;
                        }

break;             }


                case 2: {
                    for (Fruit f : fruits) {
                        System.out.println("All fruits in list:");
                        f.print();
                        break;
                    }
                    ;
                }
                case 3: {
                    System.out.println("Enter color which you want to see:");
                    String color = scanner.next();
                    List<Fruit> listFruitsByColor = fruitFactory.getFruitsByColor(fruits, color);
                    for (Fruit f : listFruitsByColor) {
                        f.print();
                        break;
                    }

                }


            }
        }
        while (true);


    }


}
