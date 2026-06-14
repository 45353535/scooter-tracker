package h1;

import com.taurusx.tax.w.s.w;
import java.net.URL;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    public static final class EnumC0890a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0890a f72848c = new EnumC0890a("CONFIG", 0, "/api/config");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0890a f72849d = new EnumC0890a("INSTALL", 1, "/api/install");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0890a f72850e = new EnumC0890a("PREFETCH", 2, "/webview/v2/prefetch");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final EnumC0890a f72851f = new EnumC0890a("INTERSTITIAL_GET", 3, "/webview/v2/interstitial/get");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0890a f72852g = new EnumC0890a("INTERSTITIAL_SHOW", 4, "/interstitial/show");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0890a f72853h = new EnumC0890a("REWARDED_GET", 5, "/webview/v2/reward/get");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final EnumC0890a f72854i = new EnumC0890a("REWARDED_SHOW", 6, "/reward/show");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final EnumC0890a f72855j = new EnumC0890a("BANNER_GET", 7, "/auction/sdk/banner");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final EnumC0890a f72856k = new EnumC0890a("BANNER_SHOW", 8, "/banner/show");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final EnumC0890a f72857l = new EnumC0890a(w.f67535o, 9, "/api/click");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final EnumC0890a f72858m = new EnumC0890a("VIDEO_COMPLETE", 10, "/api/video-complete");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ EnumC0890a[] f72859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f72860o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72861b;

        static {
            EnumC0890a[] enumC0890aArrD = d();
            f72859n = enumC0890aArrD;
            f72860o = qf.a.a(enumC0890aArrD);
        }

        public EnumC0890a(String str, int i10, String str2) {
            this.f72861b = str2;
        }

        public static final /* synthetic */ EnumC0890a[] d() {
            return new EnumC0890a[]{f72848c, f72849d, f72850e, f72851f, f72852g, f72853h, f72854i, f72855j, f72856k, f72857l, f72858m};
        }

        public static EnumC0890a valueOf(String str) {
            return (EnumC0890a) Enum.valueOf(EnumC0890a.class, str);
        }

        public static EnumC0890a[] values() {
            return (EnumC0890a[]) f72859n.clone();
        }

        public final String g() {
            return this.f72861b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f72862c = new b("AD_GET", 0, "live.chartboost.com");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f72863d = new b("DA", 1, "da.chartboost.com");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f72864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f72865f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72866b;

        static {
            b[] bVarArrD = d();
            f72864e = bVarArrD;
            f72865f = qf.a.a(bVarArrD);
        }

        public b(String str, int i10, String str2) {
            this.f72866b = str2;
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f72862c, f72863d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f72864e.clone();
        }

        public final String g() {
            return this.f72866b;
        }
    }

    URL a(EnumC0890a enumC0890a);
}
