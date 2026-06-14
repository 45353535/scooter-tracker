package xh;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: xh.a$a, reason: collision with other inner class name */
    private static class C1334a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f108202a;

        public C1334a(Object obj) {
            this.f108202a = obj;
        }

        public Object a() {
            return this.f108202a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return a.d(method, this.f108202a.getClass().getClassLoader()).invoke(this.f108202a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!f()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return collection.contains(sb2.toString());
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1334a(obj);
    }

    public static Method d(Method method, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static Object e(InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C1334a) invocationHandler).a();
    }

    private static boolean f() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
