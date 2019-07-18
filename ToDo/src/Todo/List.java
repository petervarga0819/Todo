import javafx.concurrent.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class List {

    static Task taskInstance = new Task();

    public void listAllTasks(){
        List<String> printFromList = readFromFile();
        System.out.println();
        int counter = 0;

        if (printFromList.size() == 0){
            System.out.println("No todos for today! :)");
        } else {
            for (String s : printFromList ) {
                counter++;
                System.out.println(counter + " - " + s);
            }
        }
    }

    private int size() {
        return 0;
    }

    public List readFromFile(){

        String inputFile = "todo.txt";
        String fileLines = "";
        List<String> lineContainer = new ArrayList<>();
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(inputFile));
            while ((fileLines = fileReader.readLine()) != null) {
                ((ArrayList) lineContainer).add(fileLines);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lineContainer;
    }

}