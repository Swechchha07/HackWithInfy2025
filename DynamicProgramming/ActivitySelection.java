import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        int[][] activities = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt(); 
            activities[i][1] = sc.nextInt(); 
        }
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEndTime = 0;

        for (int i = 0; i < n; i++) {
            int start = activities[i][0];
            int end = activities[i][1];

            if (start >= lastEndTime) {
                count++;
                lastEndTime = end;
            }
        }

        System.out.println(count);
    }
}
