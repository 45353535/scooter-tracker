package qg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final a a(byte... bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return bytes.length == 0 ? a.f99122d.a() : a.f99122d.b(bytes);
    }

    public static final String b(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return StringsKt.F(aVar.e());
    }

    public static final boolean c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.f() == 0;
    }
}
