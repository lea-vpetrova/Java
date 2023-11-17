import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        //creating input and output files
        File inputFile = new File("firstEx.txt");
        File outputFile = new File("outputFile.txt");

        //searchingWord and with what to be replaced
        String searchText = "old";
        String replaceText = "new";


        try {
            //checking if file is created successfully
            /*if (inputFile.createNewFile()) {
                System.out.println("File created: " + inputFile.getName());
            } else {
                System.out.println("File already exists.");
            }*/
            // reading from input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // creating output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            //searching by regex
            String regex = "\\b" + Pattern.quote(searchText) + "\\b";
            Pattern pattern = Pattern.compile(regex);

            String line;
            while ((line = reader.readLine()) != null) {
                //replacing
                Matcher matcher = pattern.matcher(line);
                line = matcher.replaceAll(replaceText);
                //writing int the output file
                writer.write(line);
                writer.newLine();
            }

            //closing everything
            reader.close();
            writer.close();

            System.out.println("Successfully changed");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}