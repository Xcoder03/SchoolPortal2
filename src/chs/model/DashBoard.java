package chs.model;
import chs.model.Register;
import chs.services.ConfesHighSchool;

import java.util.Random;
import java.util.Scanner;

public class DashBoard implements ConfesHighSchool {
    public DashBoard() {
    }
    public void signUp(Register register) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please Enter Students first name");
        String fn = input.nextLine();
        register.setFirstname(fn);
        System.out.println("Please Enter Students last name");
        String sn = input.nextLine();
        register.setLastname(sn);
        System.out.println("Please Enter student gender");
        String gd = input.nextLine();
        register.setSex(gd);
        System.out.println("Please Enter Students class");
        String cls = input.nextLine();
        register.setGrade(cls);
        System.out.println("Please Enter Students Email");
        String ad = input.nextLine();
        register.setEmail(ad);
        System.out.println("Please Enter Students Address");
        String ads = input.nextLine();
        register.setAddress(ads);
        System.out.println("Please Enter student phone number");
        String pno = input.nextLine();
        register.setPhoneNo(pno);
        System.out.println("Please Enter a password");
        String pss = in.nextLine();
        register.setPassword(pss);
        System.out.println(register.getPassword());
        int id_random = rand.nextInt(25);
        register.setId(id_random);
        System.out.println("Welcome to Confex High School: " + register.getFirstname() + " " + register.getLastname());
        int random = rand.nextInt(register.getFirstname().length());
        String N = "CHS";
        char[] us = new char[]{register.getFirstname().charAt(0), register.getFirstname().charAt(1), register.getFirstname().charAt(random), register.getFirstname().charAt(random)};
        String user = "";

        for(int i = 0; i < us.length; ++i) {
            user = user + us[i];
        }

        System.out.println("Your username is: " + N + user + random + random + random);
        if (register.getClass().equals("Jss1")){
            Jss1 js = new Jss1();
            js.schoolclass(register);
        }
        else if(register.getClass().equals("Jss2")){
            Jss2 js2 = new Jss2();
            js2.schoolclass(register);
        }
        else if(register.getClass().equals("Jss3")){
            Jss3 js3 = new Jss3();
            js3.schoolclass(register);
        }
        else if(register.getClass().equals("SS1")){
            SS1 ss1 = new SS1();
            ss1.snrclass(register);
        }
        else if(register.getClass().equals("SS2")){
            SS2 ss2 = new SS2();
            ss2.snrclass(register);
        }
        else if(register.getClass().equals("SS3")){
            SS3 ss3 = new SS3();
            ss3.snrclass(register);
        }
    }

    public void signIn() {
        int options = 0;
        String choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("welcome ");
            System.out.println("Welcome what would you like to do");
            System.out.println("///////////////////");
            System.out.println("|||||||||||||||||");

            System.out.println("1: Check Result ");
            System.out.println("2: Check Class Time Table ");
            System.out.println("3: School Gallery ");
            System.out.println("4: School Blog ");
            switch (options){
                case 1:
                    System.out.println("Enter student name");
                    System.out.println("Enter student class");
                    // we get student class and loop through the class to find out if student exists.
                    break;
                case 2:
                    System.out.println("Enter class name");
                    break;
                case 3:
                    System.out.println("Welcome to Our school gallery");
                    break;
                case 4:
                    System.out.println("Welcome to student blog");
            }
            System.out.println("Do you wish to continue  YES/NO");
            choice = input.next();


        }while(choice.equalsIgnoreCase("YES")|| choice.equalsIgnoreCase("Y"));


    }
}
