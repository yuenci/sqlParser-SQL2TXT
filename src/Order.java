import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        //selectTest();
        //System.out.println(Parser.isOrderSelect("select * from datetime order by age desc"));
        //orderTest();
        order();
    }

    public static  void selectTest(){
        String sqlSelect = "select * from datetime where address = 'China' order by age desc";
        ArrayList<String[]> result = SQL.query(sqlSelect);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void orderTest(){
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"a1","b1","1"});
        data.add(new String[]{"a2","b2","2"});
        data.add(new String[]{"a3","b3","3"});
        data.add(new String[]{"a4","b4","4"});
        data.add(new String[]{"a5","b5","5"});

        //ArrayList<String[]> res =  Parser.orderASC(data,2);
        ArrayList<String[]> res =  Parser.orderDESC(data,2);

        // print res
        for (String[] line:res
        ) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void order(){
        String sqlSelect = "select * from datetime where address = 'China' order by birthday asc";
        ArrayList<String[]> result = SQL.query(sqlSelect);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }
}
