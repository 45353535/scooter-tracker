package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.android.core.c1;
import io.sentry.g7;
import io.sentry.n0;
import io.sentry.protocol.e;
import io.sentry.util.runtime.a;
import io.sentry.v7;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile l1 f82647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f82648j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f82649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f82650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f82651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f82652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1.a f82653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1.b f82654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.n f82655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f82656h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82657a;

        static {
            int[] iArr = new int[n0.a.values().length];
            f82657a = iArr;
            try {
                iArr[n0.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82657a[n0.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public l1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f82649a = context;
        this.f82650b = sentryAndroidOptions;
        w0 w0Var = new w0(sentryAndroidOptions.getLogger());
        this.f82651c = w0Var;
        io.sentry.android.core.internal.util.n.a().c();
        this.f82655g = w();
        this.f82652d = w0Var.f();
        this.f82653e = c1.u(context, sentryAndroidOptions.getLogger(), w0Var);
        this.f82654f = c1.v(context, w0Var);
        ActivityManager.MemoryInfo memoryInfoM = c1.m(context, sentryAndroidOptions.getLogger());
        if (memoryInfoM != null) {
            this.f82656h = Long.valueOf(memoryInfoM.totalMem);
        } else {
            this.f82656h = null;
        }
    }

    public static /* synthetic */ void b(l1 l1Var, io.sentry.protocol.e eVar) {
        File externalFilesDir = l1Var.f82649a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.s0(l1Var.r(statFs));
            eVar.b0(l1Var.u(statFs));
        }
        StatFs statFsJ = l1Var.j(externalFilesDir);
        if (statFsJ != null) {
            eVar.Y(l1Var.q(statFsJ));
            eVar.X(l1Var.t(statFsJ));
        }
    }

    private Intent d() {
        return c1.t(this.f82649a, this.f82651c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public static Float e(Intent intent, v7 v7Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    private Date g() {
        try {
            return io.sentry.l.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f82650b.getLogger().b(g7.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String h() {
        try {
            return (String) this.f82650b.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.k1
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return p1.a(this.f82624a.f82649a);
                }
            });
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private File i(File file) {
        File[] externalFilesDirs = this.f82649a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f82650b.getLogger().c(g7.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs j(File file) {
        try {
            File fileI = i(file);
            if (fileI != null) {
                return new StatFs(fileI.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f82650b.getLogger().c(g7.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static l1 k(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f82647i == null) {
            io.sentry.g1 g1VarD = f82648j.d();
            try {
                if (f82647i == null) {
                    f82647i = new l1(c1.f(context), sentryAndroidOptions);
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f82647i;
    }

    private e.b m() {
        e.b bVarA;
        Throwable th2;
        try {
            bVarA = io.sentry.android.core.internal.util.p.a(this.f82649a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f82650b.getLogger().c(g7.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                this.f82650b.getLogger().a(g7.ERROR, "Error getting device orientation.", th2);
                return bVarA;
            }
        } catch (Throwable th4) {
            bVarA = null;
            th2 = th4;
        }
    }

    private TimeZone p() {
        if (this.f82651c.d() >= 24) {
            LocaleList locales = this.f82649a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long q(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    private Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    private Long t(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    private Long u(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f82650b.getLogger().a(g7.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    public static Boolean v(Intent intent, v7 v7Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    private io.sentry.protocol.n w() {
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.j("Android");
        nVar.m(Build.VERSION.RELEASE);
        nVar.h(Build.DISPLAY);
        String strL = c1.l(this.f82650b.getLogger());
        if (strL != null) {
            nVar.i(strL);
        }
        if (this.f82650b.isEnableRootCheck()) {
            nVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.u(this.f82649a, this.f82651c, this.f82650b.getLogger()).e()));
        }
        return nVar;
    }

    private void x(final io.sentry.protocol.e eVar, boolean z10) {
        Intent intentD = d();
        if (intentD != null) {
            eVar.Q(e(intentD, this.f82650b));
            eVar.U(v(intentD, this.f82650b));
            eVar.R(f(intentD));
        }
        int i10 = a.f82657a[this.f82650b.getConnectionStatusProvider().A().ordinal()];
        eVar.j0(i10 != 1 ? i10 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo memoryInfoM = c1.m(this.f82649a, this.f82650b.getLogger());
        if (memoryInfoM != null && z10) {
            eVar.a0(Long.valueOf(memoryInfoM.availMem));
            eVar.e0(Boolean.valueOf(memoryInfoM.lowMemory));
        }
        this.f82650b.getRuntimeManager().b(new Runnable() { // from class: io.sentry.android.core.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.b(this.f82618b, eVar);
            }
        });
        if (eVar.I() == null) {
            eVar.W(this.f82650b.getConnectionStatusProvider().getConnectionType());
        }
    }

    public io.sentry.protocol.e c(boolean z10, boolean z11) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.f0(Build.MANUFACTURER);
        eVar.T(Build.BRAND);
        eVar.Z(c1.k(this.f82650b.getLogger()));
        eVar.h0(Build.MODEL);
        eVar.i0(Build.ID);
        eVar.P(c1.i());
        if (this.f82651c.d() >= 31) {
            eVar.V(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        eVar.k0(m());
        Boolean bool = this.f82652d;
        if (bool != null) {
            eVar.r0(bool);
        }
        DisplayMetrics displayMetricsJ = c1.j(this.f82649a, this.f82650b.getLogger());
        if (displayMetricsJ != null) {
            eVar.q0(Integer.valueOf(displayMetricsJ.widthPixels));
            eVar.p0(Integer.valueOf(displayMetricsJ.heightPixels));
            eVar.n0(Float.valueOf(displayMetricsJ.density));
            eVar.o0(Integer.valueOf(displayMetricsJ.densityDpi));
        }
        eVar.S(g());
        eVar.t0(p());
        if (eVar.L() == null) {
            eVar.c0(h());
        }
        Locale locale = Locale.getDefault();
        if (eVar.M() == null) {
            eVar.d0(locale.toString());
        }
        List listC = io.sentry.android.core.internal.util.n.a().c();
        if (!listC.isEmpty()) {
            eVar.m0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.l0(Integer.valueOf(listC.size()));
        }
        eVar.g0(this.f82656h);
        if (z10 && this.f82650b.isCollectAdditionalContext()) {
            x(eVar, z11);
        }
        return eVar;
    }

    public io.sentry.protocol.n l() {
        return this.f82655g;
    }

    public c1.a n() {
        return this.f82653e;
    }

    public c1.b o() {
        return this.f82654f;
    }

    public Long s() {
        return this.f82656h;
    }
}
