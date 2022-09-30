import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static String getTableName(String type, String sql) {
        if (type == "DELETE") {
            return sql.split(" ")[2];// done
        } else if (type == "INSERT") {
            return sql.split(" ")[2];// done
        } else if (type == "SELECT") {
            int index = Arrays.binarySearch(sql.split(" "), "from") + 1;
            return sql.split(" ")[index];// done
            // select * from test
            // select app,apssa,sasa from test
        } else if (type == "UPDATE") {
            return sql.split(" ")[1];// done
        } else {
            return "ERROR";
        }
    }

    public static Map<String, String> getSQLCond() {
        Map<String, String > myMap  = new HashMap<String, String>
        myMap.put("a", "b");  
    	myMap.put("c", "d");
        return myMap; 
    }
}
