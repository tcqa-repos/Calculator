package pack;

import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.SortedMap;

public abstract class MySortedMap implements SortedMap {

    @Nullable
    @Override
    public Comparator comparator() {
        return null;
    }
}