import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class restaurantStaffForm extends JFrame {
    private JScrollBar scrollBar1;
    private JTable table1;
    private JPanel JPanel3;
    private ArrayList<restaurantStaff> rlist;
    private DefaultTableModel tblModel;
    private final String TableColName[] =
            { "Id", "name", "surname" };

    restaurantStaff_DAL rdal;
    public restaurantStaffForm()
    {
        setContentPane(JPanel3);
        setTitle("My GUI Form");
        setMinimumSize(new Dimension(400,300) );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        rdal = new restaurantStaff_DAL();
        rlist = rdal.GetrestaurantStaff();

        tblModel = (DefaultTableModel) table1.getModel();
        tblModel.setColumnIdentifiers(TableColName);

        UpdateTable();
    }

    private void UpdateTable()
    {

        while (tblModel.getRowCount()>0)
            tblModel.removeRow(0);

        for (restaurantStaff k: rlist) {
            String data[] = {String.valueOf(k.ID), k.name, k.surname};
            tblModel.addRow(data);
        }
    }


    public static void main(String[] args) {
        new restaurantStaffForm();
    }
}
