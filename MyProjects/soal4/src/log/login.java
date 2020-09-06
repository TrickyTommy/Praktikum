package log;

import load.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.*;
import java.*;
//import proses.data;



public class login extends JFrame
{

	
    //  Buat Objek Frame
     ;
   
    //  Buat Objek Label
    JLabel lblUsername = new JLabel("Username");
    JLabel lblPasswd = new JLabel("Password");
   
    //  Buat Objek TextField dan PasswordField
    JTextField txtUsername = new JTextField();
    JPasswordField txtPasswd = new JPasswordField();
   
    //  Buat Button Masuk
    JButton btnMasuk = new JButton("Masuk");
    JButton exit =new JButton("Close");
   
    //  Variable
    int count = 0;
   
    //  Method Main
   
    //  Procedure untuk Layout Menu
   public  void Menu()
    {
        //  Set judul frame
        setTitle("Login Di Sini");
       
        //  Set ukuran frame
        setSize(250, 140);
       
        //  Set Posisi frame berada di tengah layar
        setLocationRelativeTo(null);
       
        //  [Optional] Set tombol maximize menjadi disabled
        setResizable(false);
       
        //  Set program agar program berhenti ketika tombol close di klik di frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        //  Set Visible frame  agar Frame muncul ketika program di running
        setVisible(true);
       
        //  Set Layout Frame
        setLayout(null);
       
        //  Memasukkan komponen Label, TextField dan Button ke dalam Frame
        add(lblUsername);
        add(lblPasswd);
        add(txtUsername);
        add(txtPasswd);
        add(btnMasuk);
        add(exit);
       
       
        //  Menentukan posisi komponen Label, TextField dan Button di dalam Frame menggunakan koordinat X dan Y
        lblUsername.setBounds(20, 20, 100, 20);
        lblPasswd.setBounds(20, 50, 100, 20);
        txtUsername.setBounds(100, 20, 130, 20);
        txtPasswd.setBounds(100, 50, 130, 20);
        btnMasuk.setBounds(20, 80, 75, 20);
        exit.setBounds(100,80,75,20);
     	
       
    }
    
   
    //  Event Handler untuk Button Masuk
  public void Handler()
    {
    	
    
        //  Event untuk Button Masuk menerima klik mouse
        btnMasuk.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //  Mengambil nilai txtUsername
                String username = txtUsername.getText().toString();
                String passwd = txtPasswd.getText().toString();
               
                if(username.equals("admin") && passwd.equals("admin"))
                {
                    JOptionPane.showMessageDialog(null, "Anda berhasil login");
                    dispose();
                   // data dat=new data();
                   // dat.menu();
                   sikek ld =new sikek();
                   ld.Pro();
                  
                   
                    
                    
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username/Password Anda salah!!!");
                   

                    //  Untuk membatasi kesalahan user dalam melakukan login
                    count++;
                }
               
                if(count == 3)
                {
                    JOptionPane.showMessageDialog(null, "Anda sudah gagal Login sebanyak 3 kali. Harap coba lagi nanti . . .");
                    System.exit(1);
                }
            }
        });
    }
   
}