package yads;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f117810a = new s1();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f117810a.getClass();
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, ft1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
