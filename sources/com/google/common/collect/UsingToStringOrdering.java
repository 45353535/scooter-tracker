package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final UsingToStringOrdering f30427b = new UsingToStringOrdering();

    private UsingToStringOrdering() {
    }

    private Object readResolve() {
        return f30427b;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
