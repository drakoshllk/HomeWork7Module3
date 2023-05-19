import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("iphone", "11 pro", 50000));
        phones.add(new Phone("samsung", "galaxy", 20000));
        phones.add(new Phone("xiaomi", "12 lite", 18000));
        phones.add(new Phone("iphone", "XS", 23000));
        List<Phone> iphones = phones.stream()
              .filter(phone -> phone.getName().equals("iphone"))
              .toList();
        for (int i = 0; i < iphones.size(); i++) {
            System.out.println(iphones.get(i).getModel());
        }
        System.out.println("-------------");
        phones.stream()
            .sorted()
            .flatMap(phone -> Stream.of(phone.getModel(), phone.getPrice()))
            .forEach(phone -> System.out.println(phone));
    }
}

