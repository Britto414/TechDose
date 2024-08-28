import java.util.ArrayList;
import java.util.List;

public class Q5 {

    public static void main(String[] args) {
        //generate all possible subsets of array
        char[] ch1 = {'a','b','c'};
        char[] ch2 = {'a','b','c','d'};
        char[] ch3 = {'x','y','z'};
        System.out.println(Subsets(ch1));
        System.out.println(Subsets(ch2));
        System.out.println(Subsets(ch3));
        

    }

    public static List<List<Character>> Subsets(char[] ch){
        List<List<Character> > Subsets = new ArrayList<>();
        for(int i=0;i<(1<<ch.length);i++){
            List<Character> set = new ArrayList<>();
            for(int j=0;j<ch.length;j++){
                int val = i & (1<<j);
                if(val >0){
                    set.add(ch[j]);
                }

            }
            Subsets.add(set);
        }
        return Subsets;
    }
}