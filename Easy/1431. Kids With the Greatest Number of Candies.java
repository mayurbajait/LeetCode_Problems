/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean [] kidsWithCandies(int[] candies, int extraCandies) {
    // boolean flag = true;
    boolean arr [] = new boolean [candies.length];
    int max = candies[0];    
    for(int i = 0; i < candies.length; i++){
        max = Math.max(max, candies[i]);
    }
    
    for(int i = 0; i < candies.length; i++){
        int sum = extraCandies + candies[i];
        if(max <=sum){
            arr[i] = true;
        }
        else arr[i]=false;
        
    }

    return arr;
    }
    
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int can[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            can[i] = sc.nextInt();
        }
        int extra = sc.nextInt();
      boolean []ans = new boolean[N];
          ans = kidsWithCandies(can, extra);
          for(int i = 0 ; i < N;i++)
          System.out.print(ans[i] + " ");
    }
}
