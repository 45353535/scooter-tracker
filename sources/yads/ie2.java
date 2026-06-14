package yads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ie2 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return x13.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return x13.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(he2.a("negative size: ", i11));
    }

    public static void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i10, int i11) {
        String strA;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strA = x13.a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
            } else if (i11 >= 0) {
                strA = x13.a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(he2.a("negative size: ", i11));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void a(int i10, int i11, int i12) {
        String strA;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strA = a(i10, i12, "start index");
            } else if (i11 >= 0 && i11 <= i12) {
                strA = x13.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                strA = a(i11, i12, "end index");
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
