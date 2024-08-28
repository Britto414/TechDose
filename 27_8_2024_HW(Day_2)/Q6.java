public class Q6 {
    public static void main(String[] args) {
        for(int i=0;i<26;i++){
            System.out.println((char)(i+65) + "--> " + tolower((char)(i+65)) +" --> "+toupper((char)(i+65)));
        }
    }

    public static char tolower(char ch){
        return (char)(ch | (1<<5));
    }

    public static char toupper(char ch){
        return (char)(ch & (~(1<<5)));
    }
}
