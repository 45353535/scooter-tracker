package com.appodeal.ads.utils.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.appodeal.ads.context.o;
import com.appodeal.ads.db;
import com.appodeal.ads.h2;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.segments.s0;
import com.appodeal.ads.storage.e0;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.session.e;
import com.appodeal.ads.utils.session.f;
import com.appodeal.ads.utils.session.g;
import com.appodeal.ads.utils.session.r;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ApplicationData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f14961g = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14962a = i.a(new Function0() { // from class: com.appodeal.ads.utils.app.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14963b = i.a(new Function0() { // from class: com.appodeal.ads.utils.app.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.b();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PackageInfo f14964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14967f;

    public static final e0 a() {
        return e0.f14799b;
    }

    public static final r b() {
        return r.f15109b;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getFrameworkName() {
        return h2.f13372f;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getFrameworkVersion() {
        return h2.f13374h;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getInstallerPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f14967f;
        if (str == null) {
            str = null;
            try {
                PackageInfo packageInfo = getPackageInfo(context);
                String installingPackageName = packageInfo != null ? Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(packageInfo.packageName).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(packageInfo.packageName) : null;
                this.f14967f = installingPackageName;
                return installingPackageName;
            } catch (Throwable th2) {
                Log.log(th2);
            }
        }
        return str;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getLastResumedActivityName() {
        Activity resumedActivity = o.f13205b.getResumedActivity();
        if (resumedActivity != null) {
            return resumedActivity.getClass().getName();
        }
        return null;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final PackageInfo getPackageInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = this.f14964c;
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return context.getPackageManager().getPackageInfo(getPackageName(context), PackageManager.PackageInfoFlags.of(0L));
            }
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(getPackageName(context), 0);
            this.f14964c = packageInfo2;
            return packageInfo2;
        } catch (Throwable th2) {
            Log.log(LogConstants.KEY_SDK, "PackageInfo", "Failed to receive PackageInfo: " + th2.getMessage());
            return null;
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f14965d;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        this.f14965d = packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "also(...)");
        return packageName;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getPluginVersion() {
        return h2.f13373g;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getSdkKey() {
        return ((com.appodeal.ads.storage.c) this.f14962a.getValue()).c();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getSdkVersion() {
        boolean z10 = h2.f13367a;
        return Constants.SDK_VERSION;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final long getSegmentId() {
        return s0.g().f14483a;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.SessionData
    public final String getSessionUuid() {
        e eVar;
        f fVarF = ((g) this.f14963b.getValue()).f();
        if (fVarF == null || (eVar = fVarF.f15074b) == null) {
            return null;
        }
        return eVar.f15065b;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getTargetSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f14966e;
        if (str != null) {
            return str;
        }
        String strValueOf = String.valueOf(context.getApplicationInfo().targetSdkVersion);
        this.f14966e = strValueOf;
        return strValueOf;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.SessionData
    public final long getUptime() {
        f fVarF = ((g) this.f14963b.getValue()).f();
        if (fVarF != null) {
            e eVar = fVarF.f15074b;
            jCurrentTimeMillis = (eVar.f15070g != 0 ? System.currentTimeMillis() - fVarF.f15074b.f15070g : 0L) + eVar.f15068e;
        }
        return jCurrentTimeMillis / ((long) 1000);
    }

    @Override // com.appodeal.ads.modules.common.internal.data.SessionData
    public final long getUptimeMono() {
        f fVarF = ((g) this.f14963b.getValue()).f();
        if (fVarF == null) {
            return 0L;
        }
        e eVar = fVarF.f15074b;
        return (eVar.f15071h != 0 ? SystemClock.elapsedRealtime() - fVarF.f15074b.f15071h : 0L) + eVar.f15069f;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final int getVersionCode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final String getVersionName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final boolean isAppodealInitialized() {
        return h2.f13368b;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final boolean isAppodealInitializing() {
        return h2.f13367a;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.ApplicationData
    public final boolean isTestMode() {
        return db.e();
    }
}
