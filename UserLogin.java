import java.util.*;
class user{
    static int u_id,pwd,age;
    static long pno;
    static String category;
    static Scanner sc = new Scanner(System.in);
    static boolean did_signup_done;
    public static boolean doesnotExists(){
        return did_signup_done;
    }
    public static void signUp()throws Exception{
        if(did_signup_done){
            Thread.sleep(2000);
            System.out.println("\t\tYou already have an account plz login...:)");
        }
        else{
            System.out.print("Enter user id : ");
            u_id = sc.nextInt();
            System.out.print("Enter password : ");
            pwd = sc.nextInt();
            System.out.print("Enter your age : ");
            age = sc.nextInt();
            System.out.print("Enter your contact no : ");
            pno = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter the category veg/Non veg : ");
            category = sc.nextLine();
            did_signup_done = true;
            System.out.println("Processing...");
            Thread.sleep(2000);
            System.out.println("\t\tAccount successfully created.Login and explore the features...:)");
        }
    }//end of signup
    public static void Login()throws Exception{
        if(doesnotExists()){
            System.out.print("Enter user id : ");
            int u_id1 = sc.nextInt();
            System.out.print("Enter password : ");
            int pwd1 = sc.nextInt();
            if(u_id == u_id1 && pwd == pwd1){
                System.out.println("Processing...");
                Thread.sleep(2000);
                System.out.println("\t\tLogin Successfull"); 
                List.hotels();
            }
            else{ 
                System.out.println("Processing...");
                Thread.sleep(1000);
                System.out.println("\t\tInvalid Login Credentials...:)");
            }
        }else{
            Thread.sleep(1000);
            System.out.println("Create the account and access the features...");
        }
    }//end of login
    public static void main(String[] args)throws Exception{
        boolean flag = true;
        System.out.println("\t\t\tWelcome to our application...:)");
        do{
            Thread.sleep(2000);
            System.out.println("\t\tSelect the feature ");
            System.out.println("1.Login\n2.Register\n3.Exit");
            Thread.sleep(1000);
            System.out.print("Select the option : ");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    Login();
                    break;
                }
                case 2:{
                    signUp();
                    break;
                }
                case 3:{
                    flag = false;
                    break;
                }
                default:{
                    Thread.sleep(1000);
                    System.out.println("Plz, Select the valid option...");
                    break;
                }
            }
        }while(flag);
        Thread.sleep(1000);
        System.out.println("\t\tThanks for using application...:)");
    }
}