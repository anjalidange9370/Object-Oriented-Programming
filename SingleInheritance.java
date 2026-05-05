//single level
//Child can extend only ONE parent
//we cant call parent class parameterizeed constructor using child class object
//as child class object is created it will call default constructor of both child as well as parent class
//we can also call constructor using creating parent class object(only parent values it will take)
//we can call instance variable of parent class in static method of child class by creating object
//super.name=name====>if u want to call instance varble in child class constructor
//to pass instance varible through static method ur static method should be non-parametrized
//we cant use super and this keyword in static method
//to pass instance varible in static method we need to create object for that and the method
//  should be non-parametrizized
//we can call every method of parent class in child class just by using super.methodname();
//or directly too just by writing methodname();


public class SingleInheritance {
int id;
String name;
double salary;
static String clg="DYPCET";
   void good(){
    System.out.println("good morning parent class");
   }
   
     void guddi(String name,int id){
    this.name=name;
    this.id=id;
   }
   static void display(){
    System.out.println("this is parent class static method");
   }
     SingleInheritance(int id,String name,double salary){
		  this.id=id;
		 this.name=name;
		 this.salary=salary;
	  }
      SingleInheritance(){
        System.out.println("this is default constructor");
      }
      SingleInheritance(int id,String name){
          this.id=id;
		  this.name=name;
      }
      SingleInheritance(String name){
         this.name=name;
             }
public static void main(String[] args){


}
}
