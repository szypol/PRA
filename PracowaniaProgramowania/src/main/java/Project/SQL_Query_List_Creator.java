package Project;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
  Created by s426225 on 10/23/17.
*/
public class SQL_Query_List_Creator {
    public static void main(String[] args) throws FileNotFoundException {
        Parsing pars = new Parsing();
        saveing save  = new saveing();
        Scanner inputex = new Scanner(System.in);
        Scanner inputqu = new Scanner(System.in);
        Scanner inputco = new Scanner(System.in);
        int exercise;
        String query;
        String control = "c";
        System.out.println("Welcome in SQL_Query_List_Creator");
        while ((control.equals("c")) || (control.equals("C")))
        {
            System.out.println("Waiting for exercise number");
            exercise = inputex.nextInt();
            System.out.println("Waiting for query");
            query = inputqu.nextLine();
            if(pars.check(query))
            {
                System.out.println("Correct");
                save.save(exercise,query);
            }
            System.out.println(exercise);
            System.out.println("Press 'c' to continue or any key to end");
            control = inputco.nextLine();
        }
        save.closefile();
    }
}
