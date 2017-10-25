package Project;

/**
  Created by s426225 on 10/25/17.
 */
public class Parsing {
    String exam;
    public boolean check(String query) {
        query = query.toUpperCase() + ' ';
        int i;
        int j = query.length();
        int x = 0;
        exam = "";
        for (i = 0; i < j; i++) {
            if (query.charAt(i) == ' ') {
                //System.out.println(query.substring(x, i));
                if (query.substring(x, i).equals("SELECT")) {
                    exam += 1;
                } else if (query.substring(x, i).equals("FROM")) {
                    exam += 2;
                } else if (query.substring(x, i).equals("WHERE")) {
                    exam += 3;
                } else if (query.substring(x, i).equals("ORDER")) {
                    exam += 4;
                } else if ((query.substring(x, i).equals("BY")) || (query.substring(x, i).equals("BY;"))) {
                    exam += 5;
                }
                x = i + 1;
            }
        }
        return ((exam.equals("12")) || (exam.equals("123")) || (exam.equals("1245")) ||(exam.equals("12345")));
    }
}
