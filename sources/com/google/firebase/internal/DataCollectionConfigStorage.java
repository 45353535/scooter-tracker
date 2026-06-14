package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

/* JADX INFO: loaded from: classes9.dex */
public class DataCollectionConfigStorage {

    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f32928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Publisher f32929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32930d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context contextA = a(context);
        this.f32927a = contextA;
        this.f32928b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f32929c = publisher;
        this.f32930d = b();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean b() {
        return this.f32928b.contains(DATA_COLLECTION_DEFAULT_ENABLED) ? this.f32928b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true) : c();
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f32927a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f32927a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void d(boolean z10) {
        if (this.f32930d != z10) {
            this.f32930d = z10;
            this.f32929c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z10)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f32930d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f32928b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                d(c());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f32928b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, zEquals).apply();
                d(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
