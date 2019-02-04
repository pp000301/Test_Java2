package generics;

public final class PairUtil {

    public PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }

    public static final <T> T[] repeat(int n, T... objs){
        T result=new <T>;
        //return  int [] result={1,2};
    }

}
