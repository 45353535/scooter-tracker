package com.appodeal.consent.networking;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.appodeal.consent.ConsentUpdateRequestParameters;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentUpdateRequestParameters f15511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.consent.cache.i f15512c;

    public k(Context context, ConsentUpdateRequestParameters parameters, com.appodeal.consent.cache.i privacyPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        this.f15510a = context;
        this.f15511b = parameters;
        this.f15512c = privacyPreferences;
    }

    public static String b(Context context) {
        Object objB;
        Object obj = null;
        try {
            Result.Companion companion = Result.f93230c;
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNull(applicationInfo);
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            com.appodeal.consent.logger.a.b("APPLICATION_ID found: " + string, null);
            objB = Result.b(string);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG == null) {
            obj = objB;
        } else {
            com.appodeal.consent.logger.a.b("Failed to load meta-data, APPLICATION_ID is null", thG);
        }
        return (String) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0259, code lost:
    
        if (r1 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0259 -> B:51:0x025c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x026f -> B:52:0x025e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.networking.k.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
