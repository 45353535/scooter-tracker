package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f62109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f62110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f62111c;

    static {
        try {
            f62109a = Class.class.getDeclaredMethod("forName", String.class);
            f62110b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f62111c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field fieldA = a(cls, str);
            if (fieldA != null) {
                fieldA.setAccessible(true);
                return fieldA.get(obj);
            }
        } catch (Throwable unused) {
        }
        return obj2;
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) f62111c.invoke(cls, str);
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return field;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) f62110b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return method;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a() {
        return (f62109a == null || f62110b == null || f62111c == null) ? false : true;
    }
}
