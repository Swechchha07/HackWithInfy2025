import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class MinCoinByGreedy {
    public static void main(String[] args) {
        Integer[] d={1,5,6,9};
        int amount=11;
        int sum=0;
        int count=0;
        Arrays.sort(d,Collections.reverseOrder());
        for(int i=0;i<=d.length;i++){
            while(sum<amount){
                sum+=d[i];
                count++;
            }
            if(sum==amount){
                break;
            }
            sum-=d[i];
            count--;
        }
        System.out.println("Min coins required:"+count);
    }
}
