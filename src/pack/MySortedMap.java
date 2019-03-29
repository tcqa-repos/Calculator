package pack;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;

public abstract class MySortedMap implements SortedMap {

    @Nullable
    @Override
    public Comparator comparator() {
        Collections.sort(Arrays.asList(new Object[]{"aaa"}), new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        return null;
    }
}