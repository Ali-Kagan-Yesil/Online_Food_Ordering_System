import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class menuForm extends JFrame {
    private JScrollBar scrollBar1;
    private JTable table1;
    private JPanel JPanel1;
    private ArrayList<menu> mlist;
    private DefaultTableModel tblModel;
    private final String TableColName[] =
            { "Id", "Name", "Price" };

    menu_DAL mdal;
    public menuForm()
    {
        setContentPane(JPanel1);
        setTitle("My GUI Form");
        setMinimumSize(new Dimension(400,300) );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        mdal = new menu_DAL();
        mlist = mdal.GetMenu();

        tblModel = (DefaultTableModel) table1.getModel();
        tblModel.setColumnIdentifiers(TableColName);

        UpdateTable();
    }

    private void UpdateTable()
    {

        while (tblModel.getRowCount()>0)
            tblModel.removeRow(0);

        for (menu k: mlist) {
            String data[] = {String.valueOf(k.ID), k.name, String.valueOf(k.price)};
            tblModel.addRow(data);
        }
    }


    public static void main(String[] args) {
        new menuForm();
    }
}
