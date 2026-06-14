package ae;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static Object a(Class cls, String str, Object obj) {
        try {
            return d(cls, str, obj);
        } catch (Throwable unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str, obj);
        }
    }

    public static Object b(Object obj, String str) {
        return a(obj.getClass(), str, obj);
    }

    public static Object c(Object obj, String[] strArr) {
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            obj = b(obj, str);
            if (obj == null) {
                return null;
            }
        }
        return obj;
    }

    public static Object d(Class cls, String str, Object obj) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
