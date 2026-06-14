package f1;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pa f70777a = new pa();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f70778c = new a("BUILTIN_SPEAKER", 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f70779d = new a("WIRED_HEADPHONES", 1, 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f70780e = new a("BLUETOOTH_A2DP", 2, 2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70781f = new a(NativeAdContent.ViewTag.OTHER, 3, 3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f70782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f70783h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70784b;

        static {
            a[] aVarArrD = d();
            f70782g = aVarArrD;
            f70783h = qf.a.a(aVarArrD);
        }

        public a(String str, int i10, int i11) {
            this.f70784b = i11;
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f70778c, f70779d, f70780e, f70781f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f70782g.clone();
        }

        public final int g() {
            return this.f70784b;
        }
    }

    public final int a(Application application) {
        try {
            if (application == null) {
                return a.f70781f.g();
            }
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return g((AudioManager) systemService);
        } catch (Exception e10) {
            eg.d("Cannot create environment audio output for tracking", e10);
            return a.f70781f.g();
        }
    }

    public final long b() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e10) {
            eg.d("Cannot create environment runtime for tracking", e10);
            return -1L;
        }
    }

    public final fb c(kf kfVar, jd jdVar, String str, g0 privacyApi, String str2) {
        String strC;
        String string;
        String string2;
        String string3;
        String string4;
        Object consent;
        Object consent2;
        Object consent3;
        Object consent4;
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        yb ybVar = yb.f71635a;
        if (!ybVar.q()) {
            eg.j("EnvironmentManager not initialized. Call EnvironmentManager.init() first.", null, 2, null);
            return new fb(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
        Application applicationE = ybVar.e();
        b bVarH = h(applicationE);
        String strD = d(applicationE);
        long jI = i(applicationE);
        long jB = b();
        int iF = f(applicationE);
        boolean zJ = j(applicationE);
        int iA = a(applicationE);
        if (jdVar == null || (strC = jdVar.c()) == null) {
            strC = "session not ready";
        }
        String str3 = strC;
        int iF2 = jdVar != null ? jdVar.f() : -1;
        String str4 = str2 == null ? "App was not init yet" : str2;
        String strD2 = ybVar.d();
        j1.d dVarB = privacyApi.b("gdpr");
        if (dVarB == null || (consent4 = dVarB.getConsent()) == null || (string = consent4.toString()) == null) {
            string = "gdpr not available";
        }
        String str5 = string;
        j1.d dVarB2 = privacyApi.b(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY);
        if (dVarB2 == null || (consent3 = dVarB2.getConsent()) == null || (string2 = consent3.toString()) == null) {
            string2 = "ccpa not available";
        }
        String str6 = string2;
        j1.d dVarB3 = privacyApi.b("coppa");
        if (dVarB3 == null || (consent2 = dVarB3.getConsent()) == null || (string3 = consent2.toString()) == null) {
            string3 = "coppa not available";
        }
        String str7 = string3;
        j1.d dVarB4 = privacyApi.b("lgpd");
        if (dVarB4 == null || (consent = dVarB4.getConsent()) == null || (string4 = consent.toString()) == null) {
            string4 = "lgpd not available";
        }
        return new fb(str3, iF2, str4, strD2, "9.10.2", false, str5, str6, str7, string4, e(kfVar), ybVar.i(), ybVar.j(), ybVar.k(), ybVar.l(), ybVar.f(), ybVar.h(), ybVar.m(), str == null ? "connection type not provided" : str, strD, bVarH.a(), bVarH.b(), iF, zJ, iA, jI, jB, jdVar != null ? jdVar.d() : 0, jdVar != null ? jdVar.e() : 0, jdVar != null ? jdVar.a() : 0, jdVar != null ? jdVar.b() : -1L, SystemClock.uptimeMillis());
    }

    public final String d(Context context) {
        try {
            r2 r2VarN = yb.f71635a.n();
            if (r2VarN != null) {
                String strF = ea.f(context, r2VarN);
                if (strF != null) {
                    return strF;
                }
            }
            return "Cannot retrieve orientation";
        } catch (Exception e10) {
            eg.d("Cannot retrieve orientation", e10);
            return "Cannot retrieve orientation";
        }
    }

    public final String e(kf kfVar) {
        String strG = yb.f71635a.g();
        if (!Intrinsics.areEqual(strG, "unknown")) {
            return strG;
        }
        if (kfVar != null) {
            String strA = kfVar.a();
            if (strA == null) {
                strA = kfVar.g();
            }
            if (strA != null) {
                return strA;
            }
        }
        return "unknown";
    }

    public final int f(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (int) ((streamVolume / streamMaxVolume) * 100);
            }
            return -1;
        } catch (Exception e10) {
            eg.d("Cannot create environment audio for tracking", e10);
            return -1;
        }
    }

    public final int g(AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        if (devices.length == 0) {
            return a.f70781f.g();
        }
        AudioDeviceInfo audioDeviceInfo = devices[0];
        Intrinsics.checkNotNullExpressionValue(audioDeviceInfo, "get(...)");
        int type = audioDeviceInfo.getType();
        return type != 2 ? type != 4 ? type != 8 ? a.f70781f.g() : a.f70780e.g() : a.f70779d.g() : a.f70778c.g();
    }

    public final b h(Application application) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 3;
        int i11 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        try {
            if (application == null) {
                return new b(i11, b12 == true ? 1 : 0, i10, defaultConstructorMarker);
            }
            Object systemService = application.getSystemService("batterymanager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            BatteryManager batteryManager = (BatteryManager) systemService;
            return new b(batteryManager.getIntProperty(4), batteryManager.isCharging());
        } catch (Exception e10) {
            eg.d("Cannot create environment device battery for tracking", e10);
            return new b(b11 == true ? 1 : 0, b10 == true ? 1 : 0, i10, defaultConstructorMarker);
        }
    }

    public final long i(Application application) {
        if (application == null) {
            return -1L;
        }
        try {
            return new StatFs(application.getCacheDir() + "/.chartboost").getAvailableBytes();
        } catch (Exception e10) {
            eg.d("Cannot create environment device storage for tracking", e10);
            return -1L;
        }
    }

    public final boolean j(Application application) {
        if (application == null) {
            return false;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getRingerMode() != 2;
        } catch (Exception e10) {
            eg.d("Cannot create environment audio for tracking", e10);
            return false;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f70786b;

        public b(int i10, boolean z10) {
            this.f70785a = i10;
            this.f70786b = z10;
        }

        public final int a() {
            return this.f70785a;
        }

        public final boolean b() {
            return this.f70786b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f70785a == bVar.f70785a && this.f70786b == bVar.f70786b;
        }

        public int hashCode() {
            return (this.f70785a * 31) + androidx.compose.foundation.c.a(this.f70786b);
        }

        public String toString() {
            return "DeviceBattery(batteryLevel=" + this.f70785a + ", isCharging=" + this.f70786b + ")";
        }

        public /* synthetic */ b(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
