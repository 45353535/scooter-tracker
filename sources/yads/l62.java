package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class l62 extends f92 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l62 f112983b = new l62();

    private Object readResolve() {
        return f112983b;
    }

    @Override // yads.f92
    public final f92 a() {
        return eo2.f110429b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
