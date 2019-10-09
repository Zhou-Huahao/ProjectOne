package oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class oracletext {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        // 1.注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // 2.创建连接
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl", "dyl", "dyl");
        // 3.操作数据
        // 通过连接对象的createStatement()获取SQL语句对象
        Statement st = con.createStatement();
        // 通过SQL语句对象执行SQL语句
        // executeUpdate方法执行DML
        st.executeUpdate("insert into tbl_category values(seq_category.nextval,'职场能力',sysdate)");
        // 4.释放连接
        // 释放语句对象和连接对象
        st.close();
        con.close();
    }}

