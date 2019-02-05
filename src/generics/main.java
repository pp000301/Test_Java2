package generics;

import generics.hw.Pair1;

public class main {
    public static void main(String[] args) {
        //Pair<String, Integer> hdghd = PairUtil.swap(new Pair<>(2, "hdghd"));
        Pair1<String> pair1 = new Pair1<>("3","6");
        System.out.println(pair1.getMin());

    }
}
