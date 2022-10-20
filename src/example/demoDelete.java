public class demoDelete {
    public static void main(String[] args) {
        deleteTest();
    }

    public  static  void deleteTest(){
        String sqlDelete1 = "delete from testTable where name = 'Innis2'";
        String sqlDeleteAdd1 = "delete from testTable where name = 'Innis2' and age = 999";
        String sqlDeleteAdd2 = "delete from testTable where name = 'Innis3' and age = 18 and address = 'ChinaIn3'";
        String sqlDeleteOr1 = "delete from testTable where address = 'China' or name = 'Innis3' ";
        String sqlDeleteOr2 = "delete from testTable where address = 'China' or name = 'Innis3' or age = 27";

        SQL.excute(sqlDelete1);
        System.out.println("done");
    }
}
