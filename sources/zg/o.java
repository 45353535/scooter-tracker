package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f119459c = new o();

    private o() {
    }

    public final void c(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    public final char[] d() {
        return super.b(16384);
    }
}
