package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame{
    
   SignupOne() {
       Random ran = new Random();
       long random=Math.abs((ran.nextLong() % 9000L) +1000L);
       
       setLayout(null);// setting the starting point
       
       //Title
       JLabel formno=new JLabel ("APPLICATON fORM NO. " +random );
       formno.setFont(new Font("Raleway", Font.BOLD, 38));
       formno.setBounds(140, 20, 600, 40);//(from left, from top, width, height)
       add(formno);
       
       JLabel personalDetails=new JLabel ("Page 1: Personal Details" );
       personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       personalDetails.setBounds(290, 80, 400, 30);
       add(personalDetails);
       
       
       //name
       JLabel name=new JLabel ("Name:" );
       name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 140, 100, 30);
       add(name);
       
       
       //Name Text field
       JTextField nameTextField= new JTextField();
       nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       nameTextField.setBounds(300,140,400,20);
       add(nameTextField);
       
       
       //Fathers name
       JLabel fname=new JLabel ("Father's Name:" );
       fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 400, 30);
       add(fname);
       
       
       //Father's name Text field
       JTextField fnameTextField= new JTextField();
       fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       fnameTextField.setBounds(300, 190, 400, 20);
       add(fnameTextField);
       
       // Date of birth
       JLabel dob=new JLabel ("Date of Birth:" );
       dob.setFont(new Font("Raleway", Font.BOLD, 20));
       dob.setBounds(100, 240, 400, 30);
       add(dob);
       
       
       //Date Chooser (From [com.toedter.calendar.JDateChooser])
       JDateChooser dateChooser = new JDateChooser();
       dateChooser.setBounds(300,240,400,30);
       dateChooser.setForeground(Color.BLACK);
       add(dateChooser);
       
       
       //Gender
       JLabel gender=new JLabel ("Gender:" );
       gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 290, 400, 30);
       add(gender);
       
                //Radion buttons
      //1.Male
       JRadioButton male= new JRadioButton("Male");
       male.setBounds(300,290,60,30);
       male.setBackground(Color.WHITE);
       add(male);
       //2.Female
       JRadioButton fmale= new JRadioButton("Female");
       fmale.setBounds(450,290,120,30);
       fmale.setBackground(Color.WHITE);
       add(fmale);
       
       //genderGroup (stops multiple seleciton at the same time)
       ButtonGroup genderGroup= new ButtonGroup();
       genderGroup.add(male);
       genderGroup.add(fmale);
       
       //Email
        JLabel email=new JLabel ("Email Adress:" );
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        //Email Text Field
       JTextField emailTextField= new JTextField();
       emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       emailTextField.setBounds(300, 340, 400, 20);
       add(emailTextField);
       
       //Marital status
        JLabel marital=  new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390, 200,30);
        add(marital);
        
                    // Marital status radio button
           
            //1.Married
            JRadioButton married = new JRadioButton("Married");
            married.setBounds(300,390,120,30);
            married.setBackground(Color.WHITE);
            add(married);
            //2.unmarried
            JRadioButton unmarried= new JRadioButton("Unmarried");
            unmarried.setBounds(450,390,120,30);
            unmarried.setBackground(Color.WHITE);
            add(unmarried);
       
             JRadioButton other= new JRadioButton("Other");
            other.setBounds(630,390,120,30);
            other.setBackground(Color.WHITE);
            add(other);
            //genderGroup (stops multiple seleciton at the same time)
            ButtonGroup groupStatus= new ButtonGroup();
            groupStatus.add(married);
            groupStatus.add(unmarried);
            groupStatus.add(other);
        //Address
        JLabel address=  new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440, 200,30);
        add(address);
        
        
        //Address Text Field
       JTextField addressTextField= new JTextField();
       addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       addressTextField.setBounds(300, 440, 400, 20);
       add(addressTextField);
        
       
       //City
        JLabel city=  new JLabel("City");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490, 200,30);
        add(city);
        
        //City text Field
       JTextField cityTextField= new JTextField();
       cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       cityTextField.setBounds(300, 490, 400, 20);
       add(cityTextField);
        
       //State
        JLabel state=  new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540, 200,30);
        add(state);
        
        //State Text Field
         JTextField stateTextField= new JTextField();
       stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       stateTextField.setBounds(300, 540, 400, 20);
       add(stateTextField);
       
       
       //Pin code
         JLabel pincode=  new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590, 200,30);
        add(pincode);
        

        // Pin code Text Field
        JTextField pinTextField= new JTextField();
       pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       pinTextField.setBounds(300, 590, 400, 20);
       add(pinTextField);
        
       //Next Button
       JButton next =new JButton("NEXT");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway", Font.BOLD, 14));
       next.setBounds(620,660,80,30);
       add(next);
       
       //Setting the pane and the background
        getContentPane().setBackground(Color. WHITE);
        setSize(850,800);
        setLocation(10,460);
        setVisible(true);

   }
   
    
    public static void main(String args[]){
        new SignupOne(); // we create the name which is the same as the class
    }
    
}
