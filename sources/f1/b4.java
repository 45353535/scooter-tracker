package f1;

import f1.c3;
import g1.a;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b4 f69429a = new b4();

    public Object a(String str, y base64Wrapper, Function2 onLoadFailure) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(onLoadFailure, "onLoadFailure");
        String str2 = null;
        if (str != null) {
            String strB = base64Wrapper.b(str);
            if (strB.length() == 0) {
                eg.j("Cannot decode provided bidResponse.", null, 2, null);
                onLoadFailure.invoke("", a.b.f72129q);
                Result.Companion companion = Result.f93230c;
                return Result.b(kotlin.d.a(c3.a.f69507b));
            }
            str2 = strB;
        }
        return Result.b(str2);
    }
}
