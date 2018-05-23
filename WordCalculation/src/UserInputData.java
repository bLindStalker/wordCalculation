public class UserInputData {
    private final String fullPathToFile;
    private final String inputText;

    public UserInputData(String fullPathToFile, String inputText) {
        this.fullPathToFile = fullPathToFile;
        this.inputText = inputText;
    }

    public String getInputText() {
        return inputText;
    }

    public String getFullPathToFile() {
        return fullPathToFile;
    }
}
