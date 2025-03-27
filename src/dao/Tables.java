package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            if (con != null) {
                Statement st = con.createStatement();
//                st.executeUpdate(
//                    "CREATE TABLE IF NOT EXISTS appuser ("
//                    + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "userRole VARCHAR(200), "
//                    + "name VARCHAR(200), "
//                    + "dob VARCHAR(50), "
//                    + "mobilenumber VARCHAR(10), "
//                    + "username VARCHAR(200), "
//                    + "password VARCHAR(50), "
//                    + "address VARCHAR(200))"
//                );
                //    st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,username,password,address) values('Admin','Admin','16-12-1992','9819307129','admin','admin','india')");
                //st.executeUpdate("create table medicine(medicine_pk AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200), companyName varchar(200),quantity bigint,price bigint");
//                  st.executeUpdate(
//                    "CREATE TABLE IF NOT EXISTS medicine ("
//                    + "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "uniqueId VARCHAR(200), "
//                    + "name VARCHAR(200), "
//                    + "companyName VARCHAR(200), "
//                    + "quantity BIGINT, "
//                    + "price BIGINT)"
//                );
                st.executeUpdate(
                        "CREATE TABLE IF NOT EXISTS bill ("
                        + "bill_pk INT AUTO_INCREMENT PRIMARY KEY, "
                        + "billId VARCHAR(200) UNIQUE, "
                        + "billDate VARCHAR(50), "
                        + "totalPaid BIGINT, "
                        + "generated_by VARCHAR(50))" // Renamed from 'generated' to 'generated_by'
                );

                JOptionPane.showMessageDialog(null, "Table Created Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
