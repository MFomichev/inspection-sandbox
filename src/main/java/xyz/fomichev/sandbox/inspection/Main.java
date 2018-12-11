package xyz.fomichev.sandbox.inspection;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "2");
        System.out.println(map.containsKey("2"));
    }

}
