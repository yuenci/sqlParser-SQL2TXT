public class demoUpdate {
    public static void main(String[] args) {
        updateTest();
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
