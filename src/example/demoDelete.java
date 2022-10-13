public class demoDelete {
    public static void main(String[] args) {
        insertTest();
    }

    public  static  void insertTest(){
        String sqlInsert1 = "insert into testTable values ('Innis1', 99, 'USA')";
        String sqlInsert2 = "insert into testTable (name,age,address) values ('Innis2', 999, 'CHina1')";
        String sqlInsert3 = "insert into testTable (name, address) values ('Innis3', 'ChinaIn3')";
        String sqlInsert4 = "insert into testTable (name, address) values ('Innis4', 'ChinaIn4'), ('Innis5', 'ChinaIn5')";
        String sqlInsert5 = "insert into testTable (age, address) values (70, 'ChinaIn4'), (80, 'ChinaIn5')";

        SQL.excute(sqlInsert1);
        System.out.println("done");
        System.out.println("===================================");
        SQL.excute(sqlInsert2);
        System.out.println("===================================");
         SQL.excute(sqlInsert3);
        System.out.println("===================================");
        SQL.excute(sqlInsert5);
    }
}
