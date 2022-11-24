import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Filex.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                // Create output file
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 500) + 1));
                output.print(" ");
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        try(
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }

        Collections.sort(list);

        System.out.print(list.toString());
        System.out.println();
    }
}