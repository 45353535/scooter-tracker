package ve;

import com.ironsource.D5;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final Charset a(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        String strC = mVar.c(D5.M);
        if (strC == null) {
            return null;
        }
        try {
            return gf.a.e(Charsets.f93464a, strC);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final g b(g gVar, Charset charset) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return gVar.h(D5.M, gf.a.g(charset));
    }
}
