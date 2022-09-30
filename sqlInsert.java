public class sqlInsert extends Operate {
    private String SQLType;

    public sqlInsert(String type) {
        this.SQLType = type;
    }

    public boolean excute(String sql) {
        return true;
    }
}
