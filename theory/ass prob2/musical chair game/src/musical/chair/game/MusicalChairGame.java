
package musical.chair.game;
import java.sql.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MusicalChairGame {
    
    public static void main(String[] args) {

        String []p = {"a","b","c","d","e","f","g"}; 

        musicGame (p);

    }


    public static void musicGame ( String []p){
   
        int RN = 0;
        int n =p.length;

        while(n!=1){

            if(RN==1){

                String[] copy = new String[p.length - 1];

                  for (int i = 0, j = 0; i < p.length; i++) {

                    if (i != n/2) {
                      copy[j++] = p[i];
                    }

                  }

              p=copy;   
              System.out.println(Arrays.toString(p));   
              n=n-1 ;
              }

             p=rotateClockwise(p);
             RN= ThreadLocalRandom.current().nextInt(0,4);
            }

            System.out.println("Winner is  "+Arrays.toString(p));

    }
 
 
 

    public static String [] rotateClockwise(String []a){
        String temp = a[a.length-1];

        for (int i=a.length-2 ; i>=0 ;i--){
            a[i+1] = a[i];
        }
        a[0]= temp;

        return a;
    }



    }