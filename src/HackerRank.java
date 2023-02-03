import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank {
    public static void main(String[] args) {
        String line = "";
        ArrayList<String> intList = new ArrayList<String>();
        while (!line.equalsIgnoreCase("done")) {
            System.out.print("Enter grid: ");
            Scanner s = new Scanner(System.in);
            line = s.nextLine();
            if (!line.equalsIgnoreCase("done")) {
                intList.add(line);
            }
        }
        String search = "";
        while (!search.equalsIgnoreCase("done")) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter query: ");
            search = s.nextLine();
            int x = Integer.parseInt(search.substring(0, search.indexOf(" ")));
            int y = Integer.parseInt(search.substring(search.indexOf(" ") + 1));
            if (y > intList.size()) {
                System.out.println("ERROR");
            } else {
                String temp = intList.get(y-1);
                System.out.println(temp);
                int counter = 1;
                while (counter != x || temp.indexOf(" ") == -1) {
                    temp = temp.substring(temp.indexOf(" "));
                    counter++;
                }
                temp += " ";
                System.out.println(temp.substring(0, temp.indexOf(" ")));
            }
        }

        /*
        while (firstLine.indexOf(" ") != -1) {
            intList1.add(Integer.parseInt(firstLine.substring(0, firstLine.indexOf(" "))));
            firstLine = firstLine.substring(firstLine.indexOf(" ") +1);
        }
         */

    }
    /*
    Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
Explanation

The diagram below explains the queries:
     */
}
