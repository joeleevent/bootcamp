// import java.beans.JavaBean;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        // Expect Result :
        // 1. VENTURENIXLAB, Java//
        // 2. venturenixlab, java
        // 3. V*NTUR

        String str1 = "VenturenixLAB,Coding";
        String str2 = "VenturenixLAB";
        String str3 = ", JAVA";
        // String str4 = Coding;

        System.out.println(str1 + str2);

        // System.out.println(str1.toUpperCase(),str2.toLowerCase())
        System.out.println(str1.toUpperCase() + str2.toLowerCase());

        System.out.println(str1.concat(str3));

        System.out.println((char) 48);

        String str9 = "Diamond Hill";
        System.out.println(str9.substring(5));
        


    }
}
