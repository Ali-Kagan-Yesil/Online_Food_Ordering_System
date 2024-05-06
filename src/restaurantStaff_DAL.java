import java.sql.*;
import java.util.ArrayList;

public class restaurantStaff_DAL {
    String user = "admin", pass = "123";
    String conUrl = "jdbc:mysql://localhost/20210305060";

    public void Connection() {
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
        String cmd = "SELECT `ID`, `name`, `surname` FROM `restaurant staff`";

        try (Connection conn = DriverManager.getConnection(conUrl, user, pass);)
        {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(cmd);

            int say=0;
            int ID;
            String name, surname;

            System.out.println("result set ready");
            while(res.next()) {
                ID = res.getInt(1);
                name = res.getString(2);
                surname = res.getString(3);
                System.out.printf("Id= %d, Name= %s Surname=%s%n", ID, name, surname);
                say++;
            }
            System.out.println("End of List.");
            res.close();

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<restaurantStaff> GetrestaurantStaff()
    {
        ArrayList<restaurantStaff> rlist = new ArrayList<>();
        String cmd = "SELECT `ID`, `name`, `surname` FROM `restaurant staff`";
        restaurantStaff r;

        try (Connection conn = DriverManager.getConnection(conUrl, user, pass);)
        {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(cmd);

            System.out.println("result set ready");
            while(res.next()) {
                r=new restaurantStaff();
                r.ID = res.getInt(1);
                r.name = res.getString(2);
                r.surname = res.getString(3);
                rlist.add(r);
            }
            System.out.println("End of List.");
            res.close();

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
        return rlist;
    }


}

