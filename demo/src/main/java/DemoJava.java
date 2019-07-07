import java.io.IOException;
import java.util.*;

public class DemoJava {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        do {
            System.out.println("1 - add Fruits ");
            System.out.println("2 - print Fruits");
            System.out.println("3 - show Fruits with certain color");
            System.out.println("4 - sort by name");
            System.out.println("5 - serializable in xml format");
            System.out.println("6 - deserializable in xml format");
            System.out.println("7 - serializable in xml format sort by name");
            System.out.println("8 - deserializable in xml format sort by name");
            System.out.println("0 - exit");
            try {
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
                        fruit.deserialization();
                        break;
                    }
                    case 7: {
                        Tools.saveSortFruitInXmlFile(fruits, "fruitsSort.xml");
                        break;
                    }
                    case 8: {
                        Tools fruit = new Tools();
                        fruit.deserializationSort("fruitsSort.xml");
                        break;
                    }
                    case 0: {
                        System.out.println("exit");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Enter only digits");
                break;
            }

        }

        while (true);
    }
}


