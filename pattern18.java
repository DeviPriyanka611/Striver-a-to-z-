class Solution {
    public void pattern18(int n) {
        for(int i=0;i<n;i++){
            char k=(char)('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
}