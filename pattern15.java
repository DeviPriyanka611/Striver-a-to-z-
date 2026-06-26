class Solution {
    public void pattern15(int n) {
        for(char i='E',i>='A',i--){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}