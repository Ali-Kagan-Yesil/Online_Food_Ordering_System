import java.sql.*;
import java.util.ArrayList;

public class customer_DAL {
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

    public void ListToConsole() {
        String cmd = "SELECT `ID`, `Name`, `Surname`, `Adress` FROM `customer`";

        try (Connection conn = DriverManager.getConnection(conUrl, user, pass);) {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(cmd);

            int say = 0;
            int ID;
            String Name, Surname, Adress;

            System.out.println("result set ready");
            while (res.next()) {
                ID = res.getInt(1);
                Name = res.getString(2);
                Surname = res.getString(3);
                Adress = res.getString(4);
                System.out.printf("Id= %d, Name= %s Surname= %s Adress= %s%n", ID, Name, Surname, Adress);
                say++;
            }
            System.out.println("End of List.");
            res.close();

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }

        public ArrayList<customer> Getcustomerlist()
        {
            ArrayList<customer> clist = new ArrayList<>();
            String command = "SELECT `ID`, `Name`, `Surname`, `Adress` FROM `customer`";
            customer c;

            try (Connection conn = DriverManager.getConnection(conUrl, user, pass);)
            {
                Statement statement = conn.createStatement();
                ResultSet res = statement.executeQuery(command);

                System.out.println("result set ready");
                while (res.next()) {
                    c = new customer();
                    c.ID = res.getInt(1);
                    c.Name = res.getString(2);
                    c.Surname = res.getString(3);
                    c.Adress = res.getString(4);
                    clist.add(c);
                }
                System.out.println("End of List.");
                res.close();

            } catch (
                    SQLException e) {
                System.out.println(e.getMessage());
            }
            return clist;
        }
    }

