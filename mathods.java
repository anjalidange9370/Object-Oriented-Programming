//grp of code used to perform particular task
//instance method==>related to object
//static method==>related to class
//method with no returntype and no parametrs
//method with no returntype and parameters
//method without returntypr
//calling another mwthod in one method is call as method chaining
//just need to pass parameters if the method is parameterized
//we can call any no of methods in ine method
//this keyword is used only in constructor and in static method
//to call instatnce method in static method we need to create an object
public class mathods{
String name;
double salary;
int id;
    //method with no returntype and no parameters
void display(){
    for(int i=1;i<=20;i++){
        System.out.println(i);
    }
}
//calling  methods in constructor
mathods(){
    display();
    stat();

}
void instance(){
    display();
    stat();
System.out.println("this is instance method");
}
static void stat(){
    mathods m=new mathods();
    m.display();
System.out.println("this is static method ");
}
//method with no returntype with parameters
    void display2(String name,double salary,int id){
        this.name=name;
        this.id=id;
       this.salary=salary;
    System.out.println("the name is  : "   +name+ "   the salary is  : "+salary+   "   the id is : "+id);
    } 
//method with parameters with returntype
String displayy(String name,double salary,int id){
    return "The name is: " + name + 
           " The id is: " + id + 
           " The salary is: " + salary;
}
//method with returntype and without parameters
String printing(){
    return "the name is : "+name+"the id is : "+id+"  ";
}
         public static void main(String[] args) {
         mathods m1=new mathods();
         m1.display();
         System.out.println("======================");
         String ans= m1.displayy("Anjali",78000,1);
         System.out.println(ans);
         System.out.println("======================");
        String res= m1.printing();
        System.out.println(res);
        System.out.println("===========================");
        m1.display2("anju",90000,2);
 System.out.println("===================");
 m1.instance();
 System.out.println("===================");
mathods.stat();
    }
}