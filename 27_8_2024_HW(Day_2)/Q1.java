
public class Q1 {

    public static void main(String[] args) {
        //how many set bits are there
        for(int i=1;i<32;i++){
            System.out.println("The setbits of "+i +" is " +Count_SetBits(i));
        }
    }

    public static int Count_SetBits(int n){
        int count=0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}