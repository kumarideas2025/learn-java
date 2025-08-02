//packages ??---for properties make differ package
//builtin pake-age-->
// access modifier--4 types==>public, private,default,protected.

// To access private use getter and setter method

// make for  bank
//package bank;





// data and function combine in one funtion is called encapsulation
// can data hidding by access modification





class Account{
   public String name;
   //will only access(outside) by sub class and by own class
   protected String email;
   private String password;

   public String getPassword(){
       return this.password;
   }
//   use void to set pass no return as it is void.
    public void setPassword(String pass){
         this.password=pass;
    }
}
public class Encapsulation {
public static void main(String args[]){
    // public types
    Account account1=new Account();
    account1.name="Kowshik";
    account1.email="sarkerkowshik016@gamil.com";
//    red under line means private pass is not visiable
//    below comment line use in private pass leaaring ..
//    account1.password="abcd";

//    way to access private pass--
    account1.setPassword("kks");
    System.out.println(account1.getPassword());

}
}

//will import another class name OOp69





// if ---



// public String getPassword(){
// from here you can access it
//     setPassword(randompass);
//        return this.password;
//    }

// --if we make setter as private
//  private void setPassword(String pass){
//          this.password=pass;
//     }

//     public class Encapsulation {
// public static void main(String args[]){
//        account1.setPassword("kks");
//     System.out.println(account1.getPassword());
//  can not access from here
// }
// }
