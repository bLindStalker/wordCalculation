import java.util.Scanner;

import static java.lang.String.format;

public class ConsoleReader {

    private static final String USER_INPUT_TEXT = "Please enter word that must be founded at file: ";
    private static final String FILE_PATH_TEXT = format("Please provide full path to your file with file name and extension: " +
            "%n(for example: 'c://someFileName.txt')%n");

    public static UserInputData readData() {
        String inputText;
        String fullPathToFile;

        try (Scanner scanner = new Scanner(System.in)) {
            fullPathToFile = getInputText(scanner, FILE_PATH_TEXT);
            inputText = getInputText(scanner, USER_INPUT_TEXT);

            return new UserInputData(fullPathToFile, inputText);
        }
    }

    private static String getInputText(Scanner scanner, String userText) {
        System.out.print(userText);
        return scanner.nextLine();
    }
}
