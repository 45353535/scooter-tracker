package sg.bigo.ads.common.x;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.taurusx.tax.g.q;
import java.util.UUID;
import sg.bigo.ads.common.x.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f103119a = "";

    public static void A() {
        b.a("sp_ads_encrypticon_ads_data_request", Boolean.FALSE, 4);
    }

    public static boolean B() {
        return ((Boolean) b.b("sp_ads_encryptreport_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void C() {
        b.a("sp_ads_encryptreport_request", Boolean.FALSE, 4);
    }

    public static boolean D() {
        return ((Boolean) b.b("sp_ads_encryptcallback_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void E() {
        b.a("sp_ads_encryptcallback_request", Boolean.FALSE, 4);
    }

    public static boolean F() {
        long jLongValue = ((Long) b.b("sp_gzip_server_fail", 0L, 1)).longValue();
        return 0 != jLongValue && Math.abs(System.currentTimeMillis() - jLongValue) < 14400000;
    }

    private static synchronized void G() {
        if (TextUtils.isEmpty(f103119a)) {
            f103119a = String.valueOf(UUID.randomUUID());
        }
    }

    public static int a() {
        return ((Integer) b.b("sp_cpu_core_num", 0, 0)).intValue();
    }

    public static long b() {
        return ((Long) b.b("sp_cpu_max_freq", 0L, 1)).longValue();
    }

    public static String c() {
        return (String) b.b("sp_user_agent", "", 3);
    }

    public static long d() {
        return ((Long) b.b("sp_user_agent_last_check_ts", 0L, 1)).longValue();
    }

    public static long e() {
        return ((Long) b.b("sp_fix_ts_diff", 0L, 1)).longValue();
    }

    public static String f(String str) {
        try {
            return (String) b.b(str + "_preferences", "IABTCF_TCString", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int g(String str) {
        try {
            return ((Integer) b.b(str + "_preferences", "IABTCF_gdprApplies", 0, 0)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String h() {
        return (String) b.b("sp_banner_js_downloaded_url", "", 3);
    }

    public static int i(@NonNull String str) {
        return ((Integer) b.b("impression_num_".concat(String.valueOf(str)), 0, 0)).intValue();
    }

    public static long j() {
        return ((Long) b.b("last_stat_cb_events_time", 0, 1)).longValue();
    }

    public static String k() {
        return (String) b.b("cb_event_count", "", 3);
    }

    public static int l() {
        return ((Integer) b.b("user_consent_gdpr", 0, 0)).intValue();
    }

    public static int m() {
        return ((Integer) b.b("consent_gdpr", 0, 0)).intValue();
    }

    public static int n() {
        return ((Integer) b.b("consent_ccpa", 0, 0)).intValue();
    }

    public static int o() {
        return ((Integer) b.b("consent_lgpd", 0, 0)).intValue();
    }

    public static int p() {
        return ((Integer) b.b("consent_coppa", 0, 0)).intValue();
    }

    public static boolean q() {
        return m() == 2 || n() == 2 || o() == 2 || p() == 2;
    }

    public static String r() {
        if (!TextUtils.isEmpty(f103119a)) {
            return f103119a;
        }
        String str = (String) b.b("sp_ads_tiny", "sp_ads_uuid", "", 3);
        f103119a = str;
        if (TextUtils.isEmpty(str)) {
            try {
                G();
                if (!TextUtils.isEmpty(f103119a)) {
                    b.a("sp_ads_tiny", "sp_ads_uuid", f103119a, 3);
                }
            } catch (Throwable unused) {
            }
        }
        return f103119a;
    }

    public static void s() {
        try {
            SharedPreferences.Editor editorB = b.b("sp_ads");
            editorB.clear();
            c.a.a();
            c.a.C1278a.a(editorB);
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "SharedPreferenceManager", Log.getStackTraceString(e10));
        }
    }

    public static boolean t() {
        return ((Boolean) b.b("sp_ads_encryptpost_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void u() {
        b.a("sp_ads_encryptpost_request", Boolean.FALSE, 4);
    }

    public static boolean v() {
        return ((Boolean) b.b("sp_ads_encryptsdkconfig_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void w() {
        b.a("sp_ads_encryptsdkconfig_request", Boolean.FALSE, 4);
    }

    public static boolean x() {
        return ((Boolean) b.b("sp_ads_encryptaddata_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void y() {
        b.a("sp_ads_encryptaddata_request", Boolean.FALSE, 4);
    }

    public static boolean z() {
        return ((Boolean) b.b("sp_ads_encrypticon_ads_data_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void a(int i10) {
        b.a("sp_cpu_core_num", Integer.valueOf(i10), 0);
    }

    public static void b(int i10) {
        b.a("user_consent_gdpr", Integer.valueOf(i10), 0);
    }

    public static void c(int i10) {
        b.a("consent_gdpr", Integer.valueOf(i10), 0);
    }

    public static void d(int i10) {
        b.a("consent_ccpa", Integer.valueOf(i10), 0);
    }

    public static String e(String str) {
        try {
            return (String) b.b(str + "_preferences", q.f66283m, "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void f() {
        b.a("sp_fix_ts_diff", 0L, 1);
    }

    public static String g() {
        return (String) b.b("sp_omid_service_downloaded_url", "", 3);
    }

    public static String h(String str) {
        try {
            return (String) b.b(str + "_preferences", "IABTCF_PurposeLegitimateInterests", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long i() {
        return ((Long) b.b("last_stat_init_time", 0, 1)).longValue();
    }

    public static void j(@NonNull String str) {
        long jLongValue = ((Long) b.b("last_impression_ts_".concat(String.valueOf(str)), 0, 1)).longValue();
        if (jLongValue <= 0 || DateUtils.isToday(jLongValue)) {
            return;
        }
        a(str, 0);
        a(str, 0L);
    }

    public static void a(long j10) {
        b.a("sp_cpu_max_freq", Long.valueOf(j10), 1);
    }

    public static void b(long j10) {
        b.a("sp_user_agent_last_check_ts", Long.valueOf(j10), 1);
    }

    public static void c(long j10) {
        b.a("last_stat_init_time", Long.valueOf(j10), 1);
    }

    public static void d(long j10) {
        b.a("last_stat_cb_events_time", Long.valueOf(j10), 1);
    }

    public static void e(int i10) {
        b.a("consent_lgpd", Integer.valueOf(i10), 0);
    }

    public static void f(int i10) {
        b.a("consent_coppa", Integer.valueOf(i10), 0);
    }

    public static void a(String str) {
        b.a("sp_user_agent", str, 3);
    }

    public static void b(String str) {
        b.a("sp_omid_service_downloaded_url", str, 3);
    }

    public static void c(String str) {
        b.a("sp_banner_js_downloaded_url", str, 3);
    }

    public static void d(String str) {
        b.a("cb_event_count", str, 3);
    }

    public static void e(long j10) {
        b.a("sp_gzip_server_fail", Long.valueOf(j10), 1);
    }

    public static void a(@NonNull String str, int i10) {
        b.a("impression_num_".concat(String.valueOf(str)), Integer.valueOf(i10), 0);
    }

    public static void a(@NonNull String str, long j10) {
        b.a("last_impression_ts_".concat(String.valueOf(str)), Long.valueOf(j10), 1);
    }

    public static void a(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences sharedPreferencesA = b.a(str + "_preferences");
        if (sharedPreferencesA != null) {
            sharedPreferencesA.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public static void a(boolean z10) {
        b(z10 ? 1 : 2);
    }

    public static boolean a(String str, String str2) {
        SharedPreferences sharedPreferencesA = b.a(str);
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.contains(str2);
        }
        return false;
    }
}
