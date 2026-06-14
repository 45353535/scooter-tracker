package be;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static boolean a(c cVar, Object obj, boolean z10) {
        Boolean boolI = cVar.i(obj);
        return boolI != null ? boolI.booleanValue() : z10;
    }

    public static Boolean b(c cVar, Object obj) {
        return cVar.h(obj, null);
    }

    public static Double c(c cVar, Object obj) {
        return cVar.m(obj, null);
    }

    public static float d(c cVar, Object obj, float f10) {
        Float fD = cVar.d(obj);
        return fD != null ? fD.floatValue() : f10;
    }

    public static Float e(c cVar, Object obj) {
        return cVar.l(obj, null);
    }

    public static int f(c cVar, Object obj, int i10) {
        Integer numB = cVar.b(obj);
        return numB != null ? numB.intValue() : i10;
    }

    public static Integer g(c cVar, Object obj) {
        return cVar.k(obj, null);
    }

    public static String h(c cVar, Object obj) {
        return cVar.f(obj, null);
    }
}
