
import java.util.Scanner;

 //public  class arrays {
// public static void main(String[] args ){
//  Scanner sc = new Scanner(System.in);
// System.out.println("enter your first number" );
// int a = sc.nextInt();
// System.out.println("enter your second number");
// int b = sc.nextInt();

//       System.out.println("choose your operation");
//       System.out.println("1addition ");
//       System.out.println("2subtraction");
//       System.out.println("3 multipication");
//       System.out.println("4 division");
//       System.out.println("5 modulous");

//       int operation = sc.nextInt(); 
//       switch (operation) {
//         case 1:System.out.println(a + b);
//         break;
//         case 2:System.out.println(a - b);
//         break;
//         case 3:System.out.println(a * b);
//         break;
//         case 4:System.out.println(a / b);
//         break;
//         case 5:System.out.println(a % b);
     
//       } 
// }

  
    
// }

public class arrays{ public static void main(String[] args) {
//    int[] marks = {97 ,98 , 95} ;
//   //int[] marks = new int [3] ;
   
//    //int marks[] = new int [3] ;
//    //marks[0] = 97 ;  //py
//    //marks[1] = 98 ;  //chem
//    //marks[2] = 95 ;  //eng
//   //  System.out.println(marks [0]);
//   //  System.out.println(marks [1]);
//   //  System.out.println(marks [2]);
//   for( int i = 0 ; i < 3 ; i++) {
//   System.out.println(marks[i]);
    
//   }



// Scanner sc = new Scanner(System.in) ;
//  int size = sc.nextInt();
//  int number[] = new int[size] ;

// //input

// for (int  i = 0 ; i < size ; i++) {
//   number[i] = sc.nextInt();
// }

// //output 

// for ( int i = 0 ; i < size ; i++) {
//   System.out.println(number[i]);
// }

////take an array as input from the future search from a given number x and print the index which its occurs

// Scanner sc = new Scanner(System.in) ;
//  int size = sc.nextInt();
//  int number[ ] = new int[size] ;



//  for (int i = 0 ; i < size ; i++ ) {
//    number[i] = sc.nextInt() ;
//  }

//   int x = sc.nextInt();

//  for (int i = 0 ; i < number.length ; i++) {
//    if ( number[i] == x) {
//     System.out.println("x found at index = "  +i);
//    }
//  }


//Find the maximum & minimum number in an array of integers. 

// Scanner sc = new Scanner(System.in) ;
// int size = sc.nextInt() ;
// int number[] = new int[size] ;


// //intput
// for (int i = 0 ; i < size ; i++) {
//      number[i] = sc.nextInt() ;

// }
//             int max = sc.nextInt();
//       int min = sc.nextInt() ;


// //output
  
// for (int i = 0 ; i < number.length ;i++ ) {
//     if (number[i] < max ){
//         System.out.println(max);
//     }


//     if (number[i] > min ) {
//         System.out.println(min);
//     }
// }
 
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending or descending
//   Scanner sc= new Scanner(System.in) ;
//   int size = sc.nextInt ;
//   int numbers[ ] = new int [size] ;
  

//   //input 
//   for ( int i = 0 ; i < size ; i ++ ) {
//       numbers[i]  = sc.nextInt()  ;
//   }

//   for ( int i = 0 ; )

// for ( int i = 10 ;i > 0; i--) {
// System.out.println(i);
// }

//int n = sc.nextint();
// for ( int i = 1 ; i <= n ; i++) {
//     System.out.println(i);
// }
// int sum = 0;
// for ( int i = 2 ; i <= n ; i = i + 2)  {
//     sum = sum + i;
// }


//  System.out.println(sum);





 //kisi bhi number ka able print karo 
// int n = sc.nextInt();
// for (int i = 1 ; i < 11 ; i ++){
//     System.out.println(n*i);
// }

//kisi number ka factorial find karo 

// int n = sc.nextInt();

// int fact = 1  ;
// for ( int i = n ; i > 1; i--){
// fact = fact*i ;

// }
// System.out.println(fact);

// int count = 0 ;
// //ko .
// int  n = sc.nextInt();isi numer me kitne digits h loop se find kr
// for ( int i = n ;   n > 0 ;n = n/10   ) {
//     count =count +1 ;
   
// }
// System.out.println(count);

 //int n = sc.nextInt();
// //check karo ki given number prime hai ya nahi

// int count = 0 ;
// for  ( int i= 1 ;   i <= n ;i++  ){
//   if (  n % i == 0 ) {
//     count = 1 + count  ;
//   }
// }
// if (count == 2 ){
//     System.out.println("n is prime number ");
// }
// else
//     System.out.println("n is not prime number");
// }

//given number ke factor print karo 
//int n = sc.nextInt();

// for ( int i = 1; i  <= n  ; i++ ){
//     if (n % i == 0 ){
    
//     System.out.println(" " + i + " "); }
// }
// int digit = 0 ;



//number inverse karo


//int n = sc.nextInt() ;
// for ( int i = 1 ; i <=5 ; i++ ){ 
     
//     digit = digit*10 + n % 10 ;
//      n = n/10 ;
// }
// System.out.println(digit);

//check karo ki koi number palindrome h ya nhi
// Scanner sc = new Scanner(System.in) ;
// int n = sc.nextInt() ;
//  int num = n ;
// int digit = 0 ;
// for ( int i = 1 ; n > 0; i ++) {
//      digit = digit*10 + n %10 ;
// n = n/10 ;

// }
// if ( num == digit ) {
// System.out.println("n is palindrome number");
// }
// else{
//     System.out.println("n is not palindrome number");
// }
// }
// }
//1 se n tak saare prime numbers print karo
// Scanner sc = new Scanner (System.in) ;

// int n = sc.nextInt() ;
// for(int i = 2 ; i <=n ; i++){
//     int count  =  0;
// for (int j = 1 ; j <= i  ; j++) {
//     if ( i % j == 0 ){
//     count =  count + 1 ;
//     }

// }

//    if (count == 2) {
//  System.out.println(i);
// }

// }
//}
 

//check the whether a 3 - digit number is an armstrong number 
// EXAMPLE -->153 =  1^3 + 2^3 + 3^3 = 153 

// Scanner sc = new Scanner(System.in) ;
// int n = sc.nextInt() ;
// int  N = n ;
//  int cube = 0 ;
//  int SOC  = 0 ;
// for ( ; n > 0  ; ) {
//      cube = (n % 10 )*(n % 10)*(n %10) ;
//     SOC = cube + SOC ;
//     n = n/10 ;
// }
// if ( SOC == N ){
//     System.out.println("N IS AN ARMSTRONG NUMBER ");
// }
// else {
//     System.out.println("n is not an armstrong number ");
// }
//  } 
// }



//PRINT THE FIBONACCI SERIES UP TO N 
// Scanner sc =new Scanner (System.in) ;
// int n = sc.nextInt() ;
// int num1 = 0 ;
// int num2 = 1 ;
// System.out.println(0);
// for (int i = 0 ; i < n ; i++) {
//    int num3= num1 +num2 ;
//   System.out.println(num3); 
//   num1  = num2  ;
//   num2  = num3 ;
//  }

///  NESTED LOOP
// *****
// *****
// *****
// *****
// Scanner sc = new Scanner(System.in) ;
// int n = sc.nextInt() ;
// for (int i = 0 ; i < n ; i++) {
// for (int j = 0 ; j <= n  ; j++){
//   System.out.print(" " + " *" + " ");
// }
// System.out.println();
// }


//*****
//*   *
//*   *
//***** 
 
// Scanner sc = new Scanner(System.in) ;
// int n = 4  ; //rows 
// int m = 5  ;  //column

// for ( int i = 1 ; i <= n ; i++) {
//   for(int j = 1 ; j <= m ; j++)  {
//   if (i == 1 || j == 1 || i == n || j == m ){
// System.out.print("*");
//   }
//   else {
//     System.out.print(" ");
//   }
  
//   }
//   System.out.println();
//  }


//half pyramid 
//* 
//** 
//*** 
//**** 
// Scanner sc = new Scanner (System.in);
// int n = 4 ;
// for (int i = 1  ; i <= n ; i++ ){
// for (int j = 1 ; j <= i  ; j++ ){

//   System.out.print("*");
//    }
  
//   System.out.println();


//****
//***
//**
//* 
// Scanner sc = new Scanner(System.in) ;
// int n = 4 ;

// for (int i = 1 ; i <= n ; i++ ) {
//   for ( int j = n ; j >= i ; j --) {
//    System.out.print("*");
//   }
//   System.out.println();
// }
//    *
//   **
//  ***
// ****
// Scanner sc = new Scanner(System.in) ;
// int n = 4;

// for (int i = 1 ; i <= n ; i++){
//   for (int j = n - i ; j > 0 ; j--  ){
//     System.out.print(" ");
//   }
//   for(int j = 1 ; j <= i ; j ++){
//     System.out.print("*");
//   }
//   System.out.println();
// }




// 1
// 12
// 123
// 1234
// 12345
 
// Scanner sc = new Scanner(System.in) ;
// int n = 5 ;
// for (int i = 1 ; i <= n ; i++ ) {
// for (int j = 1 ; j <= i ; j++ ){
//   System.out.print(j);
// }
// System.out.println();
// }

//12345
//1234
//123
//12
//1
// Scanner sc = new Scanner(System.in) ;
// int n = 5 ;
// for ( int i = 0 ; i <= n ; i++ ) {
//    for (int j = n - i ; j > 0  ; j--) {
//        System.out.print("*");   
//  }
//  System.out.println();
// }

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14
// Scanner sc = new Scanner(System.in) ;
// int n = 5;
// int sum = 0 ;
// for ( int i = 1 ; i <= n; i++){
//    for(int j = 1 ;j <= i ; j ++){
//      System.out.print( sum + " ");
//     sum++ ;
//    }
//    System.out.println();
// }


// 1
// 01
// 101
// 0101
// 01010
// Scanner sc = new Scanner(System.in) ;
// int n = 5 ;
// for (int i = 0 ; i <= n  ; i++){
//    for (int j = 1 ; j <= i ; j++ ){
//       if ((i + j) % 2 == 0 ){
//       System.out.print(1 + " " ) ;
//    }
//    else 
//     System.out.print(0 + " ");
   
//      }
//      System.out.println();
//    }
//   }
// }

//      *****
//     *****
//    *****
//   *****
//  *****


// Scanner sc = new Scanner(System.in) ;
// int n = 5 ;
// for (int i = 1 ; i <= n ; i++){
//    for (int j = n - i  ; j > 0 ; j --){
//       System.out.print(" ");
//    }

//    for (int j = 0 ; j <= n  ; j++) {
//       System.out.print("*");
//    }
//    System.out.println();
// }


//  1 
//  22
//  333
//  4444
//  55555

// Scanner sc =new Scanner (System.in) ;
// int n = 5 ;
// for (int i = 1 ; i <= n ; i++){
//  for (int j = n-i ; j > 0 ; j-- ){
//      System.out.print(" ");
//  }
//    for (int j = 1; j <= i ; j++){
//    System.out.print(i + " ");
// }
// System.out.println();
//   }




//     1 
//    212
//   32123
//  4321234
// 543212345
// Scanner sc =new Scanner(System.in) ;
//int n = 5 ;
// for (int i = 1 ; i < n ; i++) {
//     //spaces
//    for (int j = n - i  ; j > 0 ; j-- ){
//        System.out.print(" ");
//     }
//     for(int j = i  ; j > 0 ; j--){
//         System.out.print(j); 
//     }
//     for(int j = 2 ; j <= i ; j++  ){
//       System.out.print(j);
//    }
//    System.out.println();
// }
// }
// }
// Scanner sc =new Scanner(System.in);
// int n = 5 ;
//    for (int i = 1 ; i < n  ; i++) {
//       for (int j = n -i   ; j> 0 ; j--){
//          System.out.print(" ");
//       }
//       for ( int j = i ; j > 0 ; j-- ){
//          System.out.print("*");
//       }
//       for (int j = 1 ; j < i ; j++) {
//          System.out.print("*");
//       }

//       System.out.println();   
//    }

//    for (int i = n ; i >= 1 ; i--) {
//       for (int j = n -i   ; j> 0 ; j--){
//          System.out.print(" ");
//       }
//       for ( int j = i ; j > 0 ; j-- ){
//          System.out.print("*");
//       }
//       for (int j = 1 ; j < i ; j++) {
//          System.out.print("*");
//       }

//       System.out.println();   
//    }







// *              *
// * *          * *
// *  *       *   *
// *    *   *     *
// *      **      *
// *    *    *    *
// *   *      *   *
// * *          * *
// *              *


// Scanner sc = new Scanner(System.in) ;
// int n = 5 ;
// for (int i = 1 ; i <= n ; i ++){
//    for (int j = 1 ; j <= i ; j++){ 
// System.out.print("*");
//    }
//    for (int j = 0 ; j <2*(n - i ) ; j ++){
//     System.out.print(" ");
//    }
   
//    for (int j = i ; j > 0; j -- ){
//     System.out.print("*");
//    }
//    System.out.println();
//  }



//     * * * * * 
//    *       * 
//   *       * 
//  *       * 
// * * * * *
// Scanner sc = new Scanner(System.in) ;
// int n =  5  ;
// for ( int i = 1 ; i <= n ; i ++){
//   for ( int j = n - i  ; j > 0 ; j-- ){
//       System.out.print(" ");
// }
//    for (int j = 1 ; j <= n ; j ++) {
//   if ( i == 1 || i == n || j == 1 || j == n ){
//       System.out.print("*");
//   }
//    else {
//       System.out.print(" ");
//    }
// }
// System.out.println();
//  }

 
////3. Print Pascal’s Triangle.
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

// Scanner sc =new Scanner(System.in);
// int  n  = 5 ;
// int num = 1 ;
// for ( int i = 1 ; i <= n  ; i ++){
  
 
  
 

//   for (int j = 1; j <2; j++  ){
//     System.out.print( num  );
//   }
   
  
//   System.out.println();
//   num = num*11 ;
// }








//half inverted  pyramid 
// 11111 
//  222
//  33
//  4
//  Scanner sc =new Scanner(System.in) ;
//  int n = 4 ;

// for( int i = 1  ; i <= n ; i++){
//     for (int j = 0 ; j <= i ; j++){
//      System.out.print(" ");
//    }for(int j = i; j <=  n ; j++){
//     System.out.print(+i);
//    }
//  System.out.println();
// }


// BUTTERFLIY PATTERN 
// BUTTERFLIY PATTERN 


// Scanner sc = new Scanner(System.in) ;
// int n = 4 ;
// // UPPER PART 
// for ( int i = 1 ; i <= n; i ++ ){
// for (int j =0 ; j < i; j ++){
//   System.out.print("*");
// }
// for ( int j =0; j < 2*(n -i) ;j++ ){
//   System.out.print(" ");
// }
// for ( int j = i ; j > 0 ; j --){
//   System.out.print("*");
// }
// System.out.println();
// }

// // LOWER PART
// for ( int i = n; i > 0; i -- ){
// for (int j =0 ; j < i; j ++){
//   System.out.print("*");
// }
// for ( int j =0; j < 2*(n -i) ;j++ ){
//   System.out.print(" ");
// }
// for ( int j = i ; j > 0 ; j --){
//   System.out.print("*");
// }
// System.out.println();
// }




////PRINT HALF PYRAMID 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
// Scanner sc = new Scanner(System.in) ;
// int n =  5 ;

// for ( int i = 1; i <= n  ; i++){
//   for ( int j = 1 ; j <= i ; j ++){
//     System.out.print(" " + j);
//   }
//   System.out.println();
// }

// Scanner sc = new Scanner(System.in) ;
//  int[] marks = new int[3] ;
//  marks[0] = 89 ;
//  marks[1]  = 97 ;
//  marks[2] = 80;
// //  System.out.println(marks[0]);
// //  System.out.println(marks[1]); 
// //  System.out.println(marks[2]);
 
//  for ( int i = 0 ; i < 3 ; i++){
//    System.out.println(marks[i]);
//  }
 
//LINEAR SEARCH


 //take an arrays as input from the user . search for a given numbers x and print the index at which it occurs
//  Scanner sc =new Scanner(System.in);
// int size=sc.nextInt();
//  int []marks = new int[size];
//  //input
//  for (int i=0; i<size; i++){
//    marks[i] =sc.nextInt();
//  }
//   int x=sc.nextInt();
// //output
//   for(int i=0; i<size; i++ ){
//   if(marks[i] == x)
//   System.out.println("the index of the numbers :" + i);
//   }





// ascendig order or decsending order
//   Scanner sc=new Scanner(System.in);
//   int size = sc.nextInt();
//   int numbers[] = new int[size];
//   //input
//    for(int i=0; i>numbers.length; i++){
//    numbers[i] = sc.nextInt();
//    }

// //check the order
//    boolean  isAscending = true;
// for(int i=1; i>numbers.length; i++){
//    numbers[i] =sc.nextInt();
   
//    if(numbers[i]>numbers[i+i]){
//     isAscending = false;
//    }
// }
  
   
   
   
   

  


// if(isAscending == true){
//    System.out.println("the array is sorted in ascending order");
//   }
//   else{
//    System.out.println("the array is sorted in descending order");
//  }
 
//  }
// }


 

//take a matrix as a input from the user . search as given number x and the indices at which its occurs

//   Scanner sc = new Scanner(System.in);
//   int rows = sc.nextInt();
//   int cols = sc.nextInt();
//   int matrix[][] = new int[rows][cols];

//   for(int i=0; i<rows; i++){
//     for(int j=0; j<cols; j++){
//    matrix[i][j] = sc.nextInt();
//     }
//   }
//    int x =sc.nextInt();
  
//    for(int i=0; i<rows; i++){
//     for(int j=0; j<cols; j++){
//     if(matrix[i][j] ==x){
//      System.out.print(i + " ," + j);
//     }
//    }
//  }

//array me direct values
   // Scanner sc = new Scanner(System.in);
   // int sum= 0;
   // int num[] = {1 , 2 ,3 ,4 ,5 };
   // for(int i=0; i<num.length; i++){
   //    sum = sum +num[i]; 
   // }
   // System.out.println(sum);

//find the sum of all the elements of an array.
    // Scanner sc =new Scanner(System.in);
    // int size =sc.nextInt();
    // int num[] = new int[size];
    //  int sum =0;
    //  for(int i=0; i<size; i++){
    //  num[i] =sc.nextInt();
    //   sum = sum + num[i];
    //  }
    //  System.out.println(sum);


//find the average of all the elements of an array

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int elements[]= new int[size];
    // int num =0;
    // int average = 0;
    // for(int i=0; i<elements.length; i++){
    // elements[i] = sc.nextInt();  
    //   num = elements[i] + num;
    //  average= num/elements.length;
    // }
    // System.out.println("the average of the elements is :" + average);

    // find the maximum elements in an array.
//     Scanner sc =new Scanner(System.in);
//     int size = sc.nextInt();
//     int num[] = new int[size];
//     for(int i=0; i<num.length; i++){
//     num[i] = sc.nextInt();
   
//    }
//    int max = num[0];

//    for(int i=0; i<num.length; i++){
//    if(num[i]>max){
//     max = num[i];
//    }
//  }
//   System.out.println(max);
//    }
//  }

     // find the minimum elements in an array
//       Scanner sc = new Scanner(System.in);
//       int size =sc.nextInt();
//       int num[] = new int[size];
//       for(int i=0; i<num.length; i++){
//         num[i] = sc.nextInt();
//       }
//         int min = num[0];
//      for(int i=0; i<num.length; i++){
//         if(num[i]<min){
//             min = num[i];
//         }
//      }
//       System.out.println(min);

//     int sum = 0;   
//     Scanner sc =new Scanner(System.in);
//     int size = sc.nextInt();
//     int num[] = new int[size];
//     for(int i=0; i<num.length; i++){
//      num[i] = sc.nextInt();
//     }
//     int even=0; 
//     int odd = 0;
//   for(int i=0; i<num.length; i++){
//     if(num[i]%2 == 0){
//     even++;
//     }
//     else{
//        odd++;
//     }
//   }
//   System.out.println("no of odd :" + odd );
//   System.out.println("no of even :" + even );
    
// }
// }


//array mein kisi given number ko search karo 
//   Scanner sc =new Scanner(System.in);
//   int size = sc.nextInt();
//   int num[] = new int[size];
//   //loop
//    for(int i=0; i<num.length; i++){
//     num[i] = sc.nextInt();
//   }

//    int no=sc.nextInt();;
//    for(int i=0; i<num.length; i++){
//    if(num[i]==no){
//     System.out.println("position of the number:" + i);
//    }
//   }



// reverse the array
// Scanner sc = new Scanner(System.in);
// int size =sc.nextInt();
// int num[]=new int[size];
// for(int i=0; i<num.length; i++){
//     num[i] =sc.nextInt();
// }
 
// //in java , array index starts at zero
// for(int i=num.length - 1; i>=0; i--){
// System.out.println(num[i]);
// }
//  }
// }

//find the second largest element in an array
//    Scanner sc = new Scanner(System.in);
//    int size = sc.nextInt();
//    int num[] = new int[size];
//    for(int i=0; i<num.length; i++){
//     num[i] =sc.nextInt();
//    } 
//      int max = 0;
//      int secondmax = 0;
//    for(int i=0; i<num.length; i++){
//        //secondmax = old max 
//     if(num[i]> max){
//        secondmax =max;
//         max = num[i] ;
//     }
//   }
//    System.out.println(secondmax); 



// count the numbers of positive and negative elsements in an array
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int num[] =new int[size];
// //loop 
// for (int i=0; i<num.length; i++){
//     num[i] =sc.nextInt();
// }
//       int negative = 0;
//       int positive = 0;


// for(int i=0; i<num.length; i++){
//     if( num[i]>0){
//         positive ++;
//     }
//     else{
//             negative ++;
//         }

//     }
//  System.out.println("number of negative numbers :" + negative);
//  System.out.println("number of positive numbers :"+ positive);



//find the frequency of a given element in an array
// Scanner sc =new Scanner(System.in);
// int size =sc.nextInt();
// int num[] = new int[size];

// for (int i=0; i<num.length; i++){
//     num[i] = sc.nextInt();
//   }  
// int no = sc.nextInt();
//  int count = 0;
//   for(int i=0; i<num.length; i++){
//     if(no == num[i]){
//     count++;
//     }
// }
// System.out.println(count);




// find and print the duplicate numbers in the array.
//  Scanner sc =new Scanner(System.in);
//  int size = sc.nextInt();
//  int num[] = new int[size];

//   for(int i=0; i<num.length; i++){
//     num[i] = sc.nextInt();
//    }
//     int no= 0;
//      for(int i=0; i<num.length-1; i++){
//        for(int j=i+1; j<num.length; j++){
//         if (num[i] == num[j]){
//                 no = num[i];
//          }
  
//        }
//       }
//System.out.println(no);



   
     
    //sort the elements of an array in a ascending order 
//     int arr[] = {5 , 6 , 3 ,4, 1};         
//           for(int i=0; i<arr.length-1;i++){
//             for(int j=0; j<arr.length-i-1; j++){
//               if (arr[j]> arr[j+1]){
//                 int tem = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = tem;
//               }
//             }

//           }
//           printArray(arr);
//    } 
     
  
       
  

 
//  public static void printArray(int []arr){
//    for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] + " ");
//   }





 //  Add a corresponding elements of two array and store in an third array
//    Scanner sc =new Scanner(System.in);
//    int arr1[] = {1,3,4,5};
//    int arr2[] = {1,2,3,4};
//    int size = arr1.length;; 
//    int arr3[] = new int[size];
//    for(int i=0; i<arr1.length; i++){
//       arr3[i] = arr1[i] + arr2[i];
    
//     System.out.print(arr3[i]+ " ");
    
//   }
 
 
//sort an array in ascending order
// int arr[] ={ 9 ,7,5,3};
//      for(int i=0; i<arr.length-1;i++){ //4 elements → 3 passes
//           for(int j =0; j<arr.length-i-1; j++){
//              if(arr[j]> arr[j+1]){
//                 int tem = arr[j] ;
//                 arr[j] = arr[j+1];
//                  arr[j+1] = tem;
//             }
//        }
//     }
//     printArray(arr);
//   }
// i < 4 - 1 // arr.length =4
// i < 3

//find the positions(indices) of the largest and smallest elements in an array.
//     int arr[] = {1,2,5,6,7};
//         int smallest = arr[0];
//         int largest = arr[0];
//         int t= 0;
//         int p = 0;
//         for(int i=0; i<arr.length; i++){  
//             if(smallest>arr[i]){
//                 smallest = arr[i];
//                 s = i;
//             }
//              if (largest < arr[i]){
//                 largest = arr[i];
//                 l = i;
//             }
//         }
// System.out.println("smallest number idices\n" + p);
// System.out.println("largest number indices\n" + t);



    //Remove all duplicate elements from an array
 
    // int no= 0; 
   
    //  int arr[] = {1 ,2 ,3 ,3, 2,5, 6};
    //   int n = arr.length;
    // for(int i=0; i<n; i++){
    //     for(int j =i+1; j<n-1; j++){
    //         if( arr[i] == arr[j]){
    //          for(int k = j; k < n -1 ;k++ )
    //             arr[k] =  arr[k+1];
    //           n--;
    //           j--;
    //         }  
        
    //     }
    // }

    // for(int i = 0; i<n; i++){
    //  System.out.println(arr[i]);
  
    // }
  
   
//    //rotate an array to left by one position
//    int arr[] = {10 , 20 ,30 ,40 ,45}; //{20,30,40,45,10}
//    int n = arr.length;
//   int tem = arr[0];
//     for(int i = 0; i<arr.length-1; i++){
//         arr[i] = arr[i+1];

//     }
//     //first ko last me 
//     arr[n-1] = tem;
//    for(int i=0; i<arr.length; i++){
// System.out.println(arr[i]);
//    }


// //rotate an array to right by one position
//      int arr[] = {10 , 20 ,30 ,40 ,45}; //{20,30,40,45,10}
    
//     int n =arr.length;
//      int tem = arr[n-1];
     
//      for(int i= 0; i<arr.length-1; i++){
//       arr[i+1] = arr[i];
//      }
//      arr[0] = tem;
    
//     for(int i=0; i<n; i++){
//         System.out.println(arr[i]);
//     }
//   }
// }

  

  