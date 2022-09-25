public class typeCheck {
    public static void check(String sql) {
        String[] sqlKeyWordsList = sql.split(",");

        // Determine sql type and determin if schema exist
        if (sqlKeyWordsList[0].equalsIgnoreCase("INSERT")
                && sqlKeyWordsList[1].equalsIgnoreCase("INTO")
                && sqlKeyWordsList[3].equalsIgnoreCase("VALUES"))
        {
            System.out.println("Insert");
        }
        else if (sqlKeyWordsList[0].equalsIgnoreCase("DELETE")
                && sqlKeyWordsList[1].equalsIgnoreCase("FROM")
                && sqlKeyWordsList[3].equalsIgnoreCase("WHERE"))
        {
            System.out.println("DELETE");
        }
        else if (sqlKeyWordsList[0].equalsIgnoreCase("SELECT")
                && sqlKeyWordsList[2].equalsIgnoreCase("FROM")
                && sqlKeyWordsList[4].equalsIgnoreCase("WHERE"))
        {
            System.out.println("SELECT");
        }
        else if (sqlKeyWordsList[0].equalsIgnoreCase("UPDATE")
                && sqlKeyWordsList[2].equalsIgnoreCase("SET"))
        {
            System.out.println("UPDATE");
        }
        else {
            throw new IllegalArgumentException("Sql statement has mistakes, just have 'select','update','delete','insert' four types");
        }
    }
}
