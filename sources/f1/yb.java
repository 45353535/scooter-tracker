package f1;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class yb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f71636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f71637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r2 f71638d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yb f71635a = new yb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f71639e = "not available";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f71640f = "not available";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f71641g = "not available";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f71642h = "not available";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f71643i = "not available";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f71644j = "not available";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f71645k = "not available";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f71646l = "not available";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f71647m = "unknown";

    public final String a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager != null && packageName != null) {
                PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            }
            return null;
        } catch (Exception e10) {
            eg.j("Exception while retrieving appVersion: " + e10.getMessage(), null, 2, null);
            return null;
        }
    }

    public final void b() {
        if (f71636b) {
            return;
        }
        eg.j("EnvironmentManager not initialized. Call init() first.", null, 2, null);
    }

    public final void c(Application app, r2 dm) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dm, "dm");
        if (f71636b) {
            return;
        }
        f71637c = app;
        f71638d = dm;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            f71639e = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            f71640f = MODEL;
            f71641g = "Android " + Build.VERSION.RELEASE;
            f71642h = p() ? "Amazon" : "Android";
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            f71643i = country;
            String strO = o();
            if (strO == null) {
                strO = "Cannot retrieve language";
            }
            f71644j = strO;
            f71646l = g3.a();
            String strA = a(app);
            if (strA == null) {
                strA = "Unknown version";
            }
            f71645k = strA;
        } catch (Exception e10) {
            eg.i("Failed to initialize EnvironmentManager", e10);
        }
        f71636b = true;
    }

    public final String d() {
        b();
        return f71645k;
    }

    public final Application e() {
        return f71637c;
    }

    public final String f() {
        b();
        return f71643i;
    }

    public final String g() {
        b();
        return f71647m;
    }

    public final String h() {
        b();
        return f71644j;
    }

    public final String i() {
        b();
        return f71639e;
    }

    public final String j() {
        b();
        return f71640f;
    }

    public final String k() {
        b();
        return f71641g;
    }

    public final String l() {
        b();
        return f71642h;
    }

    public final String m() {
        b();
        return f71646l;
    }

    public final r2 n() {
        b();
        return f71638d;
    }

    public final String o() {
        if (Build.VERSION.SDK_INT < 24) {
            return Locale.getDefault().getLanguage();
        }
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e10) {
            eg.d("Cannot retrieve language", e10);
            return null;
        }
    }

    public final boolean p() {
        return StringsKt.N("Amazon", Build.MANUFACTURER, true);
    }

    public final boolean q() {
        return f71636b;
    }
}
