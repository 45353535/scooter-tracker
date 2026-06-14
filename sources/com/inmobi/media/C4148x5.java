package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.media.C4148x5;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4148x5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f39896d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f39898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I1 f39899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pair f39901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f39902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f39903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f39905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile long f39906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Lazy f39907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy f39908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy f39909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final JSONArray f39910r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f39894b = {kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(C4148x5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(C4148x5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4148x5 f39893a = new C4148x5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f39895c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39897e = C4148x5.class.getSimpleName();

    static {
        int i10 = 15;
        f39898f = new I1(i10, new Function0() { // from class: w3.yc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C4148x5.A());
            }
        }, 12);
        f39899g = new I1(i10, new Function0() { // from class: w3.zc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C4148x5.b());
            }
        }, 8);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        f39900h = RELEASE;
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        f39901i = new Pair("d-api-lev", sb2.toString());
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        f39902j = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        f39903k = MODEL;
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        f39904l = HARDWARE;
        lf.l lVar = lf.l.f94210c;
        f39907o = lf.i.b(lVar, new Function0() { // from class: w3.ad
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4148x5.B();
            }
        });
        f39908p = lf.i.b(lVar, new Function0() { // from class: w3.bd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4148x5.c());
            }
        });
        Lazy lazyB = lf.i.b(lVar, new Function0() { // from class: w3.cd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4148x5.a();
            }
        });
        f39909q = lazyB;
        f39910r = (JSONArray) lazyB.getValue();
    }

    public static final int A() {
        Context context = Ji.f37157a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final C4098v5 B() {
        String str;
        f39893a.getClass();
        try {
            Context context = Ji.f37157a;
            if (context == null) {
                return new C4098v5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused) {
                str = null;
            }
            return new C4098v5(str, z10);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            return new C4098v5(null, false);
        }
    }

    public static void C() {
        Runnable runnable = new Runnable() { // from class: w3.xc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.D();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void D() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f39895c = availableBytes / ((long) 1048576);
        } catch (Exception e10) {
            AbstractC3779i9.a(e10);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: w3.sc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.F();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void F() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = w3.jc.a(systemService);
        Object systemService2 = context.getSystemService(C4240b4.a.f42506k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long freeBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = w3.lc.a(it.next());
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolumeA.getUuid()));
                Intrinsics.checkNotNull(uuidFromString);
                if (storageVolumeA.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManagerA.getFreeBytes(uuidFromString);
                    } catch (Exception e10) {
                        L2 l22 = new L2(e10);
                        Lazy lazy = P9.f37527a;
                        P9.a(l22);
                    }
                }
            } catch (Exception unused) {
            }
        }
        f39895c = freeBytes / ((long) 1048576);
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: w3.wc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.H();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void H() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = w3.jc.a(systemService);
        Object systemService2 = context.getSystemService(C4240b4.a.f42506k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long freeBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = w3.lc.a(it.next());
            UUID storageUuid = storageVolumeA.getStorageUuid();
            if (storageUuid != null && storageVolumeA.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerA.getFreeBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    Lazy lazy = P9.f37527a;
                    P9.a(l22);
                }
            }
        }
        f39895c = freeBytes / ((long) 1048576);
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: w3.tc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.J();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void J() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(blockCountLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            f39896d = sb2.toString();
        } catch (Exception e10) {
            AbstractC3779i9.a(e10);
        }
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: w3.uc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.L();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void L() {
        UUID uuidFromString;
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = w3.jc.a(systemService);
        Object systemService2 = context.getSystemService(C4240b4.a.f42506k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long totalBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = w3.lc.a(it.next());
            String uuid = storageVolumeA.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                Intrinsics.checkNotNull(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    Intrinsics.checkNotNull(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolumeA.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    Lazy lazy = P9.f37527a;
                    P9.a(l22);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f39896d = sb2.toString();
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: w3.vc
            @Override // java.lang.Runnable
            public final void run() {
                C4148x5.N();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void N() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = w3.jc.a(systemService);
        Object systemService2 = context.getSystemService(C4240b4.a.f42506k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long totalBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = w3.lc.a(it.next());
            UUID storageUuid = storageVolumeA.getStorageUuid();
            if (storageUuid != null && storageVolumeA.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    Lazy lazy = P9.f37527a;
                    P9.a(l22);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f39896d = sb2.toString();
    }

    public static final int b() {
        Context context = Ji.f37157a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean c() {
        f39893a.getClass();
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
            if (StringsKt.a0(lowerCase, "generic", false, 2, null) || StringsKt.a0(lowerCase, "unknown", false, 2, null) || StringsKt.g0(lowerCase2, "google_sdk", false, 2, null) || StringsKt.g0(lowerCase2, "emu", false, 2, null) || StringsKt.g0(lowerCase2, "Android SDK built for x86", false, 2, null) || StringsKt.g0(lowerCase3, "Genymotion", false, 2, null) || StringsKt.g0(lowerCase7, "sdk", false, 2, null) || StringsKt.g0(lowerCase7, "vbox86p", false, 2, null) || StringsKt.g0(lowerCase7, "emu", false, 2, null) || Intrinsics.areEqual(lowerCase6, "goldfish") || Intrinsics.areEqual(lowerCase6, "ranchu") || Intrinsics.areEqual(lowerCase6, "vbox86p") || StringsKt.g0(lowerCase6, "nox", false, 2, null)) {
                return true;
            }
            if (StringsKt.a0(lowerCase4, "generic", false, 2, null)) {
                if (StringsKt.a0(lowerCase5, "generic", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair d() {
        Context context = Ji.f37157a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static Pair e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            G();
        } else if (i10 >= 26) {
            E();
        } else {
            C();
        }
        long j10 = f39895c;
        if (j10 != -1) {
            return new Pair("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public static Pair f() {
        Context context = Ji.f37157a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        if (F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            numValueOf = Integer.valueOf((int) ((r0.getIntExtra("level", -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(numValueOf);
        return new Pair("d-bat-lev", sb2.toString());
    }

    public static Pair g() {
        Context context = Ji.f37157a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair h() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            str = "0";
        } else {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair("d-drk-m", str);
    }

    public static Pair i() {
        Context context = Ji.f37157a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Pair j() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = com.inmobi.media.Ji.f37157a
            if (r1 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            java.util.List r2 = r1.getEnabledInputMethodList()
            java.lang.String r3 = "getEnabledInputMethodList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r2.next()
            android.view.inputmethod.InputMethodInfo r3 = (android.view.inputmethod.InputMethodInfo) r3
            r4 = 1
            java.util.List r3 = r1.getEnabledInputMethodSubtypeList(r3, r4)
            java.lang.String r4 = "getEnabledInputMethodSubtypeList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r4 = r3.next()
            android.view.inputmethod.InputMethodSubtype r4 = (android.view.inputmethod.InputMethodSubtype) r4
            java.lang.String r5 = r4.getMode()
            java.lang.String r6 = "keyboard"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L3f
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L79
            java.lang.String r5 = w3.ic.a(r4)
            java.lang.String r6 = "getLanguageTag(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto L79
            java.lang.String r4 = w3.ic.a(r4)
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
            java.lang.String r4 = r4.getLanguage()
            goto L86
        L79:
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r4 = r4.getLocale()
            r5.<init>(r4)
            java.lang.String r4 = r5.getLanguage()
        L86:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.length()
            if (r5 <= 0) goto L3f
            r0.add(r4)
            goto L3f
        L93:
            kotlin.Pair r1 = new kotlin.Pair
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "d-key-lang"
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4148x5.j():kotlin.Pair");
    }

    public static String k() {
        String strValueOf;
        Context context = Ji.f37157a;
        if (context == null || !Kf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue(C4148x5.class.getSimpleName(), "getSimpleName(...)");
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    strValueOf = String.valueOf(type);
                }
                return "1";
            }
            strValueOf = type + "|" + subtype;
            return strValueOf;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (!networkCapabilities.hasTransport(1)) {
                strValueOf = networkCapabilities.hasTransport(2) ? "7" : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? Protocol.VAST_4_1 : "8";
            }
            return "1";
        }
        strValueOf = "0|" + activeNetworkInfo.getSubtype();
        return strValueOf;
    }

    public static int l() {
        String strK = k();
        if (StringsKt.a0(strK, "0", false, 2, null)) {
            return 0;
        }
        return StringsKt.a0(strK, "1", false, 2, null) ? 1 : 2;
    }

    public static final String m() {
        f39893a.getClass();
        int iL = l();
        return iL != 0 ? iL != 1 ? "NIL" : com.ironsource.X3.f42018b : com.ironsource.N6.Q0;
    }

    public static HashMap n() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        if (enabled) {
            map.put("d-t1", f39910r.toString());
            return map;
        }
        String TAG = f39897e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return map;
    }

    public static Pair o() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            M();
        } else if (i10 >= 26) {
            K();
        } else {
            I();
        }
        String str = f39896d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean u() {
        return true;
    }

    public static boolean v() {
        return true;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean y() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        I1 i12 = f39899g;
        KProperty[] kPropertyArr = f39894b;
        int iIntValue = ((Number) i12.getValue(this, kPropertyArr[1])).intValue();
        int iIntValue2 = ((Number) f39898f.getValue(this, kPropertyArr[0])).intValue();
        if (iIntValue2 > 0) {
            return (iIntValue * 100) / iIntValue2;
        }
        Intrinsics.checkNotNullExpressionValue(C4148x5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z10) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", f39900h);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", f39902j);
        map.put("d-model-name", f39903k);
        map.put("d-nettype-raw", k());
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", f39904l);
        if (System.currentTimeMillis() >= f39906n) {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) Y3.f38021a.a(SignalsConfig.class);
            f39906n = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            eg.i.d(A9.f36557c, null, null, new C4123w5(null), 3, null);
        }
        map.put("d-lowmem", String.valueOf(f39905m));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) f39908p.getValue()).booleanValue()));
        Lazy lazy2 = f39907o;
        map.put("d-ps-disabled", String.valueOf(((C4098v5) lazy2.getValue()).f39735a));
        String str = ((C4098v5) lazy2.getValue()).f39736b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(Ji.f37157a, z10)));
        return map;
    }

    public final HashMap a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z10));
            map.putAll(n());
            return map;
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue(C4148x5.class.getSimpleName(), "getSimpleName(...)");
            e10.getMessage();
            return map;
        }
    }

    public static final JSONArray a() {
        f39893a.getClass();
        Context context = Ji.f37157a;
        if (context != null) {
            try {
                C3774i4 c3774i4 = Y3.f38021a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) Y3.f38021a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "boot_time");
                Intrinsics.checkNotNullParameter("bt", C4240b4.i.W);
                JSONArray jSONArray = new JSONArray(eaA.f36783a.getString("bt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                eaA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e10) {
                Lazy lazy = P9.f37527a;
                AbstractC3779i9.a(e10);
            }
        }
        return new JSONArray();
    }
}
