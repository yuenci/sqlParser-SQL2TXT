import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //insertTest();
        //deleteTest();
        //selectTest();
        //updateTest();
        //functionSelectTest();
        orderTest() ;
    }

    public  static  void insertTest(){
//        String sqlInsert = "insert into testTable values ('Innis', 99, 'USA')";
        //String sqlInsert = "insert into date values ('YuEnCi', 23, 'China','1997-08-11-')";
        String sqlInsert = "insert into datetime values ('YuEnCi', 23, 'China','1997-08-11 12:12:12')";
        SQL.excute(sqlInsert);
    }

    public  static  void deleteTest(){
//        String sqlDelete = "delete from testTable where name = 'Innis1'";
        String sqlDelete = "delete from date where name = 'Innis1'";
        SQL.excute(sqlDelete);

    }

    public static  void selectTest(){
//        String sqlSelect = "select name, age from testTable where name = 'Innis'";
//        String sqlSelect = "select * from date where name = 'Innis'";
        String sqlSelect = "select * from datetime where name = 'Innis'";
        ArrayList<String[]> result = SQL.query(sqlSelect);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static  void updateTest(){
//        String sqlUpdate = "update testTable set name = 'Innis_2022', age = 520, address = 'China' where name = 'Innis1'";
        String sqlUpdate = "update date set birthday = '1999-04-16', age = 520, address = 'China' where name = 'Innis'";
        SQL.excute(sqlUpdate);

    }

    public static  void functionSelectTest(){
        String sqlSelect1 = "select max(age) from datetime where address = 'China'";
        String sqlSelect2 = "select min(age) from datetime where address = 'China'";
        String sqlSelect3 = "select count(age) from datetime where address = 'China'";
        String sqlSelect4 = "select avg(age) from datetime where address = 'China'";
        String sqlSelect5 = "select sum(age) from datetime where address = 'China'";

        String[] sqls = {sqlSelect1, sqlSelect2, sqlSelect3, sqlSelect4, sqlSelect5};
        for (String sql:sqls
        ) {
            ArrayList<String[]> result = SQL.query(sql);
            for (String[] line:result
            ) {
                System.out.println(Arrays.toString(line));
            }
        }
    }

    public static void orderTest(){
        String sqlSelect1 = "select * from datetime where address = 'China' order by birthday asc";
        String sqlSelect2 = "select * from datetime where address = 'China' order by birthday desc";
        ArrayList<String[]> result = SQL.query(sqlSelect2);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }







}
