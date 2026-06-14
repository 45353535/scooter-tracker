package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;

/* JADX INFO: loaded from: classes9.dex */
public class DataCollectionArbiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f32066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseApp f32067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TaskCompletionSource f32069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f32070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f32072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource f32073h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.f32068c = obj;
        this.f32069d = new TaskCompletionSource();
        this.f32070e = false;
        this.f32071f = false;
        this.f32073h = new TaskCompletionSource();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.f32067b = firebaseApp;
        this.f32066a = CommonUtils.getSharedPrefs(applicationContext);
        Boolean boolB = b();
        this.f32072g = boolB == null ? a(applicationContext) : boolB;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.f32069d.trySetResult(null);
                    this.f32070e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolE = e(context);
        if (boolE == null) {
            this.f32071f = false;
            return null;
        }
        this.f32071f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolE));
    }

    private Boolean b() {
        if (!this.f32066a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f32071f = false;
        return Boolean.valueOf(this.f32066a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean c() {
        try {
            return this.f32067b.isDataCollectionDefaultEnabled();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void d(boolean z10) {
        Logger.getLogger().d(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f32072g == null ? "global Firebase setting" : this.f32071f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.getLogger().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    private static void f(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void grantDataCollectionPermission(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f32073h.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f32072g;
            zBooleanValue = bool != null ? bool.booleanValue() : c();
            d(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@Nullable Boolean bool) {
        if (bool != null) {
            try {
                this.f32071f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32072g = bool != null ? bool : a(this.f32067b.getApplicationContext());
        f(this.f32066a, bool);
        synchronized (this.f32068c) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.f32070e) {
                        this.f32069d.trySetResult(null);
                        this.f32070e = true;
                    }
                } else if (this.f32070e) {
                    this.f32069d = new TaskCompletionSource();
                    this.f32070e = false;
                }
            } finally {
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.f32068c) {
            task = this.f32069d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return CrashlyticsTasks.race(this.f32073h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
