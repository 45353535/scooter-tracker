package hf;

import kotlin.jvm.internal.Intrinsics;
import pg.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final byte[] a(pg.a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return t.d(aVar, i10);
    }

    public static /* synthetic */ byte[] b(pg.a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = (int) aVar.s();
        }
        return a(aVar, i10);
    }
}
