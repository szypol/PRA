package Project;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
  Created by s426225 on 10/25/17.
 */
public class saveing implements Job {
    public saveing() throws FileNotFoundException {}
    //PrintWriter answers = new PrintWriter("odp.txt");
   protected ArrayList<String> querybase = new ArrayList();
    /*public void save() {
        for(int i=0;i<querybase.size();i+=2)
        {
            PrintWriter answers = new PrintWriter("odp.txt");
            answers.println("Zadanie " + querybase.get(i));
            answers.println(querybase.get(i+1));
            answers.close();
        }
    }*/
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

            try
            {
                PrintWriter answers = new PrintWriter("odp.txt");
                for(int i=0;i<querybase.size();i+=2) {
                    answers.println("Zadanie " + querybase.get(i));
                    answers.println(querybase.get(i + 1));
                }
                answers.close();
            }
            catch (FileNotFoundException cos){
                cos.printStackTrace();
            }
    }
    //public void closefile(){answers.close();}
    protected void add(String exercise,String query){
        if(querybase.isEmpty())
        {
            querybase.add(exercise);
            querybase.add(query);
        }
        else
        {
            for(int i=0;i<querybase.size();i+=2)
            {
                int q = Integer.parseInt(querybase.get(i));
                int e = Integer.parseInt(exercise);
                System.out.println("q: " + q);
                System.out.println("e: " + e);
                System.out.println("i: " + i);
                if(q==e)
                {
                    querybase.remove(i+1);
                    querybase.add(i+1,query);
                    i=querybase.size();
                }
                else if(q>e)
                {
                    if(i-2<0)
                    {
                        querybase.add(0,exercise);
                        querybase.add(1,query);
                        i=querybase.size();
                    }
                    else
                    {
                        int x=Integer.parseInt(querybase.get(i-2));
                        if(x<e)
                        {
                        querybase.add(i,exercise);
                        querybase.add(i+1,query);
                        i=querybase.size();
                        }
                    }
                }
                else if(q<e)
                {
                    if(i+2>=querybase.size())
                    {
                        querybase.add(exercise);
                        querybase.add(query);
                        i=querybase.size();
                    }
                    else
                    {
                        int x=Integer.parseInt(querybase.get(i+2));
                        if(x>e)
                        {
                        querybase.add(i+2,exercise);
                        querybase.add(i+3,query);
                        i=querybase.size();
                        }
                    }
                }
            }
        }
    }
}
