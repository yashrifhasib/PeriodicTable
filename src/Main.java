import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String FILENAME = "Assets\\Elements.csv";
    public static void main(String[] args) throws Exception {
        File inputFile = new File(FILENAME);
        if (!inputFile.exists())
            System.out.println(FILENAME + " cannot be found.");
        else {
            System.out.println("boo");
            Scanner input = new Scanner(inputFile);

            int lineCount = 0;
            while (input.hasNextLine()) {
                input.nextLine();
                lineCount++;
            }

        }
    }
}
