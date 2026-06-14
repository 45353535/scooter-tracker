package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ImmutableMap f29466b;

    ExplicitOrdering(List list) {
        this(Maps.u(list));
    }

    private int g(Object obj) {
        Integer num = (Integer) this.f29466b.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.IncomparableValueException(obj);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t10, T t11) {
        return g(t10) - g(t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.f29466b.equals(((ExplicitOrdering) obj).f29466b);
        }
        return false;
    }

    public int hashCode() {
        return this.f29466b.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f29466b.keySet() + ")";
    }

    ExplicitOrdering(ImmutableMap immutableMap) {
        this.f29466b = immutableMap;
    }
}
