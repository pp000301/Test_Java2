package generics.hw;

public final class PairUtil {

    public PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }



}
