package com.company;
import java.sql.*;
import org.dom4j.io.SAXReader;
import org.dom4j.*;
import java.io.File;
import java.util.*;

public class Main {

    public static void add(Connection con,int rollno,String fname,String mname,String Lname,String gender,float mks)
    {
        try {

            PreparedStatement stmt = con.prepareStatement("insert into student values (?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setString(2, fname+" "+mname);
            stmt.setString(3, Lname);
            stmt.setString(4, gender);
            stmt.setFloat(5, mks);
            if(stmt.executeUpdate()>0)
                System.out.println("Student Record Inserted\n");
            else
                System.out.println("Insertion Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        String Firstname=null;
        String Middlename=null;
        String Lastname=null;
        String gender=null;
        int Rollno=0;
        float marks=0;
        Statement st=null;
        Connection con=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/au_session","vishal","vishaL@4493");
            st= con.createStatement();

            File xmlFile=new File("input.txt");
            SAXReader reader =new SAXReader();
            Document doc =reader.read(xmlFile);
            List<Node> node= doc.selectNodes("/class/student");

            for(Node nodex: node)
            {
                Rollno = Integer.parseInt(nodex.valueOf("@rollno"));
                Firstname = nodex.selectSingleNode("name/firstname").getText();
                Middlename = nodex.selectSingleNode("name/middlename").getText();
                Lastname= nodex.selectSingleNode("name/lastname").getText();
                gender= nodex.selectSingleNode("gender").getText();
                marks= Float.parseFloat(nodex.selectSingleNode("marks").getText());
            }

            add(con,Rollno,Firstname,Middlename,Lastname,gender,marks);
            System.out.println("record added");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
