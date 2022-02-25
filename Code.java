import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int length=game.length;
      
        //System.out.println(length);
        boolean flag=false;
       
      for(int i=0;i<length;)  
       {
           int count=0;
            if(i+leap<=length-1 && game[i+leap]==0)
            {
                count++;
                //System.out.println(2);
                i=i+leap;
                 game[i]=1;
              
            }
            
            else if(i+1<=length-1 && game[i+1]==0 )
            {
                
                count++;
                //System.out.println(3);
                 i=i+1;
                 game[i]=1;
              
            }
            else {
            if (i!=0 && game[i-1]==0)
                {  
                   // System.out.println(4);
                    count++;
                    i=i-1;
                    game[i]=1;
                }
            }  
             if(i==length || i+leap>length-1)
            {
               
               // System.out.println(1);
                flag=true;
                break;
            }
           if(count==0)
               {
                   //System.out.println("a");
                   flag=false;
                   break;
               }
            }
            
        
        //System.out.println(flag);
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
