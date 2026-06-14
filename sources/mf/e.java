package mf;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static Comparator b(final Function1... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: mf.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return e.c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(Function1[] function1Arr, Object obj, Object obj2) {
        return f(obj, obj2, function1Arr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int e(Object obj, Object obj2, Function1... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return f(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int f(Object obj, Object obj2, Function1[] function1Arr) {
        for (Function1 function1 : function1Arr) {
            int iD = d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    public static Comparator g() {
        h hVar = h.f94872b;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return hVar;
    }

    public static Comparator h() {
        i iVar = i.f94873b;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return iVar;
    }
}
