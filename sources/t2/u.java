package t2;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f104922a = new u();

    public enum a {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f104928b;

        a(String str) {
            this.f104928b = str;
        }

        public final String g() {
            return this.f104928b;
        }
    }

    public enum b {
        INAPP("inapp"),
        SUBS("subs");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f104932b;

        b(String str) {
            this.f104932b = str;
        }

        public final String g() {
            return this.f104932b;
        }
    }

    private u() {
    }

    public static final Class a(String className) {
        if (e3.a.d(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, u.class);
            return null;
        }
    }

    public static final Class b(Context context, String className) {
        if (e3.a.d(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, u.class);
            return null;
        }
    }

    public static final Method c(Class clazz, String methodName, Class... args) {
        if (e3.a.d(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, u.class);
            return null;
        }
    }

    public static final Method d(Class clazz, String methodName, Class... args) {
        if (e3.a.d(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, u.class);
            return null;
        }
    }

    public static final Object e(Class clazz, Method method, Object obj, Object... args) {
        if (e3.a.d(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, u.class);
            return null;
        }
    }
}
