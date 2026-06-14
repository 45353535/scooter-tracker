package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class eo2 extends f92 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eo2 f110429b = new eo2();

    private Object readResolve() {
        return f110429b;
    }

    @Override // yads.f92
    public final f92 a() {
        return l62.f112983b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
