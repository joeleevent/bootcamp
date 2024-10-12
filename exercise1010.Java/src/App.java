public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
//Expect Result : 1. VENTURENIXLAB,JAVA
//  2. venturenixlab, java
// V*NTUR*NIXLAB, JAVA!!!

String str1 = "VenturenixLAB, Coding";
System.out.println();

String str2 =str1.replace ("Coding", "java");
System.out.println("str2 :" + str2);


String str3 = str2.replace ("java", "joeveryhappy");
System.out.println("str3:" + str3);

String str4 = str3.replace ("joeveryhappy", "doubt");
System.out.println("str4 :" + str4);

String str5= str4.replace ("VenturenixLAB", "firstwordC");
System.out.println("str5 :"+str5);

// Cant read
String str6= str4.replace ("444", "doubt");
System.out.println();

System.out.println("str5 :"+str5);



    }
}
