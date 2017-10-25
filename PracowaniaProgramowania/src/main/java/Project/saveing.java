package Project;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
  Created by s426225 on 10/25/17.
 */
public class saveing {
    public saveing() throws FileNotFoundException {}
    PrintWriter answers = new PrintWriter("answers.txt");
    public void save(int exercise, String query) {
        answers.println("Zadanie " + exercise);
        answers.println(query);
    }
    public void closefile(){answers.close();}
}
