package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.infer.annotation.Nullsafe;
import io.appmetrica.analytics.impl.Zk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f19606a = new AtomicBoolean();

    class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f19607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19608c;

        a(Context context, String str) {
            this.f19607b = context;
            this.f19608c = str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|83|3|(3:77|4|5)|(2:75|6)|(2:65|7)|(5:69|8|(1:10)(1:85)|22|45)|13|81|14|67|18|22|45|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|83|3|77|4|5|75|6|(2:65|7)|(5:69|8|(1:10)(1:85)|22|45)|13|81|14|67|18|22|45|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0142, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0143, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x014a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x014b, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:61:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 413
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put(LogConstants.KEY_SDK, "android");
        jSONObject.put(Zk.f76763f, str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d10) {
        AtomicBoolean atomicBoolean = f19606a;
        if (atomicBoolean.get() || Math.random() >= d10) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
