
public class Employee {
   String name = "Modu Kunjo";
   String city = "Maiduguri";
   int age = 20;
   
   public void display(){
       System.out.println("The name is: " + name);
       System.out.println("The city is: " + city);
       System.out.println("The age is: " + age);
   }
    
    public static void main(String[] args) {
       Employee emp1 = new Employee();
       Employee emp2 = new Employee();
       emp1.display();
       emp2.display();
       
    } 
    
}
