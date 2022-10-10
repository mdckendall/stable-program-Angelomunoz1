import java.util.Scanner;

class Stable {
  int address;
  String name;
  float horse;
  Scanner s2;


  public Stable(Scanner s1){
    s2=s1;
  }
  public void setAddr(){
    System.out.println("Enter address:");
    address=s2.nextInt();
System.out.println("Do you wish to add a horse to the stable?");
    horse=s2.nextFloat();
    s2.nextLine();
        System.out.println("Enter name:");
    name=s2.nextLine();
  }
  public void display(){
    System.out.println("address:"+address);
    System.out.println("Do you wish to add a horse to the stable?"+horse);
    System.out.println("name:"+name);
  }
}