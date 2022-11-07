import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {
    public static void main(String[] args) {
        //selectTest();
        //functionTest();
        distinct();
    }

    public static  void selectTest(){
        String sqlSelect = "select avg(age) from datetime where name = 'Innis'";
        ArrayList<String[]> result = SQL.query(sqlSelect);
        for (String[] line:result
        ) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void  functionTest(){
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"1"});
        data.add(new String[]{"10"});
        data.add(new String[]{"16"});
        data.add(new String[]{"100"});
        
        System.out.println(sum(data));
    }

    public static double max(ArrayList<String[]> data){
        double max = Double.parseDouble(data.get(0)[0]);
        for (String[] line:data
        ) {
            double value = Double.parseDouble(line[0]);
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public static double min(ArrayList<String[]> data){
        double min = Double.parseDouble(data.get(0)[0]);
        for (String[] line:data
        ) {
            double value = Double.parseDouble(line[0]);
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static double avg(ArrayList<String[]> data){
        double sum = 0;
        for (String[] line:data
        ) {
            sum += Double.parseDouble(line[0]);
        }
        return sum/data.size();
    }

    public static double sum(ArrayList<String[]> data){
        double sum = 0;
        for (String[] line:data
        ) {
            sum += Double.parseDouble(line[0]);
        }
        return sum;
    }

    public static double count(ArrayList<String[]> data){
        return data.size();
    }

    public static void distinct(){
        String sql = "select distinct(name) from datetime where address = 'China'";
        System.out.println(Parser.isDistinct(sql));
    }
}
