public class Q3 {
    public static void main(String[] args) {
        //set the ith bit4
        System.out.println(set_bit(5,1));

    }

    public static int set_bit(int num ,int i){
        return num | (1<<i);
    }
}
