// import java.io.*;
// class addition{
//     int sum = 0;
//     public int addTwoNumber(int a, int b){
//         sum = a+b;
//         return sum;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         addition add = new addition();
//         int sum = add.addTwoNumber(2, 4);
//         System.out.println(sum);
//     }
// }

//import java.io.*;
// class Subtration{
//     int minus = 0;
//     public int subtractTwoNumber(int a, int b){
//         minus = a-b;
//         return minus;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Subtration sub = new Subtration();
//         int minus = sub.subtractTwoNumber(6, 6);
//         System.out.println(minus);
//     }
// }

// class divide{
//     double div = 0;
//     public double divideTwoNumber(double a, double b){
//         div = a/b;
//         return div;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         divide Div = new divide();
//         double d = Div.divideTwoNumber(6,4);
//         System.out.println(d);
//     }
// }



// class Tests{
//     String name;
//     int id;
//     Tests(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Tests tst = new Tests("Shiva", 101);
//         System.out.println("TestName : " + tst.name + " and TestId :" + tst.id);
//     }
// }



// class Demo{
//     String name;
//     int id;
//     Demo(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
// }
// class gfg{
//     public static void main(String[] args) {
//         Demo demo = new Demo("shiri", 10);
//         System.out.println(demo.name);
//         System.out.println(demo.id);
//     }
// }


// class demo{
//     private double name, imge;
//     public demo(double name, double imge){
//         this.name = name;
//         this.imge = imge;
//     }
//     // Copy Constructor 
//     demo(demo d){
//         name = d.name;
//         imge = d.imge;
//     }

//     // Overriding the toString of Object class
//     @Override
//     public String toString(){
//         return "(" + name + " + " + imge + "i)";
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         demo d1 = new demo(10,15);
//         demo d2 = new demo(d1);
        
//         demo d3 = d2;
        
//         System.out.println(d2);
//     }
// }
//  class Box{
//     double width;
//     double depth;
//     double height;
//     Box(double W, double D, double H){
//         width = W;
//         depth = D;
//         height = H;
//     }
//     Box(){
//         width = height = depth = 0;
//     }
//     Box(double len){
//         width = height = depth = len;
//     }
//     double volume(){
//         return width * height * depth;
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         Box box = new Box(2,4,5);
//         Box box2 = new Box();
//         Box box3 = new Box();

//         double vol;

//         vol = box.volume();
//         System.out.println("volume of box is " + vol);
        
//     }
// }


class MySingleton{
    static MySingleton instance  = null;
    public int x = 10;

    // private constructor can't be accessed outside the class
    private MySingleton(){

    }
    
    // Factory method to provide the users with instances
    static public MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
}

class Test{
    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        a.x = a.x + 10;
        System.out.println("value of a.x = " + a.x);
    }
}