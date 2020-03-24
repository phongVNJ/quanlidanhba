import java.io.*;

public class Showlist {
    public static void Menu() throws IOException {
        File infile = new File("contact.txt");
        FileReader fileReader = new FileReader(infile);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        if ((line = reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();

    }
}
