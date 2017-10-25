package Project;

/**
  Created by s426225 on 10/25/17.
 */
public class Parsing {
    String exam;
    public boolean check(String query) {
        query += ' ';
        int i;
        int j = query.length();
        int x = 0;
        exam = "";
        for (i = 0; i < j; i++) {
            if (query.charAt(i) == ' ') {
                //System.out.println(query.substring(x, i));
                if ((query.substring(x, i).equals("Select")) || (query.substring(x, i).equals("select")) || (query.substring(x, i).equals("SELECT"))) {
                    exam += 1;
                } else if ((query.substring(x, i).equals("From")) || (query.substring(x, i).equals("from")) || (query.substring(x, i).equals("FROM"))) {
                    exam += 2;
                } else if ((query.substring(x, i).equals("Where")) || (query.substring(x, i).equals("where")) || (query.substring(x, i).equals("WHERE"))) {
                    exam += 3;
                } else if ((query.substring(x, i).equals("Order")) || (query.substring(x, i).equals("order")) || (query.substring(x, i).equals("ORDER"))) {
                    exam += 4;
                } else if ((query.substring(x, i).equals("By")) || (query.substring(x, i).equals("by")) || (query.substring(x, i).equals("BY")) || (query.substring(x, i).equals("By;")) || (query.substring(x, i).equals("by;")) || (query.substring(x, i).equals("BY;"))) {
                    exam += 5;
                }
                x = i + 1;
            }
            /*if (exam.length() == 2) {
                if (exam.equals("12")) {
                    return true;
                }
            } else if (exam.length() == 3) {
                if (exam.equals("123")) {
                    return true;
                }
            } else if (exam.length() == 4) {
                if (exam.equals("1245")) {
                    return true;
                }
            } else if (exam.length() == 5) {
                if (exam.equals("12345")) {
                    return true;
                }*/
        }
        if((exam.equals("12")) || (exam.equals("123")) || (exam.equals("1245")) ||(exam.equals("12345")))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
