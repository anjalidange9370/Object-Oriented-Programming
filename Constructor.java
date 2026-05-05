//class name and constructor name should be same
//it has no returntype
//used to intialize the object
//default constructor will automatically as we create object
//called only once for each object
//to call parametrized constructor we need to pass value through object
//3 types==>default  parameterized  copy 
//this we can use in instance method too
//we can call constructor in method by creating object
//Constructor Chaining =calling one constructor in another constructor
//we can not call multiple constructor in single constructor we can call only one 
public class Constructor {
    int id;
    String name;
    String no;
    double salary;
   // Default Constructor
    Constructor(){
        this("Aniket",1);
        System.out.println("this is  default constructor ");
    }
        Constructor(String name){
           this.name=name;
        System.out.println("The name is : "+name);
    }
    //Parametrized Constructor
Constructor(String name,int id){
    this("Aniket");
if(name.length()>5){
    this.name=name;
}
else{
    System.out.println("Invalid Name");
}
this.id=id;
}
//Saved the 2 lines of this. this.
Constructor(double salary,String name,int id,String no){
this(name,id);
this.no=no;
this.salary=salary;
}
    //Copy Constructor
 void display(){
    

    System.out.println("The name is : "+name);
    System.out.println("THe id is  : "+id);

}
 void display2(){
    Constructor c4=new Constructor("ANJALIANIKET",101);
    System.out.println("The name is "+c4.name);
    System.out.println("the id is : "+c4.id);
}
 public static void main(String[] args){
Constructor c1=new Constructor();
Constructor c2=new Constructor("Anjali",1);
c2.display();
Constructor c3=c2;
c3.id=4;
System.out.println(c3.name);
System.out.println(c3.id);
Constructor c5=new Constructor();
c5.display2();
}
}
