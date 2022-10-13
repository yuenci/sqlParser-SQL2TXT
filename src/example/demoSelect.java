
import java.util.ArrayList;
import java.util.Arrays;

public class demoSelect {
    public static void main(String[] args) {
        selectTest();
    }

    public static  void selectTest(){
        String sqlSelect2 = "select name,age from testTable where name = 'Innis1'";
        String sqlSelect3 = "select name,age from testTable where address = 'China'";
        String sqlSelect4 = "select name,age from testTable where name = 'Innis1' and age = 99";
        String sqlSelect5 = "select name,age from testTable where name = 'Innis1' and age = 99 and address = 'USA'";
        String sqlSelect6 = "select name,age from testTable where name = 'Innis1' or age = 25";
        String sqlSelect7 = "select name,age from testTable where name = 'Innis1' or age = 25 or address = 'China'";

        ArrayList<String[]> result = SQL.query(sqlSelect7);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }
}
