import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        //creating a file
        File filePath = new File("dates.txt");

        //List for saving the dates
        List<String> Dates = new ArrayList<>();


        try {
           /*
            //checking if file is created successfully
           if (filePath.createNewFile()) {
                System.out.println("File created: " + filePath.getName());
            } else {
                System.out.println("File already exists.");
            }*/

            //reading from file
             BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // regex in format  "dd/mm/yyyy"
            String regex = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$";
            Pattern pattern = Pattern.compile(regex);

            String line;
            while ((line = reader.readLine()) != null) {
                //checking isValid
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    Dates.add(line + " - Valid");
                } else {
                    Dates.add(line + " - Invalid");
                }
            }

            //closing the file
            reader.close();

            //output the list of dates
            for (String date : Dates) {
                System.out.println(date);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}