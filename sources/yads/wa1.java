package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nt1 f117369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f117371c;

    static {
        nt1 nt1Var = nt1.f114026b;
        f117369a = mt1.a();
        f117370b = "YandexAds";
        f117371c = true;
    }

    public static String a(String str) {
        return "[Integration] " + str;
    }

    public static final void b(String str, Object... objArr) {
        boolean z10;
        if (!f117371c) {
            synchronized (qs1.f115144a) {
                z10 = qs1.f115145b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f117371c) {
            Log.i(f117370b, strA);
        }
        if (qs1.f115145b) {
            f117369a.a(ps1.f114758b, f117370b, strA);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z10;
        if (!f117371c) {
            synchronized (qs1.f115144a) {
                z10 = qs1.f115145b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f117371c) {
            Log.w(f117370b, strA);
        }
        if (qs1.f115145b) {
            f117369a.a(ps1.f114759c, f117370b, strA);
        }
    }

    public static final void a(String str, Object... objArr) {
        boolean z10;
        if (!f117371c) {
            synchronized (qs1.f115144a) {
                z10 = qs1.f115145b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f117371c) {
            Log.e(f117370b, strA);
        }
        if (qs1.f115145b) {
            f117369a.a(ps1.f114760d, f117370b, strA);
        }
    }
}
