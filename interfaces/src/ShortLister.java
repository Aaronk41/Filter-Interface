import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getPath();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                StringBuilder content = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();

                String[] words = content.toString().split("\\s+");
                Filter shortWordFilter = new ShortWordFilter();
                List<String> shortWords = CollectUtils.collectAll(words, shortWordFilter);

                for (String word : shortWords) {
                    System.out.println(word);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
