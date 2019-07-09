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
            try {
                int sc = scanner.nextInt();

                switch (sc) {
                    case 1: {
                        System.out.println("1 - add Fruit");
                        System.out.println("2 - add Citrus");
                        System.out.println("0 - exit");
                        int sn = scanner.nextInt();
                        switch (sn) {
                            //add fruit or citrus
                            case 1: {
                                //add fruit
                                Fruit fruit = new Fruit();
                                fruit.input();
                                fruits.add(fruit);
                                break;
                            }
                            case 2: {
                                //add citrus
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
                        //show all fruits in list
                        for (Fruit f : fruits) {
                            System.out.println("All fruits in list:");
                            f.print();
                        }
                        break;
                    }
                    case 3: {
                        //show fruits with entered color
                        System.out.println("Enter color: ");
                        String color = scanner.next();
                        List<Fruit> listFruitsByColor = Tools.fruitsByColor(fruits, color);
                        for (Fruit fr : listFruitsByColor) {
                            fr.print();
                        }
                        break;
                    }
                    case 4: {
                        //sort fruits by name
                        System.out.println("Sort by name");
                        Collections.sort(fruits, new SortFruit());
                        System.out.println(fruits);
                    }
                    case 5: {
                        //serialization
                        Tools.saveFruitInXmlFile(fruits);
                        System.out.println("Fruits save in .xml");
                        break;
                    }
                    case 6: {
                        //deserialization
                        Tools.deserialization();
                        break;
                    }
                    case 7: {
                        //serialization sort
                        Tools.SortFruit(fruits);
                        Tools.saveSortFruitInXmlFile(fruits, "fruitsSort.xml");
                        break;
                    }
                    case 8: {
                        //deserialization sort
                        Tools.SortFruit(fruits);
                        Tools.deserializationSort("fruitsSort.xml");
                        break;
                    }
                    default: {
                        System.out.println("You enter incorrect number");
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


