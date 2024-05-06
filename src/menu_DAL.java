import java.sql.*;
import java.util.ArrayList;

public class menu_DAL {
    String user="admin", pass="123";
    String conUrl = "jdbc:mysql://localhost/20210305060";

    public void Connection()
    {
        try {
            Connection conn = DriverManager.getConnection(conUrl, user, pass);
            System.out.println("Connected to MySql server.....");
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ListToConsole()
    {
        String cmd = "SELECT `ID`,`name`,`price` FROM `menu`";

        try (Connection conn = DriverManager.getConnection(conUrl, user, pass);)
        {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(cmd);

            int say=0;
            int ID,price;
            String name;

            System.out.println("result set ready");
            while(res.next()) {
                ID = res.getInt(1);
                name = res.getString(2);
                price = res.getInt(3);
                System.out.printf("Id= %d, Name= %s Price=%d%n", ID, name, price);
                say++;
            }
            System.out.println("End of List.");
            res.close();

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<menu> GetMenu()
    {
        ArrayList<menu> mlist = new ArrayList<>();
        String cmd = "SELECT `ID`,`name`,`price` FROM `menu`";
        menu m;

        try (Connection conn = DriverManager.getConnection(conUrl, user, pass);)
        {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(cmd);

            System.out.println("result set ready");
            while(res.next()) {
                m=new menu();
                m.ID = res.getInt(1);
                m.name = res.getString(2);
                m.price = res.getInt(3);
                mlist.add(m);
            }
            System.out.println("End of List.");
            res.close();

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
        return mlist;
    }


}

