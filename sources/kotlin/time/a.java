package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends TimeMark, Comparable {

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C1072a {
        public static int a(a aVar, a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return b.i(aVar.b(other), b.f93560c.c());
        }
    }

    long b(a aVar);
}
