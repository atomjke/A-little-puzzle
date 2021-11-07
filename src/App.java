import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Open which file: ");

        String fileName = input.nextLine();

        System.out.println();

        File file = new File(fileName);
        
        Scanner inputFile = new Scanner(file);

        String parsedText = inputFile.nextLine();

        input.close();
        inputFile.close();

        for (int i = 2; i < parsedText.length(); i += 3) {
            System.out.print(parsedText.charAt(i));
        }
    }
}