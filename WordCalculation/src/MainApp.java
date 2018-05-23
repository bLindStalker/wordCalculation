import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.String.format;

public class MainApp {

    public static void main(String[] args) {

        UserInputData userInputData = ConsoleReader.readData();
        Path path = Paths.get(userInputData.getFullPathToFile());

        try {
            long count = Files.lines(path)
                    .filter(word -> word.toLowerCase().contains(userInputData.getInputText().toLowerCase()))
                    .count();
            System.out.println("Count of our word is: " + count);
        } catch (IOException e) {
            System.out.println(format("Failed to fetch word count form your file. %n%s", e.toString()));
        }
    }
}
