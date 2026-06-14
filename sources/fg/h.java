package fg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f72034a;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        byte b10 = 0;
        byte b11 = 0;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new f(a(Looper.getMainLooper(), true), b11 == true ? 1 : 0, 2, b10 == true ? 1 : 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        f72034a = (g) (Result.i(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final g b(Handler handler, String str) {
        return new f(handler, str);
    }
}
