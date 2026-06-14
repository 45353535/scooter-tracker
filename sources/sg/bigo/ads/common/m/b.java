package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f102549a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102550b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f102551c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f102552d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f102553e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f102554f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (q.a((CharSequence) str)) {
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprManager", "Listener SharedPreferenceChanged, key: ".concat(String.valueOf(str)));
            str.getClass();
            switch (str) {
                case "IABTCF_PurposeConsents":
                    b.a(sharedPreferences);
                    break;
                case "IABTCF_PurposeLegitimateInterests":
                    b.c(sharedPreferences);
                    break;
                case "IABTCF_gdprApplies":
                    b.b(sharedPreferences);
                    break;
                case "IABTCF_TCString":
                    b.d(sharedPreferences);
                    break;
                default:
                    return;
            }
            b.h();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f102555g;

    public static void a(@NonNull Context context) {
        f102555g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f102554f);
    }

    public static String b() {
        if (q.a((CharSequence) f102549a) && a()) {
            f102549a = sg.bigo.ads.common.x.a.e(f102555g.getPackageName());
        }
        return f102549a;
    }

    public static int c() {
        if (f102555g == null || !sg.bigo.ads.common.x.b.a()) {
            return f102550b;
        }
        f102550b = e(f102555g) ? sg.bigo.ads.common.x.a.g(f102555g.getPackageName()) : -1;
        return f102550b;
    }

    public static String d() {
        if (q.a((CharSequence) f102551c) && a()) {
            f102551c = sg.bigo.ads.common.x.a.h(f102555g.getPackageName());
        }
        return f102551c;
    }

    public static String e() {
        if (q.a((CharSequence) f102552d) && a()) {
            f102552d = sg.bigo.ads.common.x.a.f(f102555g.getPackageName());
        }
        return f102552d;
    }

    public static boolean f() {
        return f102553e;
    }

    public static void g() {
        f102553e = false;
    }

    static /* synthetic */ boolean h() {
        f102553e = true;
        return true;
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f102549a = sharedPreferences.getString(com.taurusx.tax.g.q.f66283m, "");
        } catch (Exception unused) {
            f102549a = "";
        }
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f102549a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f102550b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f102551c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", "IABTCF_gdprApplies");
    }

    public static boolean a() {
        return f102555g != null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            f102550b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                f102550b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                f102550b = 0;
            }
        }
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f102551c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            f102551c = "";
        }
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f102552d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            f102552d = "";
        }
    }
}
