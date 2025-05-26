package src.dsa;

public class TrappingRainWaterOptimized {
    public static int trap(int[] h) {
        int n = h.length;
        int l = 0;
        int r = n-1;
        int l_max = 0; int r_max = 0;
        int ans = 0;
        while(l<r){
            if(h[l] > l_max){
                l_max = Math.max(l_max,h[l]);
            }

            if(h[r] > r_max){
                r_max = Math.max(r_max,h[r]);
            }

            if(h[l] < h[r]){
                ans += l_max - h[l];
                l++;
            }
            else{
                ans += r_max - h[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height)); // Output: 6
    }
}
