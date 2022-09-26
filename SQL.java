import java.util.ArrayList;

public class SQL {
    public static ArrayList<String> query(String sql) {
        Operate operate = Type.check(sql);
        return operate.query(sql);
    }

    public static boolean excute(String sql) {
        Operate operate = Type.check(sql);
        return operate.excute(sql);
    }
}
