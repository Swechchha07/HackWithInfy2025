import java.util.*;
public class DIStringMatch{
    public static void main(String[] args) {
        String s="DDI";
        int n=s.length();
        int low=0;
        int high=n;
        int[] result=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                result[i]=low++;
            }else{
                result[i]=high--;
            }
        }
        result[n]=low;
        System.out.println(Arrays.toString(result));
    }
    
}