import java.util.*;

public class Problem6_BuyTwoChocolates {
    public static void main(String[] args){
        int[] prices={3,2,3};
        int money=3;
        int minCost=Integer.MAX_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cost=prices[i]+prices[j];
                if(cost<=money){
                    minCost=Math.min(minCost,cost);
                }
            }
        }
        int result;
        if(minCost==Integer.MAX_VALUE){
            result= money;
        }else{
            result= money-minCost;
        }
        System.out.println(result);
    }
}
