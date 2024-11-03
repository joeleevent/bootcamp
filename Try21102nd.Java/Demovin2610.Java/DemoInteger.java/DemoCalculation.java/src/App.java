public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       Integer num1 = Integer.valueOf(127); //1
       Integer num2 = Integer.valueOf(127); //1
System.out.println(num1 == num2); //true
System.out.println(num1 == num2); //0

       Integer num3 = Integer.valueOf(128);
       Integer num4 = Integer.valueOf(128);
       System.out.println(num3 == num4); //false
    System.out.println(num3 == num4); //0



    }
}
