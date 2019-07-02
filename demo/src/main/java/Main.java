import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Fruit("gw", "yellow"));
        fruits.add(new Fruit("hk", ""));
        //fruit.Serialization(fruitsList);
      /*  FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(fruits);
        encoder.close();
        fos.close();

        for (Fruit fruit : fruits
        ) {
            fruit.print();
        }*/
        do {
            System.out.println("1 - add Fruits ");
            System.out.println("2 - print Fruits");
            System.out.println("3 - show Fruits with yellow color");
            System.out.println("4 - sort by name");
            System.out.println("5 - serializable in xml format");
            System.out.println("6 - deserializable in xml format");
            System.out.println("0 - exit");

            int sc = scanner.nextInt();
            switch (sc) {
                case 1: {
                    System.out.println("1 - add Fruit");
                    System.out.println("2 - add Citrus");
                    System.out.println("0 - exit");
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

                        }
                        case 0:
                            System.out.println("Exit");
                            break;
                    }
                    break;
                }
                case 2: {
                    for (Fruit f : fruits) {
                        System.out.println("All fruits in list:");
                        f.print();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter color: ");
                    String color = scanner.next();
                    List<Fruit> listFruitsByColor = Tools.fruitsByColor(fruits, color);
                    for (Fruit f : listFruitsByColor) {
                        f.print();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Sort by name");
                    Collections.sort(fruits, new SortFruit());
                    System.out.println(fruits);
                }
                case 5: {
                    Tools.saveFruitInXmlFile(fruits);
                    System.out.println("Fruits save in .xml file:");
                    break;

                }
                case 6: {
                    Tools fruit = new Tools();
                    fruit.Deserialization();
                    break;
                }
                case 0: {
                    System.out.println("exit");
                    break;
                }
            }
        }
        while (true);
    }
}

