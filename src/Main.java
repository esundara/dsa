import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        dataTypes(10);
    }

    public static void dataTypes(int n) {


        List list  = new ArrayList<String>();
        list.add("hi");

        System.out.println();

        List list2 = new LinkedList<Integer>();
        list2.add("100");
        System.out.println(list2.get(0));


        HashMap<String,Integer> h = new HashMap<>();
        HashMap<String,Integer> h2 = new HashMap<>();
        h.put("hello",new Integer(0));
        System.out.println(h2.get("hello"));

        }

    }
