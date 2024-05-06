import com.mysql.cj.x.protobuf.MysqlxCrud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class customerForm extends JFrame {
    private JScrollBar scrollBar1;
    private JTable table1;
    private JPanel JPanel2;
    private ArrayList<customer> clist;
    private DefaultTableModel tblModel;
    private final String TableColName[] =
            {"ID", "Name", "Surname", "Adress"};

    customer_DAL cdal;

    public customerForm() {
        setContentPane(JPanel2);
        setTitle("My GUI Form");
        setMinimumSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        cdal = new customer_DAL();
        clist = cdal.Getcustomerlist();

        tblModel = (DefaultTableModel) table1.getModel();
        tblModel.setColumnIdentifiers(TableColName);

        UpdateTable();

    }

    private void UpdateTable() {

        while (tblModel.getRowCount() > 0)
            tblModel.removeRow(0);

        for (customer c : clist) {
            String data[] = {String.valueOf(c.ID), c.Name, c.Surname, c.Adress};
            tblModel.addRow(data);
        }
    }

    public static void main(String[] args) {
        new customerForm();
    }
}

