package hf;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final byte[] a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return t.c(sVar);
    }

    public static final String b(s sVar, Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.areEqual(charset, Charsets.UTF_8) ? i10 == Integer.MAX_VALUE ? u.c(sVar) : u.d(sVar, Math.min(sVar.getBuffer().s(), i10)) : gf.b.a(charset.newDecoder(), sVar, i10);
    }

    public static /* synthetic */ String c(s sVar, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return b(sVar, charset, i10);
    }

    public static final byte[] d(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.areEqual(charset, Charsets.UTF_8) ? StringsKt.K(str, 0, 0, true, 3, null) : gf.a.c(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ byte[] e(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return d(str, charset);
    }
}
