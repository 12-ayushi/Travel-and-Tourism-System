package travelmanagementsytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton bookPackages,viewpackage,viewHotels,destinations ,updatePersonalDetails,viewBookedHotels;
    JButton addPersonalDetails, viewPersonalDetails,payments,bookHotels,checkPackages,calculator,notepad,about,deletePersonalDetails;
    Dashboard(String username){
        this.username=username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();




        p1.setLayout(null);
        p1.setBackground(new Color(161, 93, 118));
        p1.setBounds(0,0,1600,55);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,55, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,55);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD ,30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(7, 91, 183));
        p2.setBounds(0,55,300,900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,42);
        addPersonalDetails.setBackground(new Color(7, 91, 183));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,42,300,42);
        updatePersonalDetails.setBackground(new Color(7, 91, 183));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,84,300,42);
        viewPersonalDetails.setBackground(new Color(7, 91, 183));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,126,300,42);
        deletePersonalDetails.setBackground(new Color(7, 91, 183));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,168,300,42);
        checkPackages.setBackground(new Color(7, 91, 183));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,210,300,42);
        bookPackages.setBackground(new Color(7, 91, 183));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma", Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,115));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);

        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0,252,300,42);
        viewpackage.setBackground(new Color(7, 91, 183));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,294,300,42);
        viewHotels.setBackground(new Color(7, 91, 183));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0,0,0,135));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotels = new JButton("Book Hotels");
        bookHotels.setBounds(0,336,300,42);
        bookHotels.setBackground(new Color(7, 91, 183));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        bookHotels.setMargin(new Insets(0,0,0,135));
        bookHotels.addActionListener(this);
        p2.add(bookHotels);

        viewBookedHotels = new JButton("View Booked Hotels");
        viewBookedHotels.setBounds(0,378,300,42);
        viewBookedHotels.setBackground(new Color(7, 91, 183));
        viewBookedHotels.setForeground(Color.WHITE);
        viewBookedHotels.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewBookedHotels.setMargin(new Insets(0,0,0,70));
        viewBookedHotels.addActionListener(this);
        p2.add(viewBookedHotels);

        destinations = new JButton("Destinations");
        destinations.setBounds(0,420,300,42);
        destinations.setBackground(new Color(7, 91, 183));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0,462,300,42);
        payments.setBackground(new Color(7, 91, 183));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,165));
        payments.addActionListener(this);
        p2.add(payments);

        calculator = new JButton("Calculator");
        calculator.setBounds(0,504,300,42);
        calculator.setBackground(new Color(7, 91, 183));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,160));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0,546,300,42);
        notepad.setBackground(new Color(7, 91, 183));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,170));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0,588,300,42);
        about.setBackground(new Color(7, 91, 183));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,190));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text= new JLabel("Welcome to our.....");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Raleway",Font.PLAIN,45));
        image.add(text);

        JLabel text1= new JLabel("Tourism Management Application..");
        text1.setBounds(400,120,1200,70);
        text1.setForeground(Color.BLACK);
        text1.setFont(new Font("Raleway",Font.PLAIN,45));
        image.add(text1);


        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkPackages){
            new CheckPackage();
        }
        else if(ae.getSource()==bookPackages){
            new BookPackage(username);
        }
        else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewHotels){
            new CheckHotels();
        }
        else if(ae.getSource()==destinations){
            new Destinations();
        }
        else if(ae.getSource()==bookHotels){
            new BookHotel(username);
        }
        else if(ae.getSource()==viewBookedHotels){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()==payments){
            new Payment();
        }
        else if(ae.getSource()==calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==about){
            new About();
        }
        else if(ae.getSource()==deletePersonalDetails){
            new DeleteCustomer(username);
        }

    }

    public static void main(String[] args) {
        new Dashboard("");

    }

}