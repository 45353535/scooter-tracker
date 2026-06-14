package pd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v {
    public static void a(w wVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public static void b(w wVar) {
        try {
            wVar.onRun();
        } catch (Throwable th2) {
            try {
                wVar.c(th2);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }
}
