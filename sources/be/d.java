package be;

import io.bidmachine.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static boolean a(e eVar, Object obj) {
        return eVar.m(obj, false);
    }

    public static Boolean b(e eVar, Object obj) {
        return eVar.o(obj, Boolean.FALSE);
    }

    public static float c(e eVar, Object obj) {
        return eVar.b(obj, 0.0f);
    }

    public static Float d(e eVar, Object obj) {
        return eVar.a(obj, null);
    }

    public static int e(e eVar, Object obj) {
        return eVar.g(obj, 0);
    }

    public static Integer f(e eVar, Object obj) {
        return eVar.e(obj, null);
    }

    public static Object g(e eVar, Object obj) {
        return eVar.k(obj, null);
    }

    public static Object h(e eVar, Object obj, Function function) {
        return eVar.i(obj, null, function);
    }

    public static Object i(e eVar, Object obj, Object obj2, Function function) {
        try {
            Object objK = eVar.k(obj, obj2);
            if (objK == null) {
                return null;
            }
            return function.apply(objK);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static String j(e eVar, Object obj) {
        return eVar.j(obj, null);
    }
}
