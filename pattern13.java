class Solution {
    public void pattern13(int n) {
        int counter=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
            }
            System.out.println();
        }

    }
}