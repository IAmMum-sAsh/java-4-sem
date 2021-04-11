package pr1;

import java.util.ArrayList;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> aaa = new ArrayList();
        aaa.add("abc"); aaa.add("kot");

        Function<ArrayList<String>, ArrayList<String>> f = ArrayList -> {
            ArrayList bbb = new ArrayList();
            for (String a: aaa){
                StringBuffer buffer = new StringBuffer(a);
                bbb.add(buffer.reverse().toString());

            }
            return bbb;
        };

        System.out.println(f.apply(aaa));
    }

}