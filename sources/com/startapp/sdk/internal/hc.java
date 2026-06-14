package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f64627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f64628d;

    public hc(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f64626b = true;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(applicationContext.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNull(applicationInfo);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    String string = obj != null ? obj.toString() : null;
                    this.f64625a = string;
                    if (string != null) {
                        Log.i("StartAppSDK", "appId is " + string);
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                        this.f64626b = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        Boolean boolValueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        this.f64627c = boolValueOf;
                        Log.i("StartAppSDK", "is mixed audience: " + boolValueOf);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        Boolean boolValueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        this.f64628d = boolValueOf2;
                        Log.i("StartAppSDK", "is child directed: " + boolValueOf2);
                    }
                    Unit unit = Unit.f93236a;
                }
            } catch (Throwable th2) {
                g9.a(th2);
                Unit unit2 = Unit.f93236a;
            }
        }
    }
}
