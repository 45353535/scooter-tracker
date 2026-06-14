package ve;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final Charset a(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        g gVarC = c(wVar);
        if (gVarC != null) {
            return h.a(gVarC);
        }
        return null;
    }

    public static final Long b(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String str = wVar.getHeaders().get(u.f106718a.g());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final g c(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String str = wVar.getHeaders().get(u.f106718a.i());
        if (str != null) {
            return g.f106625f.b(str);
        }
        return null;
    }

    public static final g d(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String strJ = xVar.getHeaders().j(u.f106718a.i());
        if (strJ != null) {
            return g.f106625f.b(strJ);
        }
        return null;
    }

    public static final void e(x xVar, g type) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        xVar.getHeaders().m(u.f106718a.i(), type.toString());
    }
}
