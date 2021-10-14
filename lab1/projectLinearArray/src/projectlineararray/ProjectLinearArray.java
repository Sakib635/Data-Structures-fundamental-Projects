package projectlineararray;

import java.util.Arrays;

public class ProjectLinearArray {

    public static void main(String[] args) {
       int [] source= {10,20,30,40,50,60};
    
       int [] source2= {10,2,30,2,50,2,2,0,0};
       
       int [] source3={10, 3, 1, 2, 10}; //Splitting an Array
       
       int [] source4={2, 1, 1, 2, 1};
       
       int [] source5={1,1,2, 2, 1, 1,1,1}; // Max Bunch Count
       
       int [] source6={4,5,6,6,4,3,6,4}; //Repetition
       
       int [] source7={3,4,6,3,4,7,4,6,8,6,6}; //Repetition
       
       int [] Circular_array_1={20,10,0,0,0,10,20,30};     //Circular Array Palindrome
       int [] Circular_array_2={10,20,0,0,0,10,20,30};     //Circular Array Palindrome
       
       int [] Circular_array_3={40,50,0,0,0,10,20,30};     //Circular array - Task-2 - Intersection
       int [] Circular_array_4={10,20,5,0,0,0,0,0,5,40,15,25};     //Circular array - Task-2 - Intersection
    
    
    // All the methods are called below:
    System.out.println("Task1 : Shift Left k Cells");
    
    //Task-1 (Shift Left k Cells)
    int [] leftShiftedArray= shiftLeft(source,3);
    System.out.println(Arrays.toString(leftShiftedArray));
    
   System.out.println("\nTask2 : Rotate Left k cells");
    
     //Task-2 (Rotate Left k cells)
    int [] leftRotatedArray= rotateLeft(source,3);
    System.out.println(Arrays.toString(leftRotatedArray));
    
    System.out.println("\nTask3 : Remove an element from an array");
    
    //Task-3 (Remove an element from an array)
    int [] removeArray= remove(source,5,2);
    System.out.println(Arrays.toString(removeArray));
    
    System.out.println("\nTask4 : Remove all occurrences of a particular element from an array");
    
     //Task-4 (Remove all occurrences of a particular element from an array)
    int [] removeAllArray= removeAll(source2,7,2);
    System.out.println(Arrays.toString(removeAllArray));
    
    System.out.println("\nTask5 : Splitting an Array");
    
    //Task-5  (Splitting an Array)
        //checking true
            boolean a=   balance(source3);
            System.out.println(a);
        //checking false
            boolean b=   balance(source4);
            System.out.println(b);
      
            System.out.println("\nTask6 : Array series");
            
    //Task-6 (Array series)
        series(4);
        
    System.out.println("\nTask7 : Max Bunch Count");   
    
   //Task-7 (Max Bunch Count)
    int count=bunchCount(source5);
    System.out.println("The largest bunch contains "+count);
   
    System.out.println("\nTask8 : Repetition");
    
   //Task-8 (Repetition)
   boolean c= repeat(source6);
   System.out.println(c);
   
    boolean d= repeat(source7);
   System.out.println(d);
   
   System.out.println("\nCircular array -Task-1 : Palindrome");
   
   //Circular array -Task-1
   boolean aa=palindromeCheck(Circular_array_1,5,5);
  System.out.println(aa);
  
  boolean bb=palindromeCheck(Circular_array_2,5,5);
  System.out.println(bb);
  
   System.out.println("\nCircular array -Task-2 : Intersection");
   
   //Circular array -Task-2
    int [] IntersectionArray= Intersection(Circular_array_3,Circular_array_4,5,7,5,8);
    System.out.println(Arrays.toString(IntersectionArray));
    
    }
    
    //all methods are as follows;..............................
    
    //Task-1 
    public static int[] shiftLeft(int []p,int k){
    int[]s=p.clone();//copying elements of source to another array so that main array does not change
    for(int i=k,j=0;i<s.length;j++,i++){
      s[j]=s[i];
      s[i]=0;
  }   
     return s;
 }
 
 //Task-2
    public static int[] rotateLeft(int []p,int k){
    int[]s=p.clone();//copying elements of source to another array so that main array does not change
    for(int l=1;l<=k;l++){
        int temp= s[s.length-1]; // Storing the value of last index
                                                        //main array {10,20,30,40,50,60}
        for(int j=0;j<s.length-1;j++){                  //temp=60 {20,30,40,50,(50),10}
            int i=j-1;                                  //         0   1  2  3  4  5  
            if(i==-1){                                  //s[length-2]=temp; {20,30,40,50,60,10}
            i=s.length-1; // indicates last index  
         }                                               //temp=10 {30,40,50,60,(60),20}
         s[i]=s[j];                                      //          0  1  2  3  4  5
     }                                                   //s[length-2]=temp; {30,40,50,60,10,20}
     s[s.length-2]=temp;
     }
     
     return s;
 }
 
 //Task-3        
                         //remove( source, size, idx)
    public static int[] remove( int[]p,int n,int k){
    int[]s=p.clone();//copying elements of source to another array so that main array does not change
    for(int i=k;i<n;i++){
        s[i]=s[i+1];
        s[i+1]=0;
    }
    
 return s;
 }
 
 
 //Task-4            
                         //removeAll( source, size, element)
    public static int [] removeAll( int []p, int n, int element){
    int[]s=p.clone();//copying elements of source to another array so that main array does not change
    for (int j=0;j<n;j++){
        if(s[j]==element){
            for(int i=j;i<n;i++){////////////////////////////////
                s[i]=s[i+1];     //////// remove function ///////
                s[i+1]=0;       //////////////////////////////// 
            }
             j--;
         }
     }
     return s;
 }
 
 //Task-5-- Splitting an Array
    public static boolean balance(int[]p){
    int []s=p.clone();
    int []prefixSum=new int[s.length];                       // 0   1  2  3  4  /////
    prefixSum[0]=s[0];                    /////main array      {10, 3, 1, 2, 10}  ////
    for(int i=1;i<s.length;i++){          /////prefixSum array {10,13,14,16,26}   ////
        prefixSum[i]=prefixSum[i-1]+s[i]; ////////////////////////////////////////////
     }
     
     int sum=0;
     
     for (int i = s.length-1; i>=1; i--) {
         sum+=s[i];
         if (sum==prefixSum[i-1]) {
             return true;
         }
     }
  return false;   
 } 
    
//Task-6 -- Array series
    public static void series(int n){
    
    int a[]=new int [n*n];
    for (int i = 1; i <= n; i++) {
        for (int j = (i*n)-1,k=1;k<=i;k++, j--) {
            a[j]=k;
        }
    }
    System.out.println(Arrays.toString(a));

}
// n=3     1          2          3
// index 0 1(2)     3 4(5)     6 7(8)
//      {0,0,1      0,2,1      3,2,1}
// ------------    end Array series  -------------

//Task-7 -- Max Bunch Count
    public static int bunchCount(int[]p){
      int[]s=p.clone();//copying elements of source to another array so that main array does not change
      int lastValue=s[0];
      int ans=1,temp=1;
        for (int i = 1; i <s.length; i++) {
            if(s[i]==lastValue) {
                temp++;
            }else{
                lastValue=s[i];
                temp=1;
            }
            ans=Math.max(temp,ans);
        }
        return ans;
    }
    
//Task-8 -- Repetition
    public static boolean repeat(int s[]){
        int []freq=new int[100000];
        int []rept=new int[100000];
                                              ///  index                  element
        for (int i = 0; i <s.length; i++) {   /// kon value repeat hoise  koybar
            freq[s[i]]++;
        }
                                             
        for (int i = 0; i < 100000; i++) {   /// index                  element
           rept[freq[i]]++;                  /// koybar repeat hoise koyta value
        }
        
        for (int i = 2; i < 100000; i++) {
            if(rept[i]>1){
                return true;
            }
        }
        return false;
    }
    
    // //Circular Array- Task-1- Palindrome 
    public static boolean palindromeCheck(int c[], int start, int size){
        int n=c.length;
        for (int s=start,e=start+size-1;s<e;s++,e--) {
            int stIndex=s%n;
            int enIndex=e%n;
            if(c[stIndex]!=c[enIndex]){
                return false;
            }
        }
        return true;
    }
    
    //Circular array - Task-2 - Intersection
    public static int [] Intersection(int[] c1,int[]c2,int size1,int size2,int start1,int start2){
        int[] frequency =new int[100000];
        
        for (int s=start2;s<start2+size2;s++){
            frequency[c2[s%c2.length]]++;
        }
        
        int count=0;
        
        for(int s=start1;s<start1+size1;s++){
            if(frequency[c1[s%c1.length]]!=0){
                count++;
            }
        }
        
        int ans[]=new int[count];
        int i=0;
        
        for(int s=start1;s<start1+size1;s++){
            if(frequency[c1[s%c1.length]]!=0){
                ans[i]=c1[s%c1.length];
                i++;
            }
        }
        
      return ans;  
    }


}






