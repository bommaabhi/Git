import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu Aug 06 14:40:29 PDT 2020
 */



/**
 * @author Abhishek Reddy Bomma
 */
public class Inventory extends JFrame {
    public Inventory() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Abhishek Reddy Bomma
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Enter the Category Code");
        contentPane.add(label1, "cell 1 1");

        //---- textField1 ----
        textField1.setColumns(5);
        contentPane.add(textField1, "cell 3 1");

        //---- label2 ----
        label2.setText("Enter the Category Desc");
        contentPane.add(label2, "cell 1 2");

        //---- textField2 ----
        textField2.setColumns(20);
        contentPane.add(textField2, "cell 3 2");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, "cell 3 3");

        //---- button1 ----
        button1.setText("Add");
        contentPane.add(button1, "cell 3 5");

        //---- button2 ----
        button2.setText("Edit");
        contentPane.add(button2, "cell 3 5");

        //---- button3 ----
        button3.setText("Delete");
        contentPane.add(button3, "cell 3 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Abhishek Reddy Bomma
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
