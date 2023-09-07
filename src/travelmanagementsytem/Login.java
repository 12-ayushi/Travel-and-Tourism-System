//2
package travelmanagementsytem;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JButton login,signup,password;
    JTextField  tfpassword,tfusername;
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);

        getContentPane().setBackground(new Color(10, 10, 10));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(17, 17, 17));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(410, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(10, 40, 410, 300);
        p1.add(image);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(193, 210, 193));
        p2.setBounds(400,30,450,300);
        add(p2);

        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(lblusername);

        tfusername=new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(lblpassword);

        tfpassword=new JTextField();
        JPasswordField tfpassword=new JPasswordField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        login=new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(6, 76, 122));
        login.setForeground(new Color(251, 251, 252));
        login.setBorder(new LineBorder(new Color(4, 77, 126)));
        login.addActionListener(this);
        p2.add(login);

        signup=new JButton("Signup");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(6, 76, 122));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(6, 76, 122)));
        signup.addActionListener(this);
        p2.add(signup);

        password=new JButton("Forget Password");
        password.setBounds(130,250,130,30);
        password.setBackground(new Color(6, 76, 122));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(6, 76, 122)));
        password.addActionListener(this);
        p2.add(password);

        JLabel text=new JLabel("Trouble in login...");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();

                String query="select * from  account where username='"+username+"' AND password='"+pass+"'";
                DbConnecton c= new DbConnecton();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);

                } else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

        } else if(ae.getSource()==signup){
            setVisible(false);
            new SignUp();
        }else {
            setVisible(false);
            new ForgetPassword();
        }
    }

    public static void main(String[] args){

        new Login();
    }

}