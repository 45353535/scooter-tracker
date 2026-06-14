package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.content.ContextCompat;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.inmobi.Omid;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Yk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f38072b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Yk f38071a = new Yk();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Sk f38073c = new Sk();

    public static boolean a() {
        int i10;
        try {
            kotlin.jvm.internal.v0.b(hh.x.class).getSimpleName();
            i10 = 0;
        } catch (NoClassDefFoundError e10) {
            Log.d("Yk", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e10);
            i10 = 1;
        }
        try {
            kotlin.jvm.internal.v0.b(vh.g.class).getSimpleName();
        } catch (NoClassDefFoundError e11) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e11);
        }
        try {
            kotlin.jvm.internal.v0.b(CoroutineScope.class).getSimpleName();
        } catch (NoClassDefFoundError e12) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e12);
        }
        try {
            kotlin.jvm.internal.v0.b(eg.o0.class).getSimpleName();
        } catch (NoClassDefFoundError e13) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e13);
        }
        try {
            kotlin.jvm.internal.v0.b(AdvertisingIdClient.class).getSimpleName();
        } catch (NoClassDefFoundError e14) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e14);
        }
        try {
            kotlin.jvm.internal.v0.b(ContextCompat.class).getSimpleName();
        } catch (NoClassDefFoundError e15) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e15);
        }
        try {
            kotlin.jvm.internal.v0.b(EnumEntries.class).getSimpleName();
        } catch (NoClassDefFoundError e16) {
            i10++;
            Log.d("Yk", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e16);
        }
        try {
            kotlin.jvm.internal.v0.b(CustomTabsClient.class).getSimpleName();
        } catch (NoClassDefFoundError e17) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e17);
        }
        try {
            kotlin.jvm.internal.v0.b(Omid.class).getSimpleName();
        } catch (NoClassDefFoundError e18) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e18);
        }
        if (i10 > 0) {
            Log.d("Yk", "Total no missing dependencies = " + i10);
        }
        return i10 > 0;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter(ADJPConstants.KEY_SDK_VERSION, C4240b4.i.W);
        if (eaA.f36783a.getString(ADJPConstants.KEY_SDK_VERSION, null) == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Ea eaA2 = Da.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter(ADJPConstants.KEY_SDK_VERSION, C4240b4.i.W);
        return !Intrinsics.areEqual(eaA2.f36783a.getString(ADJPConstants.KEY_SDK_VERSION, null), "11.1.0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r8.a(r2) != r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (b(context)) {
                T6.a(context);
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea.a(Da.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = Ji.f37157a;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Ji.a(applicationContext);
            }
        } catch (Exception e10) {
            Log.d("Yk", "Error in cleaning cache directory", e10);
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r7.b(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
