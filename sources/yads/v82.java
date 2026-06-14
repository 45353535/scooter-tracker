package yads;

import android.app.Activity;
import android.os.Build;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v82 {
    public static s82 a(Activity activity, w1 w1Var) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Build.VERSION.SDK_INT >= 33 ? new u82(activity, w1Var) : new t82());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
            objB = new t82();
        }
        return (s82) objB;
    }
}
