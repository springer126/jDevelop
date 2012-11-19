package postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         try
         {
            Class.forName( "org.postgresql.Driver" ).newInstance();
            String url = "jdbc:postgresql://localhost:5432/wenhui" ;
            Connection con = DriverManager.getConnection(url, "postgres" , "admin" );
            if(con!=null){
            	  System.out.println("连接成功");
            }
          
            Statement st = con.createStatement();
            String sql = " select * from user " ;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getString(2));
               //System.out.println(rs.getInt(columnIndex));
            	//System.out.println(rs.getInt("2"));
            }
            rs.close();
            st.close();
            con.close();
            

        }
         catch (Exception ee)
         {
           ee.printStackTrace();
        }         


	}

}
