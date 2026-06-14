package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nt1 f109020a;

    static {
        nt1 nt1Var = nt1.f114026b;
        f109020a = mt1.a();
    }

    public static void a(String str, Object... objArr) {
        boolean z10;
        if (!lb1.f113032a) {
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
        if (lb1.f113032a) {
            Log.w("Yandex Mobile Ads", str2);
        }
        if (qs1.f115145b) {
            f109020a.a(ps1.f114759c, "Yandex Mobile Ads", str2);
        }
    }
}
