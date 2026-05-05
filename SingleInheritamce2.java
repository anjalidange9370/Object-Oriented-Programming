public class SingleInheritamce2 extends SingleInheritance{
    String company;
    char div;
    void  displayy(){
        super.name="aniket";
        super.id=1;

        System.out.println("good afternoon child class");
    }
static void m1(String cname){
    //super.clg="DYP";super keyword we cant use in static method
}
    static void display2(){
        SingleInheritamce2.clg="DYP";
        SingleInheritamce2 s1=new  SingleInheritamce2();
        s1.display();
        System.out.println("this is child static method");
    }
    void m1(){
System.out.println("the name is : "+name);
System.out.println("the id  is : "+id);
System.out.println("the salary is : "+salary);
System.out.println("the company is : "+company);
System.out.println("the division is : "+div);
    }
    SingleInheritamce2(int id,String name,double salary,String company,char div){
        super(id,name,salary);
        super.good();
        good();
        super.guddi("anjali",3);
        this.company=company;
	    this.div=div;
        clg="zp";
    }
    void np(){
          super.good();
          display();
        super.guddi("anjali",3);
    }
    void m5(String name){
this.name=name;
   }
//    static void s1(){
//     SingleInheritamce2 ss1=new ss1();
//     ss1.guddi();
//    }
    SingleInheritamce2(){
         super.good();
        super.guddi("anjali",3);
     System.out.println("this is child class constructor");
    }
    public static void main(String[] args){
//SingleInheritamce2 s2=new SingleInheritamce2(3,"anjali" , 7457445.00, "DYP",'A');
//s2.m1();  
//SingleInheritamce2 s1=new SingleInheritamce2(1."anjali",8989392.32);
//we cant use super keyword in static method because its static 


}
}
