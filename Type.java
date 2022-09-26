public class Type {
    public static Operate check(String sql) {
        String[] sqlKeyWordsList = sql.split(",");

        // Determine sql type and determin if schema exist
        if (sqlKeyWordsList[0].equalsIgnoreCase("INSERT")
                && sqlKeyWordsList[1].equalsIgnoreCase("INTO")
                && sqlKeyWordsList[3].equalsIgnoreCase("VALUES")) {
            return new sqlInsert();
        } else if (sqlKeyWordsList[0].equalsIgnoreCase("DELETE")
                && sqlKeyWordsList[1].equalsIgnoreCase("FROM")
                && sqlKeyWordsList[3].equalsIgnoreCase("WHERE")) {
            return new sqlDelete();
        } else if (sqlKeyWordsList[0].equalsIgnoreCase("SELECT")
                && sqlKeyWordsList[2].equalsIgnoreCase("FROM")
                && sqlKeyWordsList[4].equalsIgnoreCase("WHERE")) {
            return new sqlSelect();
        } else if (sqlKeyWordsList[0].equalsIgnoreCase("UPDATE")
                && sqlKeyWordsList[2].equalsIgnoreCase("SET")) {
            return new sqlUpdate();
        } else {
            throw new IllegalArgumentException(
                    "Sql statement has mistakes, just have 'select','update','delete','insert' four types");
        }
    }
}
