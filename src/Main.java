import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    private static String SOURCE_PATH = "src/source.txt";
    private static String TARGET_PATH = "src/target.txt";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> reader = ReadAndWrite.readFile(SOURCE_PATH);
        System.out.println(reader.size());
        ReadAndWrite.writeFile(TARGET_PATH, false, reader);

    }

}