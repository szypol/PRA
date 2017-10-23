package Project;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
  Created by s426225 on 10/23/17.
*/
public class SQL_Query_List_Creator {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inputex = new Scanner(System.in);
        Scanner inputqu = new Scanner(System.in);
        Scanner inputco = new Scanner(System.in);
        PrintWriter answers = new PrintWriter("answers.txt");
        int exercise;
        String query;
        String control = "c";
        String exam;
        System.out.println("Welcome in SQL_Query_List_Creator");
        while ((control.equals("c")) || (control.equals("C")))
        {
            exercise = inputex.nextInt();
            query = inputqu.nextLine();
            query += ' ';
            int i;
            int j = query.length();
            int x = 0;
            exam = "";
            for(i=0;i<j;i++)
            {
                if(query.charAt(i) == ' ')
                {
                    System.out.println(query.substring(x,i));
                    //words.add(query.substring(x,i));
                    if ((query.substring(x,i).equals("Select")) || (query.substring(x,i).equals("select")) || (query.substring(x,i).equals("SELECT")))
                    {
                        exam += 1;
                    }
                    else if ((query.substring(x,i).equals("From")) || (query.substring(x,i).equals("from")) || (query.substring(x,i).equals("FROM")))
                    {
                        exam += 2;
                    }
                    else if ((query.substring(x,i).equals("Where")) || (query.substring(x,i).equals("where")) || (query.substring(x,i).equals("WHERE")))
                    {
                        exam += 3;
                    }
                    else if ((query.substring(x,i).equals("Order")) || (query.substring(x,i).equals("order")) || (query.substring(x,i).equals("ORDER")))
                    {
                        exam += 4;
                    }
                    else if ((query.substring(x,i).equals("By")) || (query.substring(x,i).equals("by")) || (query.substring(x,i).equals("BY")) || (query.substring(x,i).equals("By;")) || (query.substring(x,i).equals("by;")) || (query.substring(x,i).equals("BY;")))
                    {
                        exam += 5;
                    }
                    x=i+1;
                }
                if(exam.length()==2)
                {
                    if(exam.equals("12"))
                    {
                        answers.println("Zadanie " + exercise);
                        answers.println(query);
                    }
                }
                else if(exam.length()==3)
                {
                    if(exam.equals("123"))
                    {
                        answers.println("Zadanie " + exercise);
                        answers.println(query);
                    }
                }
                else if(exam.length()==4)
                {
                    if(exam.equals("1245"))
                    {
                        answers.println("Zadanie " + exercise);
                        answers.println(query);
                    }
                }
                else if(exam.length()==5)
                {
                    if(exam.equals("12345"))
                    {
                        answers.println("Zadanie " + exercise);
                        answers.println(query);
                    }
                }
            }
            System.out.println(exercise + "\n" + exam);
            System.out.println("Press 'c' to continue or any key to end");
            control = inputco.nextLine();

        }
        answers.close();
    }
}
