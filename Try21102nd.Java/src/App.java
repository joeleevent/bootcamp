import java.util.Arrays;


// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");

//         for (int i =1;i>=5 ;i++){
// for (int j=1; j>=10; j++){
//     System.out.println();


// int [] intArr = new int [4];
// int a =1;
// int b =3;
// int c =5;
// int d =7;
// // System.out.println("print Array" + intArr); //
// // System.out.println ("print Array" + Arrays.toString(intArr));//import java.util.Arrays;

// for (int i=0; i<intArr.length; i++){  //no, not line String.length()
//     System.out.println("looping array: " + intArr[i]);

//     String [] arr1 = new String [4];
//     String [] arr2 = new String [] {"a",  "b", "c", "d"};
//     for (int i=0; i<arr1.length; i++){
//         arr1[i]=arr2[i];
//     System.out.println("Exercise 7.2 : " +Arrays.toString(arr1));
// for (int i=arr2.length -1; i>=0; i--){
// arr1[i] = arr3[i];

// Exercise 10 (like 7)
// String [] arr5 = new String [] {"abc", "def", "ijk", "xyz"};
// String [] arr6 = new String [String arr5.length];
// for (int i= 0 ; i<arr5.length; i++){
//     arr6[i] = arr5[arr5.length -i -1];

//     System.out.println("Exercise 10: " + Arrays.toString(arr6));



24/10/2014: 
int[]arr =new int []{1,2,3,4,5};

for (int i=0 ; i< arr.length ; i++){
    int temp = arr[i];
    arr[i] = arr[arr.length - i -1];
    arr[arr.length -i-1] = temp;
    system.out.println(Arrays.toString(arr));

}        }
    }
}
