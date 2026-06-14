package pd;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final Object a(Class cls, String methodName, Class[] parameterTypes, Object[] parameterObjects, Object obj) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterObjects, "parameterObjects");
        try {
            return c(cls, methodName, parameterTypes, parameterObjects, obj);
        } catch (Throwable unused) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return a(superclass, methodName, parameterTypes, parameterObjects, obj);
            }
            return null;
        }
    }

    public static final Object b(Object obj, String methodName, Class[] parameterTypes, Object[] parameterObjects) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterObjects, "parameterObjects");
        return a(obj.getClass(), methodName, parameterTypes, parameterObjects, obj);
    }

    public static final Object c(Class cls, String methodName, Class[] parameterTypes, Object[] parameterObjects, Object obj) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterObjects, "parameterObjects");
        Method declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, Arrays.copyOf(parameterObjects, parameterObjects.length));
    }
}
