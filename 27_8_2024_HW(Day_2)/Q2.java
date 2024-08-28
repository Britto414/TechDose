public class Q2 {

    public static void main(String[] args) {
        // check if ith bit is set or not
        System.out.println(check_bit(2, 1));
    }

    public static boolean check_bit(int num,int i){
        return (num & (1<<i)) > 0 ;
    }
}