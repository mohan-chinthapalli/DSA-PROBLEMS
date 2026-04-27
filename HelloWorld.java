// class Mohan {
//     String name = "Mohan";
//     int id = 1623;

//     Dog() {
//         System.out.println(this.name);
//         System.out.println(this.id);
//     }
// }

// class Dog1 extends Dog {

//     Dog1() {
//         System.out.println(super.name);
//         System.out.println(super.id);
//     }
// }


public class HelloWorld {

    public void method1(){
        System.out.println("Method 1  called");
    }
    public void method2(){
        System.out.println("Method 2 called");
        method1();
    }
    public static void main(String[] args) {

        HelloWorld obj = new HelloWorld();
        obj.method2();
    }
}
