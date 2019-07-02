import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tools {
    public static void saveFruitInXmlFile(List<Fruit> fruits) throws IOException {
        FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(fruits);
        encoder.close();
        fos.close();
    }

    public static List<Fruit> fruitsByColor(List<Fruit> fruits, String color) {

        List<Fruit> newFruitsList = new ArrayList();

        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color)) {
                newFruitsList.add(fruit);
            }
        }
        return newFruitsList;
    }
    public void Deserialization() {
        try {
            XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruits.xml"));
            ArrayList<Fruit> arrayList = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(arrayList.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}



