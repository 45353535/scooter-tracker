package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {
    public static final a1 a(kotlinx.serialization.json.b json, a0 reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return !json.e().a() ? new a1(reader, buffer) : new c1(reader, buffer);
    }

    public static /* synthetic */ a1 b(kotlinx.serialization.json.b bVar, a0 a0Var, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = o.f119459c.d();
        }
        return a(bVar, a0Var, cArr);
    }
}
