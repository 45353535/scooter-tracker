package re;

import kotlin.jvm.internal.Intrinsics;
import ve.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final void a(x xVar, String key, Object obj) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            xVar.getHeaders().e(key, obj.toString());
        }
    }
}
