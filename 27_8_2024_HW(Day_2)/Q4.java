public class Q4 {
    public static void main(String[] args) {
        //unset the ith bit
        System.out.println(unset_bit(1, 0));

    }
    public static int unset_bit(int num,int i){
        return num & (~(1<<i));
    }
}
