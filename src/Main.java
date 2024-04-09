import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        example1();
        example2();
    }

    private static void example2() throws FileNotFoundException {
        String fname = "penguins";
        ArrayList<Penguin> penguins = readPenguinsFromFile(fname);
        System.out.println(penguins);
    }

    private static ArrayList<Penguin> readPenguinsFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Penguin> penguins = new ArrayList<>();
        while (scanner.hasNext()){
            String n = scanner.next();
            double w = scanner.nextDouble();
            String c = scanner.next();
            penguins.add(new Penguin(n,  c, w));
        }
        scanner.close();
        return penguins;
    }

    private static void example1() throws FileNotFoundException {
        String filename = "ab.txt";
        ArrayList<Integer> numbers = readIntegersFromFile(filename);
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

    private static ArrayList<Integer> readIntegersFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            numbers.add(x);
        }
        scanner.close();
        return numbers;
    }
}