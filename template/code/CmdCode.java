package ${config.java.package.code};

public class CmdCode {
    <%tables.forEach(function(table){%>
    public static final String ${table.upperTableName}_GET = "${table.upperTableName}_GET";    
	public static final String ${table.upperTableName}_POST = "${table.upperTableName}_POST";    
	public static final String ${table.upperTableName}_DEL = "${table.upperTableName}_DEL";    
	public static final String ${table.upperTableName}_LIST = "${table.upperTableName}_LIST";    
	public static final String ${table.upperTableName}_PUT = "${table.upperTableName}_PUT";    
    public static final String ${table.upperTableName}_PATCH = "${table.upperTableName}_PATCH"; 
    <%})%>
}
