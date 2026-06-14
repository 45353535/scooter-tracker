package fg;

import android.os.Build;
import eg.c0;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlin.coroutines.a implements c0 {

    @Nullable
    private volatile Object _preHandler;

    public b() {
        super(c0.J8);
        this._preHandler = this;
    }

    private final Method m() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // eg.c0
    public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 28) {
            return;
        }
        Method methodM = m();
        Object objInvoke = methodM != null ? methodM.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
    }
}
