import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home implements ActionListener {
JFrame frame=new JFrame();
JTextField textField=new JTextField();
DefaultListModel<String> l1 = new DefaultListModel<>();
JList<String> list = new JList<>(l1);
JButton button=new JButton("تحويل");
JLabel label=new JLabel();

    home(){
        frame.setSize(600,800);
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(100,10,450,300);
        label.setForeground(Color.RED);
        frame.add(label);
label.setText("التحويل من الريال السعودي فقط الى العملات التالية،اختار من القائمة العملة المراد التحويل اليه وثم أضغط تحويل:");
label.setForeground(Color.BLUE);
 button.setFocusable(false);
button.setBackground(Color.yellow);
button.addActionListener(this);
button.setBounds(200,500,200,30);
frame.add(button);
        textField.setBackground(Color.yellow);
        textField.setBounds(200,300,200,30);
        textField.setLayout(null);
        frame.add(textField);


        l1.addElement("Dollar");
        l1.addElement("Euro");
        l1.addElement("Jap Yen");
        l1.addElement("SW Won");

        list.setBounds(250,200, 90,90);
        frame.add(list);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
if(list.getSelectedIndex()==0){
    String b=textField.getText();
    double n=Double.parseDouble(b);
    double x=n*3.75;
    String k=String.valueOf(x);
JTextField textField1=new JTextField(k);
    textField1.setBackground(Color.yellow);
    textField1.setBounds(200,400,200,30);
    textField1.setLayout(null);
    frame.add(textField1);
}
            if(list.getSelectedIndex()==1){
                String w=textField.getText();
                double q=Double.parseDouble(w);
                double x=q*4.11;
                String k=String.valueOf(x);
                JTextField textField1=new JTextField(k);
                textField1.setBackground(Color.yellow);
                textField1.setBounds(200,400,200,30);
                textField1.setLayout(null);
                frame.add(textField1);}

            if(list.getSelectedIndex()==2){
                String w=textField.getText();
                double q=Double.parseDouble(w);
                double x=q*37.17;
                String k=String.valueOf(x);
                JTextField textField1=new JTextField(k);
                textField1.setBackground(Color.yellow);
                textField1.setBounds(200,400,200,30);
                textField1.setLayout(null);
                frame.add(textField1);}

            if(list.getSelectedIndex()==3){
                String w=textField.getText();
                double q=Double.parseDouble(w);
                double x=q*342.36;
                String k=String.valueOf(x);
                JTextField textField1=new JTextField(k);
                textField1.setBackground(Color.yellow);
                textField1.setBounds(200,400,200,30);
                textField1.setLayout(null);
                frame.add(textField1);}
    }}
}
