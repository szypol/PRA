package Project;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 Created by s426225 on 10/23/17.
 */
public class SQL_Query_List_Creator  {
    public static void main(String[] args) throws FileNotFoundException, SchedulerException  {
        Parsing pars = new Parsing();
        Saving savee  = new Saving();
        Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
        Scheduler tc = StdSchedulerFactory.getDefaultScheduler();
        JobDetail job = JobBuilder.newJob(Saving.class).build();
        JobDetail job2 = JobBuilder.newJob(Timechecker.class).build();
        Trigger save = TriggerBuilder.newTrigger().withIdentity("CronTrigger").withSchedule(CronScheduleBuilder.cronSchedule("0/30 * * ? * *")).build();
        Trigger time = TriggerBuilder.newTrigger().withIdentity("CTrigger").withSchedule(CronScheduleBuilder.cronSchedule("0 * * ? * *")).build();
        //Timechecker time = new Timechecker();

        Scanner inputex = new Scanner(System.in);
        Scanner inputqu = new Scanner(System.in);
        Scanner inputco = new Scanner(System.in);
        String exercise;
        String query;
        String control = "C";
        System.out.println("Welcome in SQL_Query_List_Creator");
        //time.execute();
        sc.scheduleJob(job, save);
        tc.scheduleJob(job2, time);
        sc.start();
        tc.start();
        while (control.equals("C"))
        {
            System.out.println("Waiting for exercise number");
            exercise = inputex.nextLine();
            System.out.println("Waiting for query");
            query = inputqu.nextLine();
            if (pars.check(query)) {
                System.out.println("Correct");
                savee.add(exercise, query);
            } else {
                System.out.println("Incorrect");
            }
            System.out.println("Press 'c' to continue or any key to end");
            control = inputco.nextLine();
            control = control.toUpperCase();
        }
        //savee.execute();
        tc.shutdown();
        sc.shutdown();
        //savee.closefile();
    }
}
