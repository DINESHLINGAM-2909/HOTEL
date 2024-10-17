import java.util.*;
class List {
    static double price;
    static int count;
    static double bill;
    static Scanner sc = new Scanner(System.in);
    public static void hotels() throws Exception{
        System.out.println("\t\tWelcome to Hotels>>>");
        boolean flag = true;
        do{
            System.out.println("Select the Hotel:");
            System.out.println("1.Hotel Dinesh\n2.Taj Hotel\n3.Anandha Bhavan\n4.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:{
                    hotelDinesh();
                    break;
                }
                case 2:{
                    tajHotel();
                    break;
                }
                case 3:{
                    AnandhaBhavan();
                    break;
                }
                case 4:{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Please enter a valid option...");
                    break;
                }
            }
        }while(flag);
        Thread.sleep(1000);
        System.out.println("\t\t\tRedirecting to Home page...");
    }
    public static void hotelDinesh() throws Exception{
        boolean flag = true;
        System.out.println("\t\t\tWelcome to Hotel Dinesh...:)");
        do{ 
            Thread.sleep(1000);
            System.out.println("Select the menu items : ");
            System.out.println("1.Parotta\n2.Egg parotta\n3.Chicke Rice\n4.Chicken Noodles\n5.Bill section\n6.Exit");
            Thread.sleep(100);
            System.out.print("Select the option : ");
            int input = sc.nextInt();

            switch(input){
                case 1:{
                    price = 10;
                    System.out.println("Parotta price = 10rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 2:{
                    price = 70;
                    System.out.println("Egg Parotta price = 70rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 3:{
                    price = 90;
                    System.out.println("Chicken rice price = 90rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 4:{
                    price = 90;
                    System.out.println("Chicken Noodles price = 90rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 5:{
                    Thread.sleep(1000);
                    System.out.println("Total bill is ="+bill);
                    boolean res = payment(bill);
                    if(res){   
                        flag = false;
                    }else{
                        System.out.println("\t\tPayment not complete plz try again..!");
                    }
                    break;
                }
                case 6:{
                    flag = false;
                }
            }
        }while(flag);
        Thread.sleep(1000);
        System.out.println("\t\tThank you welcome..!");
    }
        public static void tajHotel() throws Exception{
        boolean flag = true;
        System.out.println("\t\t\tWelcome to Taj Hotel...:)");
        do{ 
            Thread.sleep(1000);
            System.out.println("Select the menu items : ");
            System.out.println("1.Chicken Briyani\n2.Mutton Briyani\n3.Beef Briyani\n4.Chicken Rice\n5.Bill section\n6.Exit");
            Thread.sleep(100);
            System.out.print("Select the option : ");
            int input = sc.nextInt();

            switch(input){
                case 1:{
                    price = 120;
                    System.out.println("Chicekn Briyan price = 120rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 2:{
                    price = 170;
                    System.out.println("Mutton Briyani price = 170rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 3:{
                    price = 100;
                    System.out.println("Beef Briyani price = 90rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 4:{
                    price = 90;
                    System.out.println("Chicken rice price = 90rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 5:{
                    Thread.sleep(1000);
                    System.out.println("Total bill is ="+bill);
                    boolean res = payment(bill);
                    if(res){   
                        flag = false;
                    }else{
                        System.out.println("\t\tPayment not complete plz try again..!");
                    }
                    break;
                }
                case 6:{
                    flag = false;
                }
            }
        }while(flag);
        Thread.sleep(1000);
        System.out.println("\t\tThank you welcome..!");
    }
        public static void AnandhaBhavan() throws Exception{
        boolean flag = true;
        System.out.println("\t\t\tWelcome to Anandha Bhavan...:)");
        do{ 
            Thread.sleep(1000);
            System.out.println("Select the menu items : ");
            System.out.println("1.Idly\n2.Dosa\n3.Pongal\n4.Poori\n5.Bill section\n6.Exit");
            Thread.sleep(100);
            System.out.print("Select the option : ");
            int input = sc.nextInt();

            switch(input){
                case 1:{
                    price = 10;
                    System.out.println("Idly price = 10rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 2:{
                    price = 20;
                    System.out.println("Dosa price = 20rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 3:{
                    price = 40;
                    System.out.println("Pongal price = 40rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 4:{
                    price = 30;
                    System.out.println("Poori price = 30rs");
                    System.out.print("Enter the quantity you want : ");
                    count = sc.nextInt();
                    bill += (price * count);
                    break;}
                case 5:{
                    Thread.sleep(1000);
                    System.out.println("Total bill is ="+bill);
                    boolean res = payment(bill);
                    if(res){   
                        flag = false;
                    }else{
                        System.out.println("\t\tPayment not complete plz try again..!");
                    }
                    break;
                }
                case 6:{
                    flag = false;
                }
            }
        }while(flag);
        Thread.sleep(1000);
        System.out.println("\t\tThank you welcome..!");
    }
    public static boolean payment(double bill)throws Exception{
        boolean flag = true;
        do{
            System.out.println("Payment options :");
            System.out.println("1.G-Pay\n2.Phone-pay");
            System.out.print("Select the payment method : ");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    System.out.println("Enter the amount : ");
                    double pay = sc.nextDouble();
                    if(pay == bill){
                        System.out.println("Processing...");
                        Thread.sleep(1000);
                        int sys_otp = (int)(Math.random()*9999+9999);
                        System.out.println("Your OTP is = "+sys_otp);
                        System.out.print("Enter the OTP = ");
                        int otp = sc.nextInt();
                        if(otp == sys_otp){
                            System.out.println("\t\tProcesing...");
                            Thread.sleep(2000);
                            System.out.println("Payment Successfull...");
                            flag = false;
                            return true;
                        }else{
                            Thread.sleep(1000);
                            System.out.println("Invalid OTP...");
                        }
                    }else{
                        Thread.sleep(500);
                        System.out.println("Please enter a valid amount...");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter the amount : ");
                    double pay = sc.nextDouble();
                    if(pay == bill){
                        System.out.println("Processing...");
                        Thread.sleep(1000);
                        int sys_otp = (int)(Math.random()*9999+9999);
                        System.out.print("Your OTP is = "+sys_otp);
                        System.out.println("Enter the OTP = ");
                        int otp = sc.nextInt();
                        if(otp == sys_otp){
                            System.out.println("\t\tProcesing...");
                            Thread.sleep(2000);
                            System.out.println("Payment Successfull...");
                            flag = false;
                            return true;    
                        }else{
                            Thread.sleep(1000);
                            System.out.println("Invalid OTP...");
                            return false;
                        }
                    }else{
                        Thread.sleep(500);
                        System.out.println("Please enter a valid amount...");
                        return false;
                    }
                    
                }
            }
    }while(flag);
return false;
}
}
