package bg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static boolean a(c cVar, Comparable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(cVar.getStart()) >= 0 && value.compareTo(cVar.getEndInclusive()) <= 0;
        }

        public static boolean b(c cVar) {
            return cVar.getStart().compareTo(cVar.getEndInclusive()) > 0;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
