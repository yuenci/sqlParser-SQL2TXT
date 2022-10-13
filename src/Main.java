import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        //insertTest();
        //deleteTest();
        //selectTest();
        updateTest();
    }

    public  static  void insertTest(){
        String sqlInsert1 = "insert into testTable values ('Innis1', 99, USA)";
        String sqlInsert2 = "insert into testTable (name,age,address) values ('Innis2', 999, 'CHina1')";
        String sqlInsert3 = "insert into testTable (name, address) values ('Innis3', 'ChinaIn3')";
        String sqlInsert4 = "insert into testTable (name, address) values ('Innis4', 'ChinaIn4'), ('Innis5', 'ChinaIn5')";
        String sqlInsert5 = "insert into testTable (age, address) values (70, 'ChinaIn4'), (80, 'ChinaIn5')";

        // SQL.excute(sqlInsert1);
//        System.out.println("===================================");
        //SQL.excute(sqlInsert2);
//        System.out.println("===================================");
        // SQL.excute(sqlInsert3);
//        System.out.println("===================================");
        //SQL.excute(sqlInsert5);
    }

    public  static  void deleteTest(){
        String sqlDelete1 = "delete from testTable where name = 'Innis1'";
        String sqlDeleteAdd1 = "delete from testTable where name = 'Innis2' and age = 999";
        String sqlDeleteAdd2 = "delete from testTable where name = 'Innis3' and age = 18 and address = 'ChinaIn3'";
        String sqlDeleteOr1 = "delete from testTable where address = 'China' or name = 'Innis3' ";
        String sqlDeleteOr2 = "delete from testTable where address = 'China' or name = 'Innis3' or age = 27";

        SQL.excute(sqlDeleteOr2);
        System.out.println("done");
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

    public static  void updateTest(){
        String sqlUpdate1 = "update testTable set name = 'Innis1-', age = 520, address = 'USA-' where name = 'Innis1'";
        String sqlUpdate2 = "update testTable set name = 'Innis-', age = 996, address = 'USA' where name = 'innis' and age = 23";
        String sqlUpdate3 = "update testTable set address = 'China-'  where name = 'Innis1' or age = 25 or address = 'China'";
        String sqlUpdate4 = "update testTable set address = 'China-'  where name = 'Innis1' or age = 25";
        SQL.excute(sqlUpdate4);
        System.out.println("done");
    }
}
