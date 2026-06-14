package sh;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f104714d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f104715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f104716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f104717c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        private a() {
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f104715a = method;
        this.f104716b = method2;
        this.f104717c = method3;
    }

    public final Object a(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f104715a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f104716b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f104717c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
