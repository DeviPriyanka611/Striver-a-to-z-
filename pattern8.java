class Solution {
    public void pattern8(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int y=0; y<2*n-2*i-1; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}