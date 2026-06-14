package pd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {
    public static void a(u uVar, Object obj) {
        try {
            uVar.a(obj);
        } catch (Throwable th2) {
            try {
                uVar.c(th2);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(u uVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
